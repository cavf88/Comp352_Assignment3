
public class FlexHeap extends BinaryTree {
	
	private boolean minHeap;

	public FlexHeap()
	{
		super();
		minHeap = true;
	}
	public void insert(int key, char value) 
	{
		Node p = new Node(key, value);
		super.insert(p);//inserts the node in the binaryTree and if it's not root, then check for possible upheaps
		if(super.getCount() > 1)
		{
			upheap(p);
		}
	}
	public Node remove()
	{
		Node auxN = getTree()[1];//get the node on top of the tree
		replace(getTree()[1], getTree()[getCount()]);//replace the most left node with the top of the tree
		getTree()[getCount()] = null;//erase the most left node
		if(super.getCount() > 1)//if the size of the tree is greater than 1, then check for possible downheaps
			downheap(getTree()[1]);
		setCount(getCount()-1);//reduce the counter of the binary tree
		return auxN;
	}
	private void upheap(Node p)
	{
		if(minHeap)
		{
			while(parent(p) != null)//swap the values of the parent node and p if it's the case
			{
				if(parent(p).getKey() <= p.getKey())
					break;
				else
					p = this.swap(parent(p), p);
			}
		}
		else
		{
			while(parent(p) != null)
			{
				if(parent(p).getKey() >= p.getKey())
					break;
				else
					p = this.swap(parent(p), p);
			}
		}
	}
	private void downheap(Node p)
	{
		while(isInternal(p))
		{
			Node aux =  null;
			if(!hasRight(p))//if there isn't a right child, then take the child on the left
				aux = left(p);
			else
			{
				if(minHeap)//if there is a child on the right, then compare to see which child to take, either the right one or left.
				{
					if(right(p).getKey() <= left(p).getKey())
						aux = right(p);
					else
						aux = left(p);
				}
				else
				{
					if(right(p).getKey() >= left(p).getKey())
						aux = right(p);
					else
						aux = left(p);
				}
			}//if it's the case then swap the values from parent, p, and child, aux.
			if(minHeap)
			{
				if(aux.getKey() <= p.getKey())
					p = this.swap(aux, p);
			}
			else
			{
				if(aux.getKey() >= p.getKey())
					p = this.swap(aux, p);
			}
		}
	}
	private Node swap(Node p, Node e)
	{
		Node auxN = super.replace(p, e);
		super.replace(e, auxN);
		return p;
	}
	public void toggleHeap()
	{
		if(minHeap)
			this.switchMaxHeap();
		else 
			this.switchMinHeap();
	}
	public void switchMinHeap()
	{//create a new FlexHeap and go from the end of the array to the start filling the new FlexHeap with the nodes from the old array, then replace the old array with the new one.
		minHeap = true;
		FlexHeap auxFlexHeap = new FlexHeap();
		auxFlexHeap.minHeap = minHeap;
		for(int i = getCount(); i > 0; i--)
			auxFlexHeap.insert(getTree()[i].getKey(), getTree()[i].getValue());
		super.setTree(auxFlexHeap.getTree());
	}
	public void switchMaxHeap()
	{//create a new FlexHeap and go from the end of the array to the start filling the new FlexHeap with the nodes from the old array, then replace the old array with the new one.
		minHeap = false;
		FlexHeap auxFlexHeap = new FlexHeap();
		auxFlexHeap.minHeap = minHeap;
		for(int i = getCount(); i > 0; i--)
			auxFlexHeap.insert(getTree()[i].getKey(), getTree()[i].getValue());
		super.setTree(auxFlexHeap.getTree());
			
	}
}

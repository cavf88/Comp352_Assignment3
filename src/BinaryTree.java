
public class BinaryTree {
	
	private Node tree[];
	private int count;
	private int max;
	
	//Creator
	public BinaryTree()
	{
		max = 10;
		tree = new Node[max];
		count = 0;
	}
	
	//Properties of Tree
	public int size(){return count;}
	public boolean isEmpty(){return  (count == 0) ?true:false;}
	
	//Node properties of Tree
	public Node root(){return (count == 0) ?null:tree[1];}
	public Node element(int pos){return tree[pos];}
	public Node parent(Node p)
	{
		if(count == 0 || count == 1)
			return null;
		if(p.getRank()%2 == 0)
			return tree[p.getRank()/2];
		else
			return tree[(p.getRank()-1)/2];
	}
	
	//Boolean properties of Tree
	public boolean isInternal(Node p)
	{
		if(count  == 0 || count  == 1)
			return false;
		if(tree[p.getLeft()] != null || tree[p.getRight()] != null)
			return true;
		return false;
	}
	public boolean isExternal(Node p)
	{
		if(count == 0)
			return false;
		if(tree[p.getLeft()] == null && tree[p.getRight()] ==  null)
			return true;
		return false;
	}
	public boolean isRoot(Node p)
	{
		if(count == 0 )
			return false;
		return tree[1].equals(p);
	}
	
	//update/insert method
	public void insert(Node p)
	{
			count++;//raise the counter by one
			p.setRank(count);//set the rank of the Node p
			tree[count] = p;//insert the node in the array
			if(count * 2 >= max)//if count > max, then create a new array with double the size of the old array and fill it up with the values of the old array.
			{
				max *= 2;
				Node auxTree[] = new Node[max];
				for(int i = 1; i <= count; i++)
					auxTree[i] = tree[i];
				this.tree = auxTree;
			}
	}
	public Node replace(Node p, Node e)
	{
		if(count  == 0)
			return null;
		if(count > 0)
		{
			Node auxN =  new Node(p.getKey(),p.getValue());
			auxN.setRank(p.getRank());
			p.setValue(e.getValue());
			p.setKey(e.getKey());
			return auxN;
		}
		return null;
	}
	
	//Binary Tree properties
	public Node left(Node p)
	{
		if(count == 0 || count == 1)
			return null;
		else
			return tree[p.getLeft()];
	}
	public Node right(Node p)
	{
		if(count == 0 || count == 1)
			return null;
		else
			return tree[p.getRight()];
	}
	public boolean hasLeft(Node p)
	{
		if(count == 0 || count == 1)
			return false;
		if(tree[p.getLeft()] != null)
			return true;
		return false;
	}
	public boolean hasRight(Node p)
	{
		if(count == 0 || count == 1)
			return false;
		if(tree[p.getRight()] != null)
			return true;
		return false;
	}

	//setter and getter
	public Node[] getTree(){return tree;}
	public int getCount(){return count;}
	public int getMax(){return max;}
	
	public void setTree(Node[] oTree){tree = oTree;}
	public void setMax(int oMax){max =  oMax;}
	public void setCount(){count++;}
	public void setCount(int oCount){count = oCount;}
	
}

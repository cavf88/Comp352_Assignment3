
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
		super.insert(p);
		if(super.getCount() > 1)
		{
			if(minHeap)
			{
				while(super.parent(p) != null)
				{
					if(super.parent(p).getKey() <= p.getKey())
						break;
					else
						p = this.upheap(super.parent(p), p);
				}
			}
			else
			{
				while(super.parent(p) != null)
				{
					if(super.parent(p).getKey() >= p.getKey())
						break;
					else
						p = this.upheap(super.parent(p), p);
				}
			}
		}
	}
	private Node upheap(Node p, Node e)
	{
		Node auxN = super.replace(p, e);
		super.replace(e, auxN);
		return p;
	}
	private Node downheap(Node p, Node e){return null;}
	public Node remove()
	{
		return null;
	}
	public void toggleHeap()
	{
		if(minHeap)
			this.switchMaxHeap();
		else 
			this.switchMinHeap();
	}
	public void switchMinHeap(){minHeap = true;}
	public void switchMaxHeap(){minHeap = false;}
	
	
}

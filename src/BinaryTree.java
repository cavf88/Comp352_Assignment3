
public class BinaryTree {
	
	private Node tree[];
	private int count;
	final private int max = 10;
	
	//Creator
	public BinaryTree()
	{
		tree = new Node[max];
		count = 0;
	}
	
	//Properties of Tree
	public int size(){return tree.length;}
	public boolean isEmpty(){return  (count == 0) ?true:false;}
	
	//Node properties of Tree
	public Node root(){return (count == 0) ?tree[1]:null;}
	public Node element(int pos){return null;}
	public Node parent(Node p){return null;}
	public Node[] children(Node p){return null;}
	
	//Boolean properties of Tree
	public boolean isInternal(Node p){return false;}
	public boolean isExternal(Node p){return false;}
	public boolean isRoot(Node p){return false;}
	
	//update method
	public void replace(Node p, Node e){}
	
	//Binary Tree properties
	public Node left(Node p){return null;}
	public Node right(Node p){return null;}
	public boolean hasLeft(Node p){return false;}
	public boolean hasRight(Node p){return false;}

}

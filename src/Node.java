
public class Node {
	
	private char value;
	private int key;
	private int rank;
	private int left;
	private int right;
	
	public Node()
	{
		//this.value;
		//this.rank = -1;
	}
	public Node(int key, char value)
	{
		this.value = value;
		this.key = key;
		this.rank = 0;
		this.left = 0;
		this.right = 0;
	}
	
	public char getValue(){return value;}
	public int getKey(){return key;}
	public int getRank(){return rank;}
	public int getLeft(){return left;}
	public int getRight(){return right;}
	
	public void setValue(char value){this.value = value;}
	public void setKey(int key){this.key = key;}
	public void setRank(int rank)
	{
		this.rank =  rank;
		this.left = rank*2;
		this.right = (rank*2) + 1;
	}
	public boolean equals(Object otherN)
	{
		if(otherN == null)
			return false;
		
		if(this.getClass() == otherN.getClass())
		{
			Node auxN = (Node)otherN;
			if(this.value ==  auxN.value && this.key == auxN.key && this.rank ==  auxN.rank)
				return true;
		}
		return false;
	}
	public String ToString(){return "key: " + this.key + ", value: " + this.value;}
}

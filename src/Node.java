
public class Node {
	
	private int value;
	private int rank;
	
	public Node()
	{
		this.value = -1;
		this.rank = -1;
	}
	public Node(int rank, int value)
	{
		this.value = value;
		this.rank = rank;
	}
	
	public int getValue(){return value;}
	public int getRank(){return rank;}
	public void setValue(int value){this.value = value;}
	public void setRank(int rank){this.rank =  rank;}

}


public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree myTree = new BinaryTree();
		myTree.insert(new Node(51, 'a'));
		myTree.insert(new Node(12, 'z'));
		myTree.insert(new Node(2, '1'));
		myTree.insert(new Node(41, '5'));
		myTree.insert(new Node(6, '7'));
		myTree.insert(new Node(10, '+'));
		myTree.insert(new Node(22, '='));
		
		FlexHeap flex =  new FlexHeap();
		flex.insert(10,'a');
		flex.insert(8,'b');
		flex.insert(6,'c');
		flex.insert(3,'d');
		flex.insert(18,'x');
		flex.insert(2,'h');
		flex.insert(15,'h');
		flex.insert(10,'z');
		flex.insert(1,'y');
		flex.remove();
		flex.switchMaxHeap();
		flex.remove();
		flex.remove();
		flex.insert(12,'+');
		flex.insert(16,'x');
		flex.insert(24,'|');
		flex.insert(5,'/');
		flex.insert(17,'_');
		flex.insert(3,'&');
		flex.switchMinHeap();
		flex.remove();
		flex.remove();
		flex.remove();
		flex.remove();
		flex.toggleHeap();
		flex.toggleHeap();
	}

}

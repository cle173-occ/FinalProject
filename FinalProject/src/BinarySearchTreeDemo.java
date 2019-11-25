
public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(4);
		tree.add(3);
		tree.add(2);
		tree.add(6);
		tree.add(5);
		tree.add(7);
		
		
		
		tree.iPrint();
		//tree.prePrint();
		//tree.postPrint();
		System.out.println(tree.find(6));
	}

}

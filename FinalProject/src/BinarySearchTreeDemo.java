import javax.swing.JFrame;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {		
/*	    
		Frame frame = new Frame();
		frame.setTitle("Binary Search Tree");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
*/		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(4);
		tree.add(6);
		tree.add(2);
		tree.add(8);
		
		tree.iPrint();
		tree.postPrint();
		tree.prePrint();
		
		tree.getPath(3);
	}
}

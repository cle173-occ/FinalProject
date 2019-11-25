import javax.swing.JFrame;

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
		tree.prePrint();
		tree.postPrint();
		
		tree.find(3);
		
		JFrame frame = new Frame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

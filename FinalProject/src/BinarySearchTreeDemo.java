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
		
		tree.prePrint();
		
		System.out.println("Path to node with data 5: " + tree.getPath(5));
		System.out.println("Path to node with data 3: " + tree.getPath(3));
		System.out.println("Path to node with data 7: " + tree.getPath(7));
		System.out.println("Path to node with data 4: " + tree.getPath(4));
		System.out.println("Path to node with data 6: " + tree.getPath(6));
		System.out.println("Path to node with data 2: " + tree.getPath(2));
		System.out.println("Path to node with data 8: " + tree.getPath(8));
		
		System.out.println();
		
		System.out.println("Depth of node with data 5: " + tree.getDepth(5));
		System.out.println("Depth of node with data 3: " + tree.getDepth(3));
		System.out.println("Depth of node with data 7: " + tree.getDepth(7));
		System.out.println("Depth of node with data 4: " + tree.getDepth(4));
		System.out.println("Depth of node with data 6: " + tree.getDepth(6));
		System.out.println("Depth of node with data 2: " + tree.getDepth(2));
		System.out.println("Depth of node with data 8: " + tree.getDepth(8));
	}
}

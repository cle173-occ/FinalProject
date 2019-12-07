import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class Frame extends JFrame
{
    private JButton draw, clear;
    private JLabel ins1;
    private JTextField root;
    private JPanel panel;
    private CustomComponent component;

    private BinarySearchTree tree;
    
    public int nodeHeight = 25;    
    private static final int FRAME_HEIGHT = 750;
    private static final int FRAME_WIDTH = 750;
    private static final int COMPONENT_WIDTH = 700;
    private static final int COMPONENT_HEIGHT = 600;
    
    
    public Frame() {
        tree = new BinarySearchTree();
    	
        createComponents();
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
    }
    
    private void createComponents(){
        
        //Button to draw a tree
        draw = new JButton("Draw Tree");
        clear = new JButton("Clear");
        
        //Event handler for button
        draw.addActionListener(new DrawTree());
        clear.addActionListener(new Clear());
        
        //Label for the root
        ins1 = new JLabel("The first number is the root:");
        
        //Text area for numbers
        root = new JTextField(15);
        root.setText("Separate by Comma");
        root.selectAll();
        
        //Custom component to draw
        component = new CustomComponent(tree);
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        //Panel with added GUI components
        panel = new JPanel();
        
        panel.add(ins1);
        panel.add(root);
        panel.add(draw);
        panel.add(clear);
        panel.add(component);
        
        this.add(panel);
    }
    
    class DrawTree implements ActionListener{
      
        public void actionPerformed(ActionEvent e) throws NumberFormatException
        {
        	ArrayList<Integer> arr = new ArrayList<>();
            String s = root.getText();
            String[] val = s.split(","); //Separates the values by comma and places them into a string array
            
            
            //Converts the values in the string array into int and puts them in arraylist arr 
            try {
                for(int i = 0; i < val.length; i++) {
                    int n = Integer.parseInt(val[i]);
                    arr.add(n);
                }
                
                int nodePosX = COMPONENT_HEIGHT / 2;
                
                tree = new BinarySearchTree();
                for(int i = 0; i < arr.size(); i++) {
                    tree.add(arr.get(i));
                    //component.cir.add(new Circle(val[i], nodePosX + 50*i, nodeHeight + 50*i));
                    //component.cir.add(new Circle(val[i], nodePosX - 50*i, nodeHeight + 50*i));
                }

                tree.iPrint();
                tree.prePrint();
                tree.postPrint();
                
            
            } 
            catch(Exception exception) {
                if(exception instanceof NumberFormatException) {
                	System.out.println("Please input numbers");
                }
            }
            
            component.draw();
            root.requestFocusInWindow();
            root.selectAll();
        }
    }
    
    class Clear implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(component.cir.size() != 0) {
            	component.cir.clear();
            }
			component.draw();
			root.requestFocusInWindow();
			root.selectAll();
		
		}
    	
    }
    
}

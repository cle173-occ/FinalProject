import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Frame extends JFrame
{
    private JButton draw;
    private JLabel ins1;
    private JTextField root;
    private JPanel panel;
    private JComponent component;
    public ArrayList<Integer> arr = new ArrayList<>();
    
    private static final int FRAME_HEIGHT = 750;
    private static final int FRAME_WIDTH = 600;
    private static final int COMPONENT_WIDTH = 500;
    private static final int COMPONENT_HEIGHT = 500;
    
    
    public Frame() {
        
        createComponents();
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
    }
    
    private void createComponents(){
        
        //Button to draw a tree
        draw = new JButton("Draw Tree");
        
        //Event handler for button
        draw.addActionListener(new DrawTree());
        
        //Label for the root
        ins1 = new JLabel("First number is the root:");
        
        //Text area for numbers
        root = new JTextField(15);
        root.setText("Separate by Comma");
        root.selectAll();
        
        //Custom component to draw
        component = new CustomComponent();
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        //Panel with added GUI components
        panel = new JPanel();
        
        panel.add(ins1);
        panel.add(root);
        panel.add(draw);
        panel.add(component);
        
        this.add(panel);
    }
    
    class DrawTree implements ActionListener{
      
        public void actionPerformed(ActionEvent e) throws NumberFormatException
        {
            String s = root.getText();
            String[] val = s.split(","); //Separates the values by comma and places them into a string array
            
            
            //Converts the values in the string array into int and puts them in arraylist arr 
            try {
                for(int i = 0; i < val.length; i++) {
                    int n = Integer.parseInt(val[i]);
                    arr.add(n);
                }
            } 
            catch(NumberFormatException exception) {
                System.out.println("Please input numbers");
                root.selectAll();
            }
            //Prints out the int array list
            /*
            for(int y : arr) {
                System.out.println(y);
            }
            */
            
            BinarySearchTree tree = new BinarySearchTree();
            for(int i = 0; i < arr.size(); i++) {
                tree.add(arr.get(i));
            }
            
            tree.iPrint();
            tree.prePrint();
            tree.postPrint();
            
            
                        
        }
    }
    
}

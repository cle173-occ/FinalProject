import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame
{
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private JComponent component;
    
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_WIDTH = 500;
    private static final int COMPONENT_WIDTH = 500;
    private static final int COMPONENT_HEIGHT = 500;
    
    
    public Frame() {
        createComponents();
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
    }
    
    private void createComponents(){
        
        button = new JButton("Create Tree");
        
        button.addActionListener(new MyButtonListener());
        
        label = new JLabel("Yes");
        
        component = new CustomComponent();
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        panel.add(label);
        panel.add(button);
        panel.add(component);
        
        this.add(panel);
    }
    
    class MyButtonListener implements ActionListener{
      
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Yes");
        }
    }
    
}

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class CustomComponent extends JComponent
{
    public CustomComponent(/*pass refs here*/)
    {
        
    }
    
    
    public void paintComponent(Graphics g)
    {
        // Use this method to draw whatever you want
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        
    }

}

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class CustomComponent extends JComponent
{
	public BinarySearchTree cTree;
	
    public CustomComponent(BinarySearchTree ct)
    {
        cTree = ct;
    }
/*    
    public void draw(String num, int x, int y) {
    	str = num;
    	nodeX = x;
    	nodeY = y;
    	repaint();
    	//System.out.println(nodeX);
        //System.out.println(nodeY);
    }
*/    
    public void draw() { 
    	repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        // Use this method to draw whatever you want
    	setLocation(getX(), getY());
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        
        
        
    }
    
    private double getNodeX(String p)
    {
    	// var for curLeftX=0, curRightX=getWidth(), curX=(curLeftX+curRightX)/2.0
    	// loop through p and update LXand RX
    	return 0.0;
    }
    private double getNodeY(int d)
    {
    	// for Y, just mult d by vertical spacing and return it
    	return 0.0;
    }
}

class Circle{
	
	public int nodeWidth;
	public int nodeHeight;
	public int nodeX;
	public int nodeY;
	public String str;
	
	public Circle(String x, int posX, int posY) {
		nodeWidth = 60;
        nodeHeight = 60;
        nodeX = posX;
        nodeY = posY;
        str = x;
	}
	
	public void drawCircle(Graphics g) {
		
		int textX = nodeX + nodeWidth/2;
        int textY = nodeY + nodeHeight/2;
        int x = 0;
        int y = 5;
        
        if(nodeX > 9) {
        	x += 5;
        }
        
        g.drawOval(nodeX, nodeY, nodeWidth, nodeHeight);
        g.drawString(str, textX - x, textY + y);
	}
}

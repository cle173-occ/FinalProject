import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;


public class CustomComponent extends JComponent
{
	private BinarySearchTree cTree;
	public ArrayList<Integer> cArr;
	
    public CustomComponent(BinarySearchTree ct) {
    	 cTree = ct;
    	 cArr = new ArrayList<>();
	}

	public void draw() { 
        
    	repaint();
    }
    
    public void paintComponent(Graphics g) throws NullPointerException
    {
        // Use this method to draw whatever you want
    	setLocation(getX(), getY());
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);     

        try {
        	for(int i = 0; i < cTree.getCount(); i++) {
            	
            	int posX = getNodeX(cTree.getPath(cTree.getData(cArr.get(i))));
            	int posY = getNodeY(cTree.getDepth(cTree.getData(cArr.get(i))));
            	
            	g.drawOval(posX, posY, 50, 50);
            	g.drawString(cArr.get(i).toString(), posX + 23, posY + 27);
            	
            	//System.out.println(cArr.get(i) + " posX: " +posX);
            	//System.out.println(cArr.get(i) + " posY: " +posY);
            	//System.out.println(getNodeY(cTree.getDepth(cArr.get(i))));
            	
            	//System.out.println("Depth: " +cTree.getDepth(cTree.getData(cArr.get(i))));
        	}

        }
        catch(Exception e) {}
        
        getNodeX(cTree.getPath(7));
    	System.out.println("Path:" +cTree.getPath(6));
    }

    
    private int getNodeX(String p)
    {
    	// var for curLeftX=0, curRightX=getWidth(), curX=(curLeftX+curRightX)/2.0
    	// loop through p and update LXand RX
    	System.out.println("posX: " + p + "\n");
    	String[] arr = p.split("");
    	
    	double curLeftX = 0;
    	double curRightX = getWidth();
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i].equals("1")) {
    			curLeftX = curRightX / 2; 
    			//System.out.println("Left: " +curLeftX);
    			//System.out.println("Right: " +curRightX);
    		}
    		
    		if(arr[i].equals("0")) {
    			curRightX = curRightX / 2;
    			//System.out.println("Left: " +curLeftX);
    			//System.out.println("Right: " +curRightX);
    		}
   		
    	}
    	
    	double curX = (curLeftX + curRightX) / 2;
    	
    	System.out.println("CurX: " +curX);
    	
    	return (int)curX;
    }
    
    private int getNodeY(int d)
    {
    	// for Y, just mult d by vertical spacing and return it
    	//System.out.println("PosY" + d +"\n");
    	d = d * 2;
    	
    	return (int)(d * getY());
    }

}

/*
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
*/
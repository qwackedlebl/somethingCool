

// COMPLETE


public class Plot {
    
    
    // fields
    
    private int x, y, width, depth;
    
    
    // constructors
    
    public Plot () {
	width = 1;
	depth = 1;
    }
    
    public Plot (int x, int y, int width, int depth) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;
    }
    
    public Plot (Plot plot) {
	this(plot.getX(), plot.getY(), plot.getWidth(), plot.getDepth());
    }

    
    // TODO useful methods
    
    private boolean overlapCompare(int a, int b, int c) {
	if (a >= b && a <= c)
	    return true;   
	return false;
    }
    
    private boolean inBetween(int a, int b, int c) {
	if (a > b && a < c)
	    return true;   
	return false;
    }
        
    
    // likely wrong
    public boolean isInBounds() {
	int x1 = 0;
	int x2 = 10;
	int y1 = 0;
	int y2 = 10;
	
	int a1 = this.getX();
	int a2 = this.getX() + this.getWidth();
	int b1 = this.getY();
	int b2 = this.getY() + this.getDepth();
	
	if (overlapCompare(a1,x1, x2) && overlapCompare(b1,y1, y2) && overlapCompare(a1,x1,x2) && overlapCompare(b2,y1,y2) && overlapCompare(a2,x1,x2) && overlapCompare(b1,y1,y2) && overlapCompare(a2,x1, x2) && overlapCompare(b2,y1,y2))
	{
	    return true;
	}
	
	
	return false;
	
    }
    
    
    
    public boolean overlaps (Plot plot) {
	
	System.out.println("comparing plot " + plot.toString() + " with plot " + this.toString());
	
	int x1 = this.getX();
	int x2 = this.getX() + this.getWidth();
	int y1 = this.getY();
	int y2 = this.getY() + this.getDepth();
	
	int a1 = plot.getX();
	int a2 = plot.getX() + plot.getWidth();
	int b1 = plot.getY();
	int b2 = plot.getY() + plot.getDepth();
	
	
	// checking if any one of the corners is overlapping into the square
	// this does NOT check if it is on the boundary; 
	// if on the boundary, it will just not count, therefore returning false.
	
	int n = 0;
	System.out.println(n++); // 0
	if (inBetween(a1,x1,x2) && inBetween(b1,y1,y2)) {
	    return true;
	}
	System.out.println(n++); // 1
	if (inBetween(a2,x1,x2) && inBetween(b1,y1,y2)) {
	    return true;
	}
	System.out.println(n++); // 2
	if (inBetween(a1,x1,x2) && inBetween(b2,y1,y2)) {
	    return true;
	}
	System.out.println(n++); // 3
	if (inBetween(a2,x1,x2) && inBetween(b2,y1,y2)) {
	    return true;
	}
	System.out.println(n++); // 4
	
	// checking overlap but on edge case
	
	if (a1 == x1) {
	    if (inBetween(b1,y1,y2) || (inBetween(b2,y1,y2))) {
		return true;
	    }
	}
	System.out.println(n++); // 5
	if (a1 == x2) {
	    return false;
	}System.out.println(n++); // 6
	
	if (a2 == x1) {
	    return false;
	}System.out.println(n++); // 7
	
	if (a2 == x2) {
	    if (inBetween(b1,y1,y2) || (inBetween(b2,y1,y2))) {
		return true;
	    }
	}
	System.out.println(n++); // 8
	if (b1 == y1) {
	   if (inBetween(a1,x1,x2) || inBetween(a1,x1,x2)) {
	       return true;
	   }
	}
	System.out.println(n++); // 9
	if (b1 == y2) {
	    return false;
	}
	System.out.println(n++); // 10
	if (b2 == y1) {
	    return false;
	}
	System.out.println(n++); // 11
	if (b2 == y2) {
	    if (inBetween(a1,x1,x2) || inBetween(a2,x1,x2)) {
		return true;
	    }
	}
	System.out.println(n++); // 12
	
	
//	if (overlapCompare(a1,x1, x2) && overlapCompare(b1,y1, y2)) {
//	    return true;
//	} else if (overlapCompare(a1,x1,x2) && overlapCompare(b2,y1,y2)) {
//	    return true;
//	} else if (overlapCompare(a2,x1,x2) && overlapCompare(b1,y1,y2)) {
//	    return true;
//	} else if (overlapCompare(a2,x1, x2) && overlapCompare(b2,y1,y2)) {
//	    return true;
//	}
	
	return false;
    }
    
    public boolean encompasses (Plot plot) {
	int x1 = plot.getX();
	int x2 = plot.getX() + plot.getWidth();
	int y1 = plot.getY();
	int y2 = plot.getY() + plot.getDepth();
	
	int a1 = this.getX();
	int a2 = this.getX() + this.getWidth();
	int b1 = this.getY();
	int b2 = this.getY() + this.getDepth();
	
	
	if (overlapCompare(x1,a1, a2) && overlapCompare(x2,a1,a2) && overlapCompare(y1,b1, b2) && overlapCompare(y2,b1,b2))
	{
	    return true;
	}
	
	
	return false;
    }
    
    
    // TODO 2string
    
    public String toString() {
	return getX() + "," + getY() + "," + getWidth() + "," + getDepth();
    }
    
    
    // getters and setters
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    
    
    
    
}

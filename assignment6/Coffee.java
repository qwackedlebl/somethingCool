package beverageShopPackage;

public class Coffee extends Beverage {
    
    private boolean extraShot;
    private boolean extraSyrup;
    
    private final double XTRA_SHOT_OR_SYRUP = .5;

    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
	super(bevName, Type.COFFEE, size);
	this.extraShot = extraShot;
	this.extraSyrup = extraSyrup;
    }

    
    public double calcPrice() {
	
	double price = addSizePrice();

	if (getExtraShot()) 
	    price += XTRA_SHOT_OR_SYRUP;
	if (getExtraSyrup()) 
	    price += XTRA_SHOT_OR_SYRUP;
	
	return price;
    }
    
    public String toString() {
	
	return (super.toString() + "," + this.getExtraShot() + "," + this.getExtraSyrup() + "," + this.calcPrice());
    }
   
    public boolean equals(Object anotherBev) {
	if (anotherBev == null) {
	        return false;
	    }

	    if (anotherBev instanceof Coffee) {
	        Coffee secondBev = (Coffee) anotherBev;
	        return super.equals(secondBev) &&
	               this.getExtraShot() == secondBev.getExtraShot() &&
	               this.getExtraSyrup() == secondBev.getExtraSyrup();
	    }

	    return false;

    }
    
    
    public boolean getExtraShot() {
        return extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }
    
    
    
}

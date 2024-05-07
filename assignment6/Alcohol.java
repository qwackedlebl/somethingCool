package beverageShopPackage;

public class Alcohol extends Beverage {

    private boolean isWeekend; // wat
    private static final double WEEKEND_PRICE = .6;
    
    public Alcohol(String bevName, Size size, boolean isWeekend) {
	super(bevName, Type.ALCOHOL, size);
	this.isWeekend = isWeekend;
    }
    
    public double calcPrice() {
	double price = super.addSizePrice();
	
	if (isWeekend())
	    price += WEEKEND_PRICE;
	
	return price;
    }
    

    public boolean equals(Object anotherBev) {
	 if (!super.equals(anotherBev)) {
	        return false;
	    }

	    if (anotherBev instanceof Alcohol) {
	        Alcohol secondBev = (Alcohol) anotherBev;
	        return this.isWeekend() == secondBev.isWeekend();
	    }

	    return false;
	
    }
    
    public String toString() {
	return super.toString() + "," + this.isWeekend() + "," + this.calcPrice(); 
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public static double getWeekendPrice() {
        return WEEKEND_PRICE;
    }
    
    
    
}

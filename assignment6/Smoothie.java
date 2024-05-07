package beverageShopPackage;

public class Smoothie extends Beverage { 
    
    private int numOfFruits;
    private boolean addProtein;
    
    private final double ADD_PROTEIN = 1.5;
    private final double ADD_FRUIT = .5;
    
    
    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
	super(bevName,Type.SMOOTHIE,size);
	this.numOfFruits = (numOfFruits);
	this.addProtein = addProtein;
    }

    public double calcPrice() {
	
	double price = addSizePrice();
	
	
	if (this.getAddProtein()) {
	    price += ADD_PROTEIN;
	}
	
	price += (ADD_FRUIT * getNumOfFruits());
	
	
	return price;
    }
    
    public boolean equals(Object anotherBev) {
	if (!super.equals(anotherBev)) {
	        return false;
	    }

	    if (anotherBev instanceof Smoothie) {
	        Smoothie secondBev = (Smoothie) anotherBev;
	        return this.getNumOfFruits() == secondBev.getNumOfFruits() &&
	               this.getAddProtein() == secondBev.getAddProtein();
	    }

	    return false;
    }
    
    
    public String toString() {
	return super.toString() + "," + this.getAddProtein() + "," + this.getNumOfFruits() + "," + this.calcPrice();
    }
    
    public int getNumOfFruits() {
        return numOfFruits;
    }

    public boolean getAddProtein() {
        return addProtein;
    }
    
    

}

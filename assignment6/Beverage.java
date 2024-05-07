package beverageShopPackage;

public abstract class Beverage {

    private String bevName;
    private Type type;
    private Size size;

    public static final double BASE_PRICE = 2.0;
    public static final double SIZE_PRICE = .5;

    public Beverage(String bevName, Type type, Size size) {
	this.bevName = bevName;
	this.type = type;
	this.size = size;
    }

    // TODO IDK HOW TO MAKE SHALLOW COPY CONSTRUCTOR OF AN ABSTRACT CLASS???
//    public Beverage(Beverage beverage) {
//	Beverage newBeverage = new Beverage(beverage.getBevName(), beverage.getType(), beverage.getSize());
//    }
//    

    public double addSizePrice() {
	switch (this.size) {
	case SMALL:
	    return BASE_PRICE;
	case MEDIUM:
	    return BASE_PRICE + SIZE_PRICE;
	case LARGE:
	    return BASE_PRICE + SIZE_PRICE + SIZE_PRICE;
	default:
	    return 0.0;
	}
    }

    public String toString() {
	return bevName + "," + size;
    }


    public boolean equals(Object anotherBev) {

	if (anotherBev == null) {
	        return false;
	    }

	    if (anotherBev instanceof Beverage) {
	        Beverage secondBev = (Beverage) anotherBev;
	        return this.getBevName().equals(secondBev.getBevName()) &&
	               this.getType().equals(secondBev.getType()) &&
	               this.getSize() == secondBev.getSize();
	    }

	    return false;
    }

    public abstract double calcPrice();

    public String getBevName() {
	return bevName;
    }

    public Type getType() {
	return type;
    }

    public Size getSize() {
	return size;
    }

    public static double getBasePrice() {
	return BASE_PRICE;
    }

    public static double getSizePrice() {
	return SIZE_PRICE;
    }

}

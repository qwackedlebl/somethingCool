

// COMPLETE

public class Property {

    
    // fields
    
    private String propertyName, city, owner;
    private double rentAmount;
    private Plot plot;
    
    
    // constructors
    
    public Property() {
	propertyName = "";
	city = "";
	owner = "";
	
	plot = new Plot();
    }
    
    public Property(String propertyName, String city, double rentAmount, String owner) {
	this();
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
	
    }
    
    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
	this(propertyName, city, rentAmount, owner);
	
	plot = new Plot(x, y, width, depth);
    }
    
    public Property(Property property) {
	this(property.getPropertyName(),property.getCity(),property.getRentAmount(),property.getOwner(),property.getPlot().getX(),property.getPlot().getY(),property.getPlot().getWidth(),property.getPlot().getDepth());
    }
    
    
    // 2string
    
    public String toString() {
	return getPropertyName() + "," + getCity() + "," + getOwner() + "," + getRentAmount();
    }
    
   
    // getters
    
    public Plot getPlot() {
        return plot;
    }
    public String getPropertyName() {
        return propertyName;
    }
    public String getCity() {
        return city;
    } 
    public double getRentAmount() {
        return rentAmount;
    }
    public String getOwner() {
        return owner;
    }
   
    
    
    
    
    
}

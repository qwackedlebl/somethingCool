
public class ManagementCompany {
    
    // fields
    
    static final int MAX_PROPERTY = 5, MGMT_DEPTH = 10, MGMT_WIDTH = 10;
   
    private Property property[];
    private String taxID, name;
    private double mgmFee;
    
    private Plot managementPlot;	// this seems FUCKING WRONG, but IDK WHERE ELSE IM SUPPOSED TO GET A PLOT FROM
    
    
    // constructors
    
    public ManagementCompany() {
	property = new Property[MAX_PROPERTY];
	managementPlot = new Plot(0, 0, MGMT_DEPTH, MGMT_WIDTH);
	//property[0].getPlot().setDepth(MGMT_DEPTH);
	//property[0].getPlot().setWidth(MGMT_WIDTH);
    }
    
    public ManagementCompany(String name, String taxID, double mgmFee) {
	this();
	this.name = name;
	this.taxID = taxID;
	this.mgmFee = mgmFee;
    }
   
    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
	this(name, taxID, mgmFee);
	property[0].getPlot().setX(x);
	property[0].getPlot().setY(y);
	property[0].getPlot().setWidth(width);
	property[0].getPlot().setDepth(depth);
    }
    
    public ManagementCompany(ManagementCompany managementCompany) {
	this(managementCompany.getName(),managementCompany.getTaxID(),managementCompany.mgmFee);
	
	for (int i = 0; i < managementCompany.property.length; i++) {
	    this.property[i] = new Property(managementCompany.property[i]);
	}

    }
    
    
    // properties adding
    
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
	Property toAddProperty = new Property(name, city, rent, owner, x, y, width, depth);
	
	return addProperty(toAddProperty);
    }
    
    
    public int addProperty(Property property) {
	
	// if property object is null
	if (property == null)
	    return -2;
	
	// if property array is full
	if (getPropertiesCount() == 5)
	    return -1;
	
	
	// if the added property is NOT within the management district
	if (!this.getPlot().encompasses(property.getPlot()))
	    return -3;
	
	// if the added property's plot overlaps with any of the other properties' plots
	for (int i = 0; i < this.getProperties().length; i++) {
	    if ( this.getProperties()[i] != null && this.getProperties()[i].getPlot().overlaps(property.getPlot()))
	       return -4; 
	}
	
	
	// finding the last index	
	

	// adding the new property
	
	this.property[getPropertiesCount()] = new Property(property);
	
	
	return getPropertiesCount()-1;
	    
	

	  //  return -7;
	}
    
    // property removing
    
    public void removeLastProperty() {
	int index = -1;
	
	for (int i = 0; i < this.property.length; i++) {
		
	    if (this.property[i] != null) {
		index = i;
	    }
	        
	}
	
	if (index != -1) {
	    this.property[index] = null;
	}
	
    }
    
    // checking properties of properties
   
    public boolean isPropertiesFull() {
	boolean isFull = false;
	
	if (this.property[4] != null) {
	    isFull = true;
	}
	
	return isFull;
	
    }
    

    public int getPropertiesCount() {
	int amount = 0;
	
	for (int i = 0; i < this.property.length; i++) {
	    
	    if (this.property[i] != null) {
		amount++;
	    }
	    
	}
	
	return amount;
	
    }
    
    
    public double getTotalRent() {
	
	double rentAmount = 0.0;
	
	for (int i = 0; i < getPropertiesCount(); i++) {
	    rentAmount += this.property[i].getRentAmount();
	}
	
	return rentAmount;
    }
    
    // NICE FUCKING MISSPELL GJ GUYS!!!!!!!!!
    public Property getHighestRentPropperty() {
	
	double rentAmount = this.property[0].getRentAmount();
	int index = 0;

	for (int i = 0; i < getPropertiesCount(); i++) {
	    
	    if (rentAmount <= this.property[i].getRentAmount()) {
		rentAmount = this.property[i].getRentAmount();
		index = i;
	    }
		
		
	}
	
	return property[index];
	
    }
    
    public boolean isManagementFeeValid() {
	if (mgmFee >= 0 && mgmFee <= 100)
	    return true;
	else
	    return false;
    }
    
    
    // 2string is BULLSHIT BECAUSE THIS IS NOT WRITTEN PLAUSIBLY ANYWHERE HOW IT'S SUPPOSED TO BE DONE EXACTLY, I'M SUPPOSED TO INFER EVERYTHING FROM GFA TEST, ESPECIALLY SHIT LIKE  THAT MGMFEEPER IS A PERCENT OF THE RENT AMOUNT FROM THE GFA TEST, WHAT ELSE DO I NOT KNOW ABOUT THIS ASSIGNMENT??? NICE FUCKING JAVADOC
    
    public String toString() {
	String bullshit = "";
	String emptyBullShit = "______________________________________________________\n";
	
	bullshit += ("List of the properties for " + getName() + ", taxID: " + getTaxID() + "\n");
	bullshit += emptyBullShit;
	
	for (int i = 0; i < getPropertiesCount(); i++) {
	    
	    bullshit += (property[i].getPropertyName() + "," + property[i].getCity() + "," + property[i].getOwner() + "," + property[i].getRentAmount() + "\n");
	    
	}
	
	bullshit += emptyBullShit;
	
	bullshit += "\n";
	
	
	double thisIsAlsoBullshit = 0.0;
	for (int i = 0; i < getPropertiesCount(); i++) {
	    thisIsAlsoBullshit += property[i].getRentAmount() * (getMgmFeePer() / 100);
	}
	
	bullshit += " total management Fee: " + thisIsAlsoBullshit;
	
	return bullshit;
    }
    
    
    
    
    
    
    // getters
    
    public Plot getPlot() {
	return managementPlot;
    }
    
    public Property[] getProperties() {
        return property;
    }
    public String getTaxID() {
        return taxID;
    }
    public String getName() {
        return name;
    }
    
    public double getMgmFeePer() {
	return mgmFee;
    }
    
    
    //ManagementCompany(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
//	property = new Property(propertyName, city, rentAmount, owner, x, y, width, depth);
  //  }
    
    
    
}

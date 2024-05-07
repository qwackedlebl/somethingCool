
// DONE

package beverageShopPackage;

public class Customer {

    private String name;
    private int age;
    
    public Customer() {
	name = null;
	age = -1;
    }
    
    public Customer(String name, int age) {
	this();
	setName(name);
	setAge(age);
    }

    public Customer(Customer customer) {
	this.setAge(customer.getAge());
	this.setName(customer.getName());
    }
    
    
    public String toString() {
	return getName() + "," + getAge();
    }
    
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}

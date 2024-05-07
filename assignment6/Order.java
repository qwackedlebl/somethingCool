package beverageShopPackage;

import java.util.*;

public class Order implements OrderInterface, Comparable<Order> {

    private int orderNo;
    private int orderTime; // between 8 and 23
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> orderedItems;

    public Order(int orderTime, Day orderDay, Customer customer) {
	this.orderTime = orderTime;
	this.orderDay = orderDay;
	this.customer = customer;
	this.orderNo = generateOrder();
	orderedItems = new ArrayList<>();
    }

    public int generateOrder() {
	Random rng = new Random();
	return rng.nextInt(80000) + 10000;
    }

    public boolean isWeekend() {
	if (getOrderDay() == Day.SATURDAY || getOrderDay() == Day.SUNDAY) {
	    return true;
	}
	return false;
    }

    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
	Beverage newBev = new Coffee(bevName, size, extraShot, extraSyrup);
	orderedItems.add(newBev);
    }

    public void addNewBeverage(String bevName, Size size) {
	Beverage newBev = new Alcohol(bevName, size, isWeekend());
	orderedItems.add(newBev);
    }

    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
	Beverage newBev = new Smoothie(bevName, size, numOfFruits, addProtein);
	orderedItems.add(newBev);
    }

    public double calcOrderTotal() {
	double total = 0.0;

	for (int i = 0; i < orderedItems.size(); i++) {

	    total += orderedItems.get(i).calcPrice();
	   
	    
	}

	return total;
    }

    public int findNumOfBeveType(Type type) {
	int count = 0;

	for (int i = 0; i < orderedItems.size(); i++) {

	    if (orderedItems.get(i).getType() == type) {
		count++;
	    }

	}

	return count;
    }

    // IDK TODO SHALLOW COPY, SPECIFIED BY ??
//    public Beverage getBeverage(int itemNo) {
//	Beverage bev = new Beverage();
//    }

    public int getTotalItems() {
	return orderedItems.size();
    }

    public int compareTo(Order anotherOrder) {

	if (this.getOrderNo() > anotherOrder.getOrderNo()) {
	    return 1;
	}
	if (this.getOrderNo() < anotherOrder.getOrderNo()) {
	    return -1;
	}
	return 0;
    }

    public String toString() {

	String orderList = "";

	for (int i = 0; i < orderedItems.size(); i++) {
	    orderList += orderedItems.get(i).getBevName();
	}

	return this.getOrderNo() + "," + this.getOrderTime() + "," + this.getCustomer().getName() + ","
		+ this.getCustomer().getAge() + orderList;

    }

    public Beverage getBeverage(int itemNo) {
	Beverage poopy = orderedItems.get(itemNo);
	return poopy;
    }

    // getters

    public int getOrderNo() {
	return orderNo;
    }

    public int getOrderTime() {
	return orderTime;
    }

    public Day getOrderDay() {
	return orderDay;
    }

    // why ?
    public Day getDay() {
	return orderDay;
    }

    public Customer getCustomer() {

	Customer customerCopy = new Customer(this.customer);

	return customerCopy;
    }

}

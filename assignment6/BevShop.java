package beverageShopPackage;

import java.util.*;

public class BevShop implements BevShopInterface {

    private int numOfAlcoholDrink;
    private ArrayList<Order> orders;

    public BevShop() {
	BevShop bevShop = new BevShop();
	numOfAlcoholDrink = 0;
    }

    public boolean isValidTime(int time) {
	if (time >= MIN_TIME && time <= MAX_TIME) {
	    return true;
	}
	return false;
    }

    public int getMaxNumOfFruits() {
	return MAX_FRUIT;
    }

    public int getMinAgeForAlcohol() {
	return MIN_AGE_FOR_ALCOHOL;
    }

    public boolean isMaxFruit(int numOfFruits) {
	if (numOfFruits >= MAX_FRUIT) {
	    return true;
	}
	return false;
    }

    public int getMaxOrderForAlcohol() {
	return MAX_ORDER_FOR_ALCOHOL;
    }

    public boolean isEligibleForMore() {
	if (getNumOfAlcoholDrink() >= getMaxOrderForAlcohol()) {
	    return false;
	}
	return true;
    }

    public int getNumOfAlcoholDrink() {
	return numOfAlcoholDrink;
    }

    public boolean isValidAge(int age) {
	if (age >= MIN_AGE_FOR_ALCOHOL) {
	    return true;
	}
	return false;
    }

    public void startNewOrder(int time, Day day, String customerName, int customerAge) {

	Customer newCustomer = new Customer(customerName, customerAge);
	Order newOrder = new Order(time, day, newCustomer);

	orders.add(newOrder);
    }

    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
	orders.get(-1).addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    public void processAlcoholOrder(String bevName, Size size) {
	orders.get(-1).addNewBeverage(bevName, size);
    }

    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
	orders.get(-1).addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

    public int findOrder(int orderNo) {

	for (int i = 0; i < orders.size(); i++) {

	    if (orders.get(i).getOrderNo() == orderNo) {

		return i;
	    }
	}

	return -1;
    }

    public double totalOrderPrice(int orderNo) {

	return orders.get(findOrder(orderNo)).calcOrderTotal();

    }

    public double totalMonthlySale() {

	double total = 0.0;

	for (int i = 0; i < orders.size(); i++) {

	    total += orders.get(i).calcOrderTotal();
	}

	return total;
    }

    public int totalNumOfMonthlyOrders() {

	return orders.size();

    }

    public Order getCurrentOrder() {

	return orders.get(-1);
    }

    public Order getOrderAtIndex(int index) {

	return orders.get(index);
    }

    public void sortOrders() {

	int n = orders.size();

	for (int i = 0; i < n - 1; i++) {

	    int minIndex = i;

	    for (int j = i + 1; j < n; j++) {

		if (orders.get(j).compareTo(orders.get(minIndex)) < 0) {
		    minIndex = j;
		}
	    }
	    if (minIndex != i) {
		Order temp = orders.get(i);
		orders.set(i, orders.get(minIndex));
		orders.set(minIndex, temp);
	    }

	}
    }
    
    public String toString() {
	
	String orderToString = "";
	
	for (int i = 0; i < orders.size(); i++) {
	    orderToString += orders.get(i).toString();
	}
	
	return orderToString;
    }
}

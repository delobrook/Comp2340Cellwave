package CellwavejaUI;

import java.util.ArrayList;

import Core.Customer;


public class CustomerInformation extends Subject{
	public  static ArrayList <Customer> customers = new ArrayList<>();
	public static void addcustomer(Customer p) {
		customers.add(p);
	}
	public static void clearCustomerInformation() {
		customers.clear();
	}
	public static void deletecustomer(int selrow) {
		customers.remove(selrow);
	}
}

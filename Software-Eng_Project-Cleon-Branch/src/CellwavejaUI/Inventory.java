package CellwavejaUI;

import java.util.ArrayList;

import Core.Product;

public class Inventory extends Subject {
	public static ArrayList <Product> newProducts = new ArrayList<Product>();
	public static void addNewProduct(Product p) {
		newProducts.add(p);
	}
	public static void clearProductInformation() {
		newProducts.clear();
	}
	public static void deleteProduct(int selrow) {
		newProducts.remove(selrow);
	}
}

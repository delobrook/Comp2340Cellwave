package Core;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Product {
	private String colour;
	private String description;
	private String productName;
	private String productType;
	private Float costPrice;
	private Float sellingPrice;
	private int quantity;
	private String modelNumber;
	private String imageName;


	private Product(){}	

	private Product(String modelNumber, String productName, String productType, String description,
					Float costPrice, Float sellingPrice, int quantity, String imageName, String colour) {

		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productType = productType;
		this.description = description;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;
		this.imageName = imageName;
		this.colour = colour;

	}

	public static Product createProduct(String modelNumber, String productName, String productType, String description,
										Float costPrice, Float sellingPrice, int quantity, String imageName, String colour){

		Product newProduct = new Product(modelNumber, productName, productType, description, costPrice, sellingPrice, quantity, imageName, colour);
		return newProduct;								
	}

	public void viewProduct(){
		print();
	}

	/*public static void editProduct() {
		String choice = null;
		Scanner scan = new Scanner(System.in);
		for (Product a : products) {
			System.out.println(a);
		}
		System.out.println("Enter the model number of the product you want to edit: ");
		String model = scan.nextLine();
		for (Product a : products) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if (a.equals(model)) {
				System.out.println(a);
				System.out.println("Command Options: ");
				System.out.println("m: model number");
				System.out.println("N: Product Name");
				System.out.println("t: Type of product");
				System.out.println("d: Description");
				System.out.println("C: Cost price");
				System.out.println("s: Selling price");
				System.out.println("Q: Edit quantity");
				System.out.println("c: Edit colour of product");
				System.out.println("I: Edit Photo");
				System.out.println("q: Quit");

				choice = scan.nextLine();
			}
			do {

				switch (Objects.requireNonNull(choice)) {
					case "m":
						a.setModelNumber(getModelNumber());
						break;
					case "N":
						a.setProductName(getProductName());
						break;
					case "t":
						a.setProductType(getProductType());
						break;
					case "d":
						a.setDescription(getDescription());
						break;
					case "C":
						a.setCostPrice(a.getCostPrice());
						break;
					case "s":
						a.setSellingPrice(getSellingPrice());
						break;
					case "Q":
						a.setQuantity(getQuantity());
						break;
					case "c":
						a.setColour(getColour());
						break;
					case "I":
						a.setImageName(a.getImageName());
						break;

				} // end of switch
			} while (!choice.equals("q"));


		}
	}*/



	/*public static void  deleteProduct() {
		for (Product a : products) {
			System.out.println(a);
		}
		System.out.println("Enter the model number of the product you want to remove.");
		Scanner read = new Scanner(System.in);
		String delete = read.nextLine();
		for (Product e : products) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if ( e.equals(delete)) {
				products.remove(e);
				System.out.println("Product deleted");

			} else{
				System.out.println( "Product not found!");
			}
		}
	}*/


	public Float getCostPrice() {
		return costPrice;
	}

	public Float getSellingPrice() {
		return sellingPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getProductName() {
		return productName;
	}

	private void setModelNumber(String modelNumber) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the model number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new model number.");
			this.modelNumber = scan.nextLine();
		}else {
			System.out.println(modelNumber);
		}
	}

	private void setProductName(String productName) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the name (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")){
			System.out.println("Enter the new name.");
			this.productName = scan.nextLine();
		}else{
			System.out.println(productName);
		}
	}

	private void setProductType(String productType) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the type of product (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new type.");
			this.productType = scan.nextLine();
		}else {
			System.out.println(productType);
		}
	}

	private void setDescription(String description) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the description (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new description.");
			this.description = scan.nextLine();
		}else {
			System.out.println(description);
		}
	}

	private void setCostPrice(Float costPrice) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the cost price (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new cost price.");
			this.costPrice = scan.nextFloat();
		}else {
			System.out.println(costPrice);
		}
	}

	private void setSellingPrice(Float sellingPrice) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the selling price (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new selling price.");
			this.sellingPrice = scan.nextFloat();
		}else {
			System.out.println(sellingPrice);
		}
	}

	private void setQuantity(int quantity) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Quantity (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Quantity.");
			this.quantity = scan.nextInt();
		}else {
			System.out.println(quantity);
		}
	}

	private void setColour(String colour) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the colour (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new colour.");
			this.colour = scan.nextLine();
		}else {
			System.out.println(colour);
		}
	}

	private void setImageName(String imageName) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Image (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Image name.");
			this.imageName = scan.nextLine();
		}else {
			System.out.println(imageName);
		}

	}

	public String getColour() {
		return colour;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public String getProductType() {
		return productType;
	}

	public String getDescription() {
		return description;
	}
	public String getImageName(){
		return imageName;
	}

	public String[] print(){
		String[] productString = new String[]{
			getModelNumber(),getProductName(),getProductType(),
			Integer.toString(getQuantity()),getColour(),this.getCostPrice().toString(),
			getSellingPrice().toString(), getDescription()
		};
		
		return productString;
		/*
				"Brand Name:              " + getProductName() + "\n" +
				"Serial:                " + getModelNumber() + "\n" +
				"Product Type           " + getProductType()+"\n"+
				"Description:           " + getDescription()+ "\n" +
				"Colour                " + getColour() +"\n"+
				"Quantity:              " + getQuantity() + "\n" +
				"Selling Price          "+ getSellingPrice() + "\n"+
				"+++++++++++++++++++\n";
		*/
	}

	public void printProduct(){
		System.out.println("Brand Name:              " + getProductName() + "\n" +
		"Serial:                " + getModelNumber() + "\n" +
		"Product Type           " + getProductType()+"\n"+
		"Description:           " + getDescription()+ "\n" +
		"Colour                " + getColour() +"\n"+
		"Quantity:              " + getQuantity() + "\n" +
		"Selling Price          "+ getSellingPrice() + "\n"+
		"+++++++++++++++++++\n"); 
		
		/*"Brand Name:              " + getProductName() + "\n" +
		"Serial:                " + getModelNumber() + "\n" +
		"Product Type           " + getProductType()+"\n"+
		"Description:           " + getDescription()+ "\n" +
		"Colour                " + getColour() +"\n"+
		"Quantity:              " + getQuantity() + "\n" +
		"Selling Price          "+ getSellingPrice() + "\n"+
		"+++++++++++++++++++\n";*/
	}

	/*public static ArrayList<Product> getNewProducts(){
		return newProducts;
	}*/
}

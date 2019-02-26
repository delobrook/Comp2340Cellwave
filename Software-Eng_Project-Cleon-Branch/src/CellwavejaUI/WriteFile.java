package CellwavejaUI;

import java.io.*;

public class WriteFile {
	public static boolean writeToProductFile() {
		File files=new File("Files");
		File productInfo= new File("Files\\ProductFiles");
		if(files.exists()) {
			System.out.println("the folder already exists");
		}else {
			try {
				files.mkdirs();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (productInfo.exists()) {
			System.out.println("the files already exists");
			try {
				FileWriter filew= new FileWriter(productInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Product p: addproductinformationGUI.newProducts) {
					buffw.write(p.getModelNumber()+"//"+p.getProductName()+"//"+ p.getProductType() +"//"+p.getDescription()+"//"+p.getCostPrice()+"//"+p.getSellingPrice()+"//"+p.getQuantity()+"//"+p.getImageName()+"//"+p.getColour()+"\n" );
				}
				buffw.close();
				return true;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				productInfo.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter filew= new FileWriter(productInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Product p: addproductinformationGUI.newProducts) {
					buffw.write(p.getModelNumber()+"//"+p.getProductName()+"//"+ p.getProductType() +"//"+p.getDescription()+"//"+p.getCostPrice()+"//"+p.getSellingPrice()+"//"+p.getQuantity()+"//"+p.getImageName()+"//"+p.getColour()+"\n" );
				}
				buffw.write("hello ");
				buffw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}			
	public static boolean writeToCustomerFile() {
		File files=new File("Files");
		File customerInfo= new File("Files\\CustomersFile");
		if(files.exists()) {
			System.out.println("the folder already exists");
			
		}else {
			try {
				files.mkdirs();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (customerInfo.exists()) {
			System.out.println("the files already exists");
			try {
				FileWriter filew= new FileWriter(customerInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Customer c: Core.Customer.customers) {
					buffw.write(c.getCustomerid()+"//"+c.getName()+"//"+ c.getEmail() +"//"+c.getTelephone()+"//"+c.getAddressesasstring()+"//" );
				}
				buffw.close();
				return true;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
					customerInfo.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter filew= new FileWriter(customerInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Customer c: Core.Customer.customers) {
					buffw.write(c.getCustomerid()+"//"+c.getName()+"//"+ c.getEmail() +"//"+c.getTelephone()+"//"+c.getAddresses() );
				}
				buffw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}	
	public static boolean writeToTransactionFile() {
		File files=new File("Files");
		File transactionInfo= new File("Files\\TransactionFile");
		if(files.exists()) {
			System.out.println("the folder already exists");

		}else {
			try {
				files.mkdirs();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (transactionInfo.exists()) {
			System.out.println("the file already exists");
			try {
				FileWriter filew= new FileWriter(transactionInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Transaction t: AddnewTransactiontofile.newTransactions) {
					buffw.write(t.getTransactionNumber()+"//"+t.getCustomerId()+"//"+ t.getCustomerName() +"//"+t.getProductName()+"//"+t.getProductType()+"//"+t.getProductColour()+"//"+t.getTransactionDate()+"//"+t.getCashtendered()+"//"+t.getCashOrCard() );
				}
				buffw.close();
				return true;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
					transactionInfo.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter filew= new FileWriter(transactionInfo);
				BufferedWriter buffw=new BufferedWriter(filew);
				for(Core.Transaction t: AddnewTransactiontofile.newTransactions) {
					buffw.write(t.getTransactionNumber()+"//"+t.getCustomerId()+"//"+ t.getCustomerName() +"//"+t.getProductName()+"//"+t.getProductType()+"//"+t.getProductColour()+"//"+t.getTransactionDate()+"//"+t.getCashtendered()+"//"+t.getCashOrCard()+"//"+t.getProductModelNumber());
				}
				buffw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}			
}

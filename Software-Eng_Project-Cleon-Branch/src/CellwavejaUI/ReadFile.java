package CellwavejaUI;
import java.io.*;
import java.util.Date;

import Core.Product;
import Util.DateUtil;
public class ReadFile  {
	public static boolean readProductfile() {
		try {
			FileReader file= new FileReader("Files\\ProductFiles");
			BufferedReader reader= new BufferedReader(file); 
			
			String  text="";
			String line= reader.readLine();
			while(line!=null) {
				String []attributes=line.split("//");
				addproductinformationGUI.newProducts.add(Product.createProduct(attributes[0], attributes[1],attributes[2], attributes[3],Float.valueOf((attributes[4])),Float.valueOf( attributes[5]),Integer.valueOf( attributes[6]), attributes[7], attributes[8]));
				text+= line;
				line=reader.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public static boolean readCustomerfile() {
		try {
			FileReader file= new FileReader("Files\\CustomerFiles");
			BufferedReader reader= new BufferedReader(file); 
			
			String  text="";
			String line= reader.readLine();
			while(line!=null) {
				String []attributes=line.split("//");
				Core.Customer.customers.add(new Core.Customer(attributes[0], attributes[1],attributes[2], attributes[3],(attributes[4])));
				text+= line;
				line=reader.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public static boolean readTransactionfile() {
		try {
			FileReader file= new FileReader("Files\\TransactionFiles");
			BufferedReader reader= new BufferedReader(file); 
			
			String  text="";
			String line= reader.readLine();
			while(line!=null) {
				String []attributes=line.split("//");
				AddnewTransactiontofile.newTransactions.add(new Core.Transaction(Integer.parseInt(attributes[0]), DateUtil.stringToDate(attributes[6]),attributes[8], attributes[1],attributes[2],attributes[9],attributes[3],attributes[4],attributes[5],Float.parseFloat(attributes[7])));
				text+= line;
				line=reader.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}

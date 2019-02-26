package Core;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private  String customerid ;
    private  String telephone;
    private  String name ;
    private String email ;
    private  ArrayList<Address> addresses = new ArrayList<>();
    private  ArrayList<Transaction> transactions;
	public  static ArrayList <Customer> customers = new ArrayList<>();

    public Customer(String clid, String name_, String address_,
                  String tel_, String email_){
        this.transactions = getTransactions();
        // Parish pa = Parish.KingstonStAndrew;  // default parish
       

        this.addresses.add(new Address(address_));
        this.telephone = tel_;
        this.name = name_;
       this.customerid = clid;
        this.email = email_;
    }

    public  void menu(){
            Scanner scan = new Scanner(System.in);
			System.out.println("Customer Options: ");
			System.out.println("C: Create Customer");
			System.out.println("V: View Customer");
			System.out.println("E: Edit Customer");
			System.out.println("D: Delete Customer");
			System.out.println("q: Quit");
			String ch = scan.nextLine();
						do {
							switch (ch){
								case "C":
									createCustomer();
									break;
								case "V":
									viewCustomer();
									break;
								case "E":
									editCustomer();
									break;
								case "D":
									deleteCustomer();
									break;
							}
						} while (!ch.equals("q"));

	}

	private static void createCustomer() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the model number of the product.");
		String clid = read.nextLine() ;
		System.out.println("Enter the name of the product.");
		String name_ = read.nextLine() ;
		System.out.println("Enter the type of the product.");
		String tel_ = read.nextLine() ;
		System.out.println("Enter the description of the product.");
		String address_ = read.nextLine() ;
		System.out.println("Enter the cost price of the product.");
		String parish_ = read.nextLine() ;
		System.out.println("Enter the selling price of the product.");
		String email_ = read.nextLine() ;


		Customer e = new Customer( clid,  name_,  address_,  tel_,  email_);
		customers.add(e);



	}

	private void viewCustomer() {
    	tring();
	}

	private static void deleteCustomer() {
		for (Customer e : customers) {
			System.out.println(e);
		}
		System.out.println("Enter the Customer I.D. you want to remove.");
		Scanner read = new Scanner(System.in);
		String delete = read.nextLine();
		for (Customer e : customers) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if (e.equals(delete)) {
				customers.remove(e);
				System.out.println("Customer deleted.");

			} else {
				System.out.println("Customer not found!");
			}
		}

	}

	private void editCustomer() {
		String choice = null;
		Scanner scan = new Scanner(System.in);
		for (Customer a : customers) {
			System.out.println(a);
		}
		System.out.println("Enter the I.D. number of the customer you want to edit: ");
		String model = scan.nextLine();
		for (Customer a : customers) {
			//noinspection EqualsBetweenInconvertibleTypes,EqualsBetweenInconvertibleTypes
			if (a.equals(model)) {
				System.out.println(a);
				System.out.println("Edit Options: ");
				System.out.println("m: Client I.D.");
				System.out.println("N: Customer Name");
				System.out.println("t: Telephone Number");
				System.out.println("d: Email");
				System.out.println("C: Address");
				System.out.println("q: Quit");

				choice = scan.nextLine();
			}
			do {

				switch (Objects.requireNonNull(choice)) {
					case "m":
						a.setCustomerid(getCustomerid());
						break;
					case "N":
						a.setName(getName());

						break;
					case "t":
						a.setTelephone(getTelephone());
						break;
					case "d":
						a.setEmail(getEmail());
						break;
					case "C":
						//Customer.setAddresses(getAddresses());
						break;

				} // end of switch
			} while (!choice.equals("q"));


		}
	}

	public  String getTelephone() {
		return telephone;
	}

	public  String getEmail() {
		return email;
	}

	public  String getName() {
		return name;
	}

	public   ArrayList<Address> getAddresses() {
		return addresses;
	}

	public String getCustomerid() {
		return customerid;
	}
	
	public   String getAddressesasstring() {
		String s="";
		for(Address a: getAddresses()) {
			s=s+"/"+a.getAddress() ;
		}
		return s;
	}

	/*public static void setAddresses(ArrayList<Address> addresses) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the address (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new address.");
			String address = scan.nextLine();
			System.out.println("Does the customer live in the same parish (yes or no)? ");
			String ch = scan.nextLine();
			if (ch.equals("yes")){
				addresses.add(new Address(address,Address.getParish()));
			}else{
				System.out.println("Enter the new parish");
				String par = scan.nextLine();
				Parish pa = Parish.findByName(par);
				addresses.add(new Address(address,pa));

			}
		}else {
			System.out.println(addresses);
		}

	}*/

	public  void setEmail(String email) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the email (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new email.");
			this.email = scan.nextLine();
		}else {
			System.out.println(email);
		}
	}

	public  void setName(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the Customer name  (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new Customer name.");
			name = scan.nextLine();
		}else {
			System.out.println(name);
		}
	}

	public  void setTelephone(String telephone) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the telephone number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new telephone number.");
			telephone = scan.nextLine();
		}else {
			System.out.println(telephone);
		}
	}

	private void setCustomerid(String customerid) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you really want to change the I.D. number (yes or no)?  ");
		String choice = scan.nextLine();
		if (choice.equals("yes")) {
			System.out.println("Enter the new I.D. number.");
			this.customerid = scan.nextLine();
		}else {
			System.out.println(customerid);
		}
	}

	public String[] print(){
		String[] customerString = new String[]{
			getCustomerid(),getName(),getTelephone(),getTelephone(),getAddressesasstring()
			
		};
		
		return customerString;
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




	public  String tring() {
        String f = "Client: %s (%s)\n  Tel: %s%s%s";
        StringBuilder aa;
        aa = new StringBuilder("\n  Address:");
        for (Address b : addresses) {
            aa.append(String.format("\n    %s", b.toString()));
        }
        String a = "Email: %s\n";
        StringBuilder tt;
        tt = new StringBuilder("\n Transactions:");
        for (Transaction r : transactions){
			tt.append(String.format("\n    %s", r.toString()));
		}
        return String.format(f, name, customerid, telephone, aa.toString(),email, tt.toString());
    }

    public Parish getPrimaryParish(){
        Address p;
        try{
            p = addresses.get(0);
        }
        catch(Exception e){
            p = null;
        }
        return Objects.requireNonNull(p).getParish();
    }

    private  ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getCustomer() {
        return toString();
    }
}

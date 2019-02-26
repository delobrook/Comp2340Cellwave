package Core;

import java.util.Date;

import CellwavejaUI.addproductinformationGUI;

public class Transaction{

    private Date transactionDate;
    private String customerId;
    private String customerName;
    private String productModelNumber;
    private String productName;
    private String productType;
    private String productColour;
    private Float cashTendered;
    private int transactionNumber;
    private String cashOrcard;
    //private int productQuantity;
    //private ArrayList<Product> products = new ArrayList<Product>;

    public Transaction(int transactionNum, Date transactionDate, String cashOrCard, String customerId, String customerName, String productModelNumber,
                        String productName, String productType, String productColour, Float cashTendered){

        this.transactionDate = transactionDate;
        this.cashOrcard = cashOrCard;
        this.customerId = customerId;
        this.customerName = customerName;
        this.productModelNumber = productModelNumber;
        this.productName = productName;
        this.productType = productType;
        this.productColour = productColour;
        this.cashTendered = cashTendered;
        this.transactionNumber = transactionNum;

    }

    public int getTransactionNumber(){
        return transactionNumber;
    }

    public Date getTransactionDate(){
        return transactionDate;
    }

    public String getCashOrCard(){
        return cashOrcard;            
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductModelNumber() {
        return productModelNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductColour() {
        return productColour;
    }

    public Float getCashtendered(){
        return cashTendered;
    }

    public String[] print(){
		String[] transactionString = new String[]{
            Integer.toString(getTransactionNumber()),getCustomerId(), getProductModelNumber(),
            getProductName(), getProductType(), getProductColour(),getTransactionDate().toString(),
            Float.toString(getCashtendered()), getCashOrCard()
        };
        return transactionString;
    }
   
   
    public double taxes(double tax,String model) {
		

		double amount = 0;
		for (Core.Product p : addproductinformationGUI.newProducts) {
			if (p.equals(model)) {
				
				int item = p.getQuantity();

				return amount = item * p.getSellingPrice();
			}
		}


		return tax * amount;
	}


}

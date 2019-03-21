package Core;

import java.util.Date;

import CellwavejaUI.addproductinformationGUI;

public class Transaction{

    private String transactionDate;
    private String customerId;
    private String customerName;
    private String productModelNumber;
    private String productName;
    private String productType;
    private String productColour;
    private Float cashTendered;
    private int transactionNumber;
    private String cashOrcard;
    private Product product;
    //private int productQuantity;
    //private ArrayList<Product> products = new ArrayList<Product>;

    public Transaction(int transactionNum, String transactionDate, String cashOrCard, String customerId, String customerName, String productModelNumber,
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
        for (int i=0; i<addproductinformationGUI.newProducts.size(); i++){
        	if (addproductinformationGUI.newProducts.get(i).getModelNumber()==productModelNumber&&addproductinformationGUI.newProducts.get(i).getColour()==productColour&&addproductinformationGUI.newProducts.get(i).getProductName()==productName&&addproductinformationGUI.newProducts.get(i).getProductType()==productType) {
        		product=addproductinformationGUI.newProducts.get(i);
        	}
        }

    }

    public int getTransactionNumber(){
        return transactionNumber;
    }
    public String getTransactionMonth() {
    	return this.transactionDate.substring(3,5);
    }
    public String getTransactionYear() {
    	return this.transactionDate.substring(7, 11);
    }
    public String getTMonthYear() {
    	return transactionDate.substring(3,4);
    }
    public String getTransactionDate(){
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
        return this.cashTendered;
    }

    public String[] print(){
		String[] transactionString = new String[]{
            Integer.toString(getTransactionNumber()),getCustomerId(), getProductModelNumber(),
            getProductName(), getProductType(), getProductColour(),getTransactionDate().toString(),
            Float.toString(getCashtendered()), getCashOrCard()
        };
        return transactionString;
    }
   
   



}

package Core;

class Address {
    private final String address;
    private static Parish parish = null;

    Address(String street){
        this.address = street;
       
    }

    public Address(String street, String p){
        this.address = street;
        parish = Parish.findByName(p);
    }

    public String getAddress(){
        return String.format("%s", this.address);
    }
    public String getAddressOnly(){
        return this.address;
    }

    static Parish getParish(){
        return parish;
    }

    public String toString(){
        return getAddress();
    }
}

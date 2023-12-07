package reference;

public class Address {
    private String village;
    private String street;
    private int doorNo;
    private int pincode;

    public String getVillage() {
        return village;
    }

    public String getStreet() {
        return street;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public int getPincode() {
        return pincode;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(String village,String street,int doorNo,int pincode) {
        this.village = village;
        this.street=street;
        this.doorNo=doorNo;
        this.pincode=pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", street='" + street + '\'' +
                ", doorNo=" + doorNo +
                ", pincode=" + pincode +
                '}';
    }
}

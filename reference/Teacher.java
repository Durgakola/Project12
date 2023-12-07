package reference;

public class Teacher {
    private String teachername;
    private int phonenumber;
    private String qulification;
    private Address address;

    public String getTeachername() {
        return teachername;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getQulification() {
        return qulification;
    }

    public Address getAddress() {
        return address;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Teacher(String teachername,int phonenumber,String qulification,Address address) {
        this.teachername = teachername;
        this.phonenumber=phonenumber;
        this.qulification=qulification;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachername='" + teachername + '\'' +
                ", phonenumber=" + phonenumber +
                ", qulification='" + qulification + '\'' +
                ", address=" + address +
                '}';
    }
}

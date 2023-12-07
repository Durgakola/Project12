package reference;

public class Student {
    private int rollNo;
    private String name;
    private Address address;

//getter:
    public int getRollNo() {

        return rollNo;
    }
    public String getName() {

        return name;
    }
    public Address getAddress() {

        return address;
    }
    //setters:
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //constructor:
    public Student(int rollNo,String name,Address address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;

    }
    //toString:

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

package reference;

public class School {
    private String schoolname;
    private String location;
    private int classrooms;
    private Address address;

    public String getSchoolname() {
        return schoolname;
    }

    public String getLocation() {
        return location;
    }

    public int getClassrooms() {
        return classrooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public School(String schoolname,String location,int classrooms,Address address) {
        this.schoolname = schoolname;
        this.location=location;
        this.classrooms=classrooms;
        this.address=address;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolname='" + schoolname + '\'' +
                ", location='" + location + '\'' +
                ", classrooms=" + classrooms +
                ", address=" + address +
                '}';
    }
}

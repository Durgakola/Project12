package reference;

public class Testclass {
    public Address getAddress(Student s,School sch,Teacher tea) {

        Address a1 = new Address("Taduvai", "Gandhibommalu", 1097, 522409);
        Address a2 = new Address("hyd", "kousalyacolony", 1056, 544096);

        Address b1 = new Address("Guntur", "kphb", 1234, 785943);
        Address c1 = new Address("Krishna", "moosapet", 8976, 678567);


        Student s1 = new Student(101, "durga", a1);
        Student s2 = new Student(102, "ramya", a2);


        School sch1 = new School("K.G.B.V Vidhyalayam", "Bapatla", 10, b1);
        Teacher tea1 = new Teacher("sandhya", 1234567890, "PG", c1);

        if (s != null) {
            if (s.getRollNo() == s1.getRollNo()) {
                return s1.getAddress();
            } else if (s.getRollNo() == s2.getRollNo()) {
                return s2.getAddress();
            } else {
                return null;
            }
        }
        if (sch != null) {

            if (sch.getSchoolname() == sch1.getSchoolname()) {
                return sch1.getAddress();
            } else {
                return null;
            }

        }
        if (tea != null) {
            if (tea.getTeachername() == tea1.getTeachername()) {
                return tea1.getAddress();
            } else {
                return null;
            }
        }
        return null;
    }
    //assainment:

    public static void main(String[] args) {
        Testclass t=new Testclass();
        Student s=new Student(102,"durga",null);
        School sch=new School("K.G.B.V Vidhyalayam","Bapatla",10,null);
        Teacher tea=new Teacher("sandhya",1234567890,"PG",null);


        System.out.println(t.getAddress(null,null,tea));
        //System.out.println(sch);
        System.out.println(t.getAddress(s,null,null));

        System.out.println(t.getAddress(null,sch,null));

    }
}

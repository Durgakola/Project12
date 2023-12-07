package exception;

public class ExceptionClient {
    public static void main(String[] args) {
        Student student=new Student();
        Hello h = new Hello();
        String str= h.upperCase(student);
        System.out.println(str);
    }
}

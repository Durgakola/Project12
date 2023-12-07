import Model.Database;

public class Main {
    public static void main(String[] args) {
        Database or=new Oracle();
        or.getconnection();
        Database sql=new MySQL();
        sql.getconnection();

    }
}

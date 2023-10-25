import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static final String DB_URL = "jdbc:mariadb://localhost:3306/compta";
    public static final String DB_USER = "root";
    public static final String DB_PW = "root";

    public static void main(String[] args) {

        try (Connection cnx = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            System.out.println(cnx);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

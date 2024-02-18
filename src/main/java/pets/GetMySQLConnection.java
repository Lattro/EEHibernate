package pets;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetMySQLConnection
{
    private static String url = "jdbc:mysql://localhost/pets?serverTimezone=Europe/Moscow&useSSL=false";
    private static String username="root";
    private static String password ="5467";
    public static Connection getConnection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection connection = DriverManager.getConnection(url,username,password);
        return  connection;
    }
}

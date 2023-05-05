package SingleResponsibilityPrinciple.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection connection;

    private static final DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Database url");
        System.out.println("Connection is done");
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Connection is down");
    }
}

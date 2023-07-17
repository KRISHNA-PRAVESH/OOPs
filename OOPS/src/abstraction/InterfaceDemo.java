package abstraction;

// Interface representing a Database Connection
interface DatabaseConnection {
    void connect();
    void executeQuery(String query);
    void disconnect();



}

// Implementation of a Database Connection for MySQL
class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL Database.");
    }
}

// Implementation of a Database Connection for PostgreSQL
class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL Database.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        //Interface provide loose coupling between classes, not worry about the hierachy levels like we do while using abstract class
       // all methods in an interface are by default abstract and must be implemented by any class that implements the interface.

        //since java 8, interfaces can have method definition, only if the corresponding method is private,static or default.

        //interfaces in Java can have variables, but they are treated as constants. These variables are implicitly public, static, and final (constants) and must be assigned a value when declared. They represent data that is shared across implementing classes.
        DatabaseConnection mysqlConnection = new MySQLConnection();
        mysqlConnection.connect();
        mysqlConnection.executeQuery("SELECT * FROM users");
        mysqlConnection.disconnect();

        System.out.println("-------------------");

        DatabaseConnection postgresqlConnection = new PostgreSQLConnection();
        postgresqlConnection.connect();
        postgresqlConnection.executeQuery("SELECT * FROM customers");
        postgresqlConnection.disconnect();
    }
}


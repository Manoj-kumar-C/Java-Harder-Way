import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String url;
    private String username;
    private String password;
    private Connection conn;

    /**
     * Prepares the things for the connection.
     * @param hostname
     * @param database
     * @param port
     * @param username
     * @param password
     */
    public MySQL(String hostname, String database, String port, String username, String password) {
        this.username = username;
        this.password = password;

        this.url = String.format("jdbc:mysql://%s:%s/%s", hostname, port, database);
    }

    public Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName(DRIVER);
        conn = DriverManager.getConnection(url, username, password);

        return conn;
    }

    public static void main(String[] args) {
        String hostname = "jdl.h.filess.io";
        String database = "testjdbc_deadfallby";
        String port = "3306";
        String username = "testjdbc_deadfallby";
        String password = "9e365b9f2a79ee826bcda395486e18c39a84be7b";

        MySQL mysql = new MySQL(hostname, database, port, username, password);
        try {
            Connection conn = mysql.connect();

            if (!conn.isClosed()) {
                System.out.println("Connected to the database!");

                // Execute a sample query
                ResultSet resultSet = conn.createStatement().executeQuery("SELECT 1+1");
                if (resultSet.next()) {
                    System.out.println("Result of query: " + resultSet.getInt(1));
                }

                // Close the connection
                conn.close();
                System.out.println("Connection closed!");
            } else {
                System.out.println("Failed to connect to the database!");
            }

        } catch (SQLException e) {
            System.out.println("A MySQL error occurred!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("An error occurred unrelated to MySQL!");
            e.printStackTrace();
        }
    }
}

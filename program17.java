import java.sql.Connection; 

import java.sql.DriverManager; 

import java.sql.SQLException; 

 

public class DatabaseConnectivity { 

    public static void main(String[] args) { 

        // Database credentials 

        String url = "jdbc:mysql://localhost:3306/yourDatabase"; 

        String user = "username"; 

        String password = "password"; 

 

        // Attempt to establish connection 

        try { 

            // Register the JDBC driver 

            Class.forName("com.mysql.cj.jdbc.Driver"); 

 

            // Open a connection 

            Connection connection = DriverManager.getConnection(url, user, password); 

 

            // Check if connection is successful 

            if (connection != null) { 

                System.out.println("Connected to the database successfully!"); 

                // Perform database operations here 

            } else { 

                System.out.println("Failed to connect to the database."); 

            } 

 

            // Close the connection 

            connection.close(); 

        } catch (ClassNotFoundException e) { 

            System.out.println("Error: JDBC driver not found!"); 

            e.printStackTrace(); 

        } catch (SQLException e) { 

            System.out.println("Error: Failed to connect to the database!"); 

            e.printStackTrace(); 

        } 

    } 

} 

 
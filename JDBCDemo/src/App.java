
import java.sql.*;

public class App {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "India@11";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //loading jdbc driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password); //connecting to databas

            // *** Data inserted into database using prepareStatement ***


            // String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            // // statement statement = connection.createStatement();
            // PreparedStatement pst = connection.prepareStatement(query);
            // pst.setString(1, "Ankita");
            // pst.setInt(2, 23);
            // pst.setDouble(3, 85.5);
            // int rowsAffected = pst.executeUpdate();
            // if (rowsAffected > 0) {
            //     System.out.println(" Data inserted successfully");
            // } else {
            //     System.out.println("data is not inserted successfully");
            // }
            // *** Data retrive from database using prepareStatement ***
            // String query = "SELECT marks FROM students WHERE id = ?";
            // PreparedStatement preparedStatement = connection.prepareStatement(query);
            // preparedStatement.setInt(1, 1);
            // ResultSet resultSet = preparedStatement.executeQuery();
            // if (resultSet.next()) {
            //     double marks = resultSet.getDouble("marks");
            //     System.out.println("Marks: " + marks);
            // } else {
            //     System.out.println("Marks not found");
            // }





            // *** Data update from database using prepareStatement ***

            // String query = "UPDATE students SET marks = ?,age = ? WHERE  id = ?";
            // PreparedStatement preparedStatement = connection.prepareStatement(query);
            // preparedStatement.setDouble(1, 99.5);
            // preparedStatement.setInt(2, 500);
            // preparedStatement.setInt(3, 3);
            // int rowsAffected = preparedStatement.executeUpdate();
            // if (rowsAffected > 0) {
            //     System.out.println("Data Updated Successfully");
            // } else {
            //     System.out.println("Data is not updated successfully");
            // }
            // *** Data Delete from database using prepareStatement ***
            // String query = "DELETE FROM students WHERE id =? ";
            // PreparedStatement preparedStatement = connection.prepareStatement(query);
            // preparedStatement.setInt(1, 1);
            // int rowsAffected = preparedStatement.executeUpdate();
            // if (rowsAffected > 0) {
            //     System.out.println("Data deleted successfully");
            // } else {
            //     System.out.println("Data is not deleted successfully");
            // }






            // ####### Batch Processing using statement #######
            
            // Statement statement = connection.createStatement();
            // Scanner sc = new Scanner(System.in);
            // while (true) {
            //     System.out.println("Enter name: ");
            //     String name = sc.next();
            //     System.out.println("Enter age: ");
            //     int age = sc.nextInt();
            //     System.out.println("Enter Marks: ");
            //     double marks = sc.nextDouble();
            //     System.out.print("Enter More Data (Y/N)");
            //     String choice = sc.next();
            //     String query = String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,%f)", name, age, marks);
            //     statement.addBatch(query);
            //     if (choice.toUpperCase().equals("N")) {
            //         break;
            //     }
            // }
            // int[] arr = statement.executeBatch();
            // for (int i = 0; i < arr.length; i++) {
            //     if (arr[i] == 0) {
            //         System.out.println("Query: " + i + "  not executed Sucessfully");
            //     }
            // }



            


            // ####### Batch Processing using prepared statement #######

            // String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            // PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Scanner sc = new Scanner(System.in);
            // while (true) {
            //     System.out.println("Enter name: ");
            //     String name = sc.next();
            //     System.out.println("Enter age: ");
            //     int age = sc.nextInt();
            //     System.out.println("Enter Marks: ");
            //     double marks = sc.nextDouble();
            //     System.out.print("Enter More Data (Y/N)");
            //     String choice = sc.next();

            //     preparedStatement.setString(1, name);
            //     preparedStatement.setInt(2, age);
            //     preparedStatement.setDouble(3, marks);

            //     preparedStatement.addBatch();
            //     if (choice.toUpperCase().equals("N")) {
            //         break;
            //     }
            // }
            // int[] arr = preparedStatement.executeBatch();

            // for (int i = 0; i < arr.length; i++) {
            //     if (arr[i] == 0) {
            //         System.out.println("Query: " + i + "  not executed Sucessfully");
            //     }
            // }



            // *********** Transaction Handleing ****************************

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

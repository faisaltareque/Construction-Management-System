package construction;


import construction.Helper.CalendarHelp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



public class Construction {    
    public static void main(String[] args) {
//        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
//            String query="select Engineer.ID from Engineer where ID like 'ENG2004'";         
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            resultSet.next();
//            System.out.println(resultSet.getString("ID"));
//            //JOptionPane.showMessageDialog(null,"Deleted Successfully!");
//                    
//        }catch (Exception e) {
//          JOptionPane.showMessageDialog(null,"ID is not found!!!");
//        }
//        FrontPage frontPage=new FrontPage();
//        frontPage.setVisible(true);
        System.out.println(CalendarHelp.getCurrentMonth());
    }    
}

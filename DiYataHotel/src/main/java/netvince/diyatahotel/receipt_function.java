/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netvince.diyatahotel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Curtis
 */
public class receipt_function {
    public static String login_name;
    public static void transaction_type(String payment, String desc, String stats){
        try {
                Connection connection = netvince.diyatahotel.connect.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `transaction type table`");
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                int rowCount = resultSet.getInt("rowCount");
                PreparedStatement add = connection.prepareStatement(
                "INSERT INTO `transaction type table`("
                + "`transactiontype_id`, `transactiontype_paymentmode`,"
                + "`transactiontype_description`, `transactiontype_status`)"
                + "VALUES (?,?,?,?)");
                add.setInt(1, rowCount + 1);
                add.setString(2, payment);
                add.setString(3, desc);
                add.setString(4, stats);
                add.executeUpdate();
                }
            }
            catch (SQLException e) {
            e.printStackTrace();
            }
    }
    public static void transaction(int typeid, String mode, Date date, double appfee, double amtfee, double total){
        try {
                Connection connection = netvince.diyatahotel.connect.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `financial transactions table`");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                    int rowCount = resultSet.getInt("rowCount");
                    PreparedStatement add = connection.prepareStatement(
                    "INSERT INTO `financial transactions table`"
                    + "(`transactions_id`, `transaction_paymentmode`,"
                    + "`transaction_date`, `transaction_applicablefee`,"
                    + "`transaction_amountfee`, `transaction_totalamount`)"
                    + "VALUES (?,?,?,?,?,?)");
                    add.setInt(1, rowCount + 1);
                    add.setString(2, mode);
                    add.setDate(3, date);
                    add.setDouble(4, appfee);
                    add.setDouble(5, amtfee);
                    total = appfee+amtfee;
                    add.setDouble(6, total);
                    add.executeUpdate();
                    }
            }
            catch (SQLException e) {
            e.printStackTrace();
            }
    }
    public static void transaction_overview(String recpname, int guestID, String mode, int roomID, Date checkin, Date checkout,String type){
        try {
                Connection connection = netvince.diyatahotel.connect.getConnection();
                        PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS rowCount FROM `transaction overview table`");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                    int rowCount = resultSet.getInt("rowCount");
                    PreparedStatement add = connection.prepareStatement(
                    "INSERT INTO `transaction overview table`"
                    + "(`transactionoverview_id`, `reception_name`,"
                    + "`guest_id`, `transactiontype_paymentmode`,"
                    + "`room_id`, `checkin_date`,"
                    + "`checkout_date`,`transactiontype`)"
                    + "VALUES (?,?,?,?,?,?,?,?)");
                    add.setInt(1, rowCount + 1);
                    add.setString(2, recpname);
                    add.setInt(3, guestID);
                    add.setString(4, mode);
                    add.setInt(5, roomID);
                    add.setDate(6, checkin);
                    add.setDate(7, checkout);
                    add.setString(8,type);
                    add.executeUpdate();
                    }
            }
            catch (SQLException e) {
            e.printStackTrace();
            }
    }
}
//CHECKOUT NOTES
//LOYALTY LEVEL + 1
//TRANSACTION TYPE
//FINANCIAL TRANSACTION INCLUDES CHECKOUT AND RESERVATION
//TRANSACTION OVERVIEW INCLUDES DATAS FROM GUEST, ROOM, CHECKIN, RECEPTION
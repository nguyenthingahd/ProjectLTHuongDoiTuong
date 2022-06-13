package qlnhanviendh;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;

public class Account_Activity {

    private static Connection conn;

    public static void set_connect_mysql(Connection connect) {
        conn = connect;
    }

    public static ArrayList<Account> get_list_account() {
        ArrayList<Account> arr_account = new ArrayList<Account>();
        try {
            String sql = "SELECT * FROM account";
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                Account account = new Account();
                account.setUsername(result.getString("username"));
                account.setPassword(result.getString("password"));
                arr_account.add(account);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return arr_account;
    }
    
    public static Account check_account(Account account){
        Account acc = new Account();
        acc.setUsername(null);
        acc.setPassword(null);
        try {
            String sql = "SELECT * FROM account WHERE username LIKE '" + account.getUsername() + "'" + " AND password LIKE '" + account.getPassword() + "'";
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                acc.setUsername(result.getString(1));
                acc.setPassword(result.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return acc;
    }
    
    public static void insert_account(Account account){
        try{
            String sql = "INSERT INTO account VALUES (? , ?)";
            PreparedStatement prst = conn.prepareStatement(sql);
            
            prst.setString(1, account.getUsername());
            prst.setString(2, account.getPassword());
            
            prst.executeUpdate();
            prst.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
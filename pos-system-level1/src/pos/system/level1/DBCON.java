/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * To use this class , First connect using connect() method Then to get data use
 * getData() Method To insert and update use updateInsertData() method
 *
 * @author sandeep
 */
public class DBCON {

    Connection con;
    Statement st;
    public ResultSet rs;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_test", "root", "12345678");
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getData(String query) {
        try {
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBCON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateInsertData(String query) {
        try {
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            Logger.getLogger(DBCON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBCON.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

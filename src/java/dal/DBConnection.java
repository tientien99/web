/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tienm
 */
public class DBConnection {

      protected Connection conn;

      public DBConnection() {
            try {
                  String user = "sa";
                  String password = "123123";
                  String url = "jdbc:sqlserver://DESKTOP-AM6RPTO\\SQLEXPRESS:1433;databaseName=PROJECT";
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  conn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException ex) {
                  Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      public void disconect() {
            try {
                  if (conn != null && !conn.isClosed()) {
                        conn.close();
                  }
            } catch (SQLException ex) {
                  Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

}

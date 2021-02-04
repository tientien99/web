/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;

/**
 *
 * @author tienm
 */
public class AdminDAO extends DBConnection {

      public ArrayList<Admin> getAllAccAdmin() {
            ArrayList<Admin> admin = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM Admin";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ResultSet rs = ptmt.executeQuery();
                  while (rs.next()) {
                        Admin acc = new Admin();
                        acc.setUserName(rs.getString("UserName"));
                        acc.setPassword(rs.getString("Password"));
                        admin.add(acc);
                  }
            } catch (SQLException ex) {
                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return admin;
      }

      public boolean checkAdminLogin(Admin acc) {
            ArrayList<Admin> al = getAllAccAdmin();
            if (al.isEmpty()) {
                  return true;
            } else {
                  for (Admin admin : al) {
                        if (admin.getUserName().trim().equals(acc.getUserName()) && admin.getPassword().trim().equals(acc.getPassword())) {
                              return true;
                        }
                  }
            }
            return false;
      }
}

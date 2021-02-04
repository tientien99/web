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
import model.GiangVien;
import model.Khoa;
import model.Lop;
import model.MonHoc;

/**
 *
 * @author tienm
 */
public class LopDAL extends DBConnection {

      public ArrayList<Lop> getAllIdClass() {
            ArrayList<Lop> lops = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM LOP WHERE Status = 1";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ResultSet rs = ptmt.executeQuery();
                  while (rs.next()) {
                        Lop lop = new Lop();
                        Khoa khoa = new Khoa();
                        MonHoc mh = new MonHoc();
                        lop.setMaLop(rs.getString("MaLop"));
                        lop.setTenLop(rs.getString("TenLop"));
                        lop.setKhoa((Khoa) rs.getObject("MaKhoa"));
                        lop.setGv((GiangVien) rs.getObject("MaGiangVien"));
                        lop.setStatus(true);
                        lops.add(lop);
                  }
            } catch (SQLException ex) {
                  Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
            return lops;
      }

}

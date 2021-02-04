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
import model.Acc_SinhVien;
import model.SinhVien;

/**
 *
 * @author tienm
 */
public class StudentDAO extends DBConnection {

      public int insertOne(Acc_SinhVien acc) {
            int status = 0;
            try {
                  String sql = "INSERT INTO ACC_SINHVIEN (TenTaiKhoan, MatKhau, Status) VALUES (?,?, ?)";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ptmt.setString(1, acc.getAcc());
                  ptmt.setString(2, acc.getPass());
                  ptmt.setBoolean(3, true);
                  status = ptmt.executeUpdate();

                  disconect();
            } catch (SQLException ex) {
                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return status;
      }

      public ArrayList<Acc_SinhVien> getAllAccStudent() {
            ArrayList<Acc_SinhVien> acc_SinhViens = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM ACC_SINHVIEN WHERE Status = 1";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ResultSet rs = ptmt.executeQuery();
                  while (rs.next()) {
                        Acc_SinhVien acc = new Acc_SinhVien();
                        acc.setAcc(rs.getString("TenTaiKhoan"));
                        acc.setPass(rs.getString("MatKhau"));
                        acc_SinhViens.add(acc);
                  }
            } catch (SQLException ex) {
                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return acc_SinhViens;
      }

      public boolean checkStudentLogin(Acc_SinhVien acc) {
            ArrayList<Acc_SinhVien> al = getAllAccStudent();
            if (al.isEmpty()) {
                  return true;
            } else {
                  for (Acc_SinhVien acc_SinhVien : al) {
                        if (acc_SinhVien.getAcc().trim().equals(acc.getAcc()) && acc_SinhVien.getPass().trim().equals(acc.getPass())) {
                              return true;
                        }
                  }
            }
            return false;
      }

      public int updatePassStudent(Acc_SinhVien asv) {
            int status = 0;
            try {
                  String sql = "UPDATE ACC_SINHVIEN set MatKhau = ? where TenTaiKhoan = ?";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ptmt.setString(1, asv.getPass());
                  ptmt.setString(2, asv.getAcc());
                  status = ptmt.executeUpdate();
                  conn.close();
            } catch (SQLException ex) {
                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return status;
      }

//      public ArrayList<Acc_SinhVien> getUserByAcc() {
//            ArrayList<Acc_SinhVien> acc_SinhViens = new ArrayList<>();
//            try {
//                  String sql = "SELECT * FROM ACC_SINHVIEN WHERE TenTaiKhoan = ?";
//                  PreparedStatement ptmt = conn.prepareStatement(sql);
//                  ResultSet rs = ptmt.executeQuery();
//                  while (rs.next()) {
//                        Acc_SinhVien acc = new Acc_SinhVien();
//                        acc.setAcc(rs.getString("TenTaiKhoan"));
//                        acc.setPass(rs.getString("MatKhau"));
//                        acc_SinhViens.add(acc);
//                  }
//            } catch (SQLException ex) {
//                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            return acc_SinhViens;
//      }
      public ArrayList<SinhVien> getAllStudent() {
            ArrayList<SinhVien> sinhViens = new ArrayList<>();
            try {
                  String sql = "SELECT * FROM SINHVIEN WHERE Status = 1";
                  PreparedStatement ptmt = conn.prepareStatement(sql);
                  ResultSet rs = ptmt.executeQuery();
                  while (rs.next()) {
                        SinhVien sv = new SinhVien();
                        sv.setMaSV(rs.getString("MaSinhVien"));
                        sv.setTenSV(rs.getString("TenSinhVien"));
                        sv.setAccString(rs.getString("TenTaiKhoan"));
                        sv.setDob(rs.getDate("NgaySinh"));
                        sv.setLop(rs.getString("MaLop"));
                        sv.setKhoa(rs.getString("MaKhoa"));
                        sv.setStatus(rs.getBoolean("Status"));
                        sinhViens.add(sv);
                  }
            } catch (SQLException ex) {
                  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return sinhViens;
      }

      public boolean checkAccAlreadySinhVien(String userName) {
            ArrayList<SinhVien> s = getAllStudent();
            if (s.isEmpty()) {
                  return true;
            } else {
                  for (SinhVien sinhVien : s) {
                        if (sinhVien.getAccString().trim().equals(userName.trim())) {
                              return true;
                        }
                  }
            }
            return false;
      }
}

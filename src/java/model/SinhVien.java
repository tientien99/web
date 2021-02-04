/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author tienm
 */
public class SinhVien {

      private String maSV;
      private String tenSV;
      private String accString;
      private Date dob;
      private String lop;
      private String khoa;
      private boolean status;

      public SinhVien() {
      }

      public SinhVien(String maSV, String tenSV, String accString, Date dob, String lop, String khoa, boolean status) {
            this.maSV = maSV;
            this.tenSV = tenSV;
            this.accString = accString;
            this.dob = dob;
            this.lop = lop;
            this.khoa = khoa;
            this.status = status;
      }

      public String getMaSV() {
            return maSV;
      }

      public void setMaSV(String maSV) {
            this.maSV = maSV;
      }

      public String getTenSV() {
            return tenSV;
      }

      public void setTenSV(String tenSV) {
            this.tenSV = tenSV;
      }

      public String getAccString() {
            return accString;
      }

      public void setAccString(String accString) {
            this.accString = accString;
      }

      public Date getDob() {
            return dob;
      }

      public void setDob(Date dob) {
            this.dob = dob;
      }

      public String getLop() {
            return lop;
      }

      public void setLop(String lop) {
            this.lop = lop;
      }

      public String getKhoa() {
            return khoa;
      }

      public void setKhoa(String khoa) {
            this.khoa = khoa;
      }

      public boolean isStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }

}

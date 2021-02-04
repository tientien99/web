/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tienm
 */
public class GiangVien {

      private String maGV;
      private String tenGV;
      private String accString;
      private String passString;
      private boolean status;

      public GiangVien() {
      }

      public GiangVien(String maGV, String tenGV, String accString, String passString, boolean status) {
            this.maGV = maGV;
            this.tenGV = tenGV;
            this.accString = accString;
            this.passString = passString;
            this.status = status;
      }

      public String getMaGV() {
            return maGV;
      }

      public void setMaGV(String maGV) {
            this.maGV = maGV;
      }

      public String getTenGV() {
            return tenGV;
      }

      public void setTenGV(String tenGV) {
            this.tenGV = tenGV;
      }

      public String getAccString() {
            return accString;
      }

      public void setAccString(String accString) {
            this.accString = accString;
      }

      public String getPassString() {
            return passString;
      }

      public void setPassString(String passString) {
            this.passString = passString;
      }

      public boolean isStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }

}

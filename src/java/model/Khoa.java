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
public class Khoa {

      private String maKhoa;
      private String tenKhoa;
      private boolean status;

      public Khoa() {
      }

      public Khoa(String maKhoa, String tenKhoa, boolean status) {
            this.maKhoa = maKhoa;
            this.tenKhoa = tenKhoa;
            this.status = status;
      }

      public String getMaKhoa() {
            return maKhoa;
      }

      public void setMaKhoa(String maKhoa) {
            this.maKhoa = maKhoa;
      }

      public String getTenKhoa() {
            return tenKhoa;
      }

      public void setTenKhoa(String tenKhoa) {
            this.tenKhoa = tenKhoa;
      }

      public boolean isStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }

}

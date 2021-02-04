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
public class HocKy {

      private String maHK;
      private String tenHK;

      public HocKy() {
      }

      public HocKy(String maHK, String tenHK) {
            this.maHK = maHK;
            this.tenHK = tenHK;
      }

      public String getMaHK() {
            return maHK;
      }

      public void setMaHK(String maHK) {
            this.maHK = maHK;
      }

      public String getTenHK() {
            return tenHK;
      }

      public void setTenHK(String tenHK) {
            this.tenHK = tenHK;
      }

}

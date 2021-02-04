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
public class MonHoc {

      private String maMH;
      private String tenMH;
      private GiangVien gv;
      private boolean status;

      public MonHoc() {
      }

      public MonHoc(String maMH, String tenMH, GiangVien gv, boolean status) {
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.gv = gv;
            this.status = status;
      }

      public String getMaMH() {
            return maMH;
      }

      public void setMaMH(String maMH) {
            this.maMH = maMH;
      }

      public String getTenMH() {
            return tenMH;
      }

      public void setTenMH(String tenMH) {
            this.tenMH = tenMH;
      }

      public GiangVien getGv() {
            return gv;
      }

      public void setGv(GiangVien gv) {
            this.gv = gv;
      }

      public boolean isStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }

}

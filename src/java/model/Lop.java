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
public class Lop {

      private String maLop;
      private String tenLop;
      private Khoa khoa;
      private GiangVien gv;
      private boolean status;

      public Lop() {
      }

      public Lop(String maLop, String tenLop, Khoa khoa, GiangVien gv, boolean status) {
            this.maLop = maLop;
            this.tenLop = tenLop;
            this.khoa = khoa;
            this.gv = gv;
            this.status = status;
      }

      public String getMaLop() {
            return maLop;
      }

      public void setMaLop(String maLop) {
            this.maLop = maLop;
      }

      public String getTenLop() {
            return tenLop;
      }

      public void setTenLop(String tenLop) {
            this.tenLop = tenLop;
      }

      public Khoa getKhoa() {
            return khoa;
      }

      public void setKhoa(Khoa khoa) {
            this.khoa = khoa;
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

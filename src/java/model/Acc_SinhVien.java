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
public class Acc_SinhVien {

      private String acc;
      private String pass;
      private boolean status;

      public Acc_SinhVien() {
      }

      public Acc_SinhVien( String acc, String pass, boolean status) {
            this.acc = acc;
            this.pass = pass;
            this.status = status;
      }

      public String getAcc() {
            return acc;
      }

      public void setAcc(String acc) {
            this.acc = acc;
      }

      public String getPass() {
            return pass;
      }

      public void setPass(String pass) {
            this.pass = pass;
      }

      public boolean isStatus() {
            return status;
      }

      public void setStatus(boolean status) {
            this.status = status;
      }

}

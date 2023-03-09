/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoaQua;
import java.util.Scanner;

/**
 *
 * @author nhu quynh
 */
public class hoaQua {
  
    public String tenhoaQua;

    /**
     * Get the value of tenhoaQua
     *
     * @return the value of tenhoaQua
     */
    public String getTenhoaQua() {
        return tenhoaQua;
    }

    /**
     * Set the value of tenhoaQua
     *
     * @param tenhoaQua new value of tenhoaQua
     */
    public void setTenhoaQua(String tenhoaQua) {
        this.tenhoaQua = tenhoaQua;
    }

    public String xuatXu;

    /**
     * Get the value of xuatXu
     *
     * @return the value of xuatXu
     */
    public String getXuatXu() {
        return xuatXu;
    }

    /**
     * Set the value of xuatXu
     *
     * @param xuatXu new value of xuatXu
     */
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public float canNang;

    /**
     * Get the value of canNang
     *
     * @return the value of canNang
     */
    public float getCanNang() {
        return canNang;
    }

    /**
     * Set the value of canNang
     *
     * @param canNang new value of canNang
     */
    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public hoaQua(String tenhoaQua, String xuatXu, float canNang) {
        this.tenhoaQua = tenhoaQua;
        this.xuatXu = xuatXu;
        this.canNang = canNang;
         Scanner sc= new Scanner(System.in);
    }
  
}

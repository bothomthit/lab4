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
public class QuaCam extends hoaQua {
    
    public QuaCam(String tenhoaQua, String xuatXu, float canNang) {
        super(tenhoaQua, xuatXu, canNang);
    }
    
    public float soLuong;

    /**
     * Get the value of soLuong
     *
     * @return the value of soLuong
     */
    public float getSoLuong() {
        return soLuong;
    }

    /**
     * Set the value of soLuong
     *
     * @param soLuong new value of soLuong
     */
    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public String ngayNhap;

    /**
     * Get the value of ngayNhap
     *
     * @return the value of ngayNhap
     */
    public String getNgayNhap() {
        return ngayNhap;
    }

    /**
     * Set the value of ngayNhap
     *
     * @param ngayNhap new value of ngayNhap
     */
    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
 Scanner sc= new Scanner(System.in);
}

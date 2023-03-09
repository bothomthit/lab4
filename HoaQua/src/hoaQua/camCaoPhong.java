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
public class camCaoPhong extends QuaCam {
    
    public camCaoPhong(String tenhoaQua, String xuatXu, float canNang) {
        super(tenhoaQua, xuatXu, canNang);
    }
    
    public float giaBan
   ;

    /**
     * Get the value of giaBan/can
     *
     * @return the value of giaBan/can
     */
    public float getGiaBan

    () {
        return giaBan ;
    }

    /**
     * Set the value of giaBan/can
     *
     * @param giaBan/can new value of giaBan/can
     */
    public void setGiaBan(float giaBan) {
        this.giaBan  = giaBan ;
    }
 Scanner sc= new Scanner(System.in);
}

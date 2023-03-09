/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author nhu quynh
 */
public class shape {
    public String color = "red";
    public boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public shape() {
        
    }
   
    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        
    }  
     @Override
    public String toString (){
        return "ta co hinh mau"+color+ "va filled la" +filled ;
      
   }  
        
    }
   
    
    


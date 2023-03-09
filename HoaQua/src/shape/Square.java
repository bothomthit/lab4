/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author nhu quynh
 */
public class Square extends Rectangle {
    public double side;
    public Square(double length, double width, String color, boolean filled) {
        super(length, width, color, filled);
    }

    Square() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString (){
        return "ta co hinh vuong co canh la"+side;
}   
   
}

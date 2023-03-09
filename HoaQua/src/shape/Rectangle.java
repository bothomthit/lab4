/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author nhu quynh
 */
public class Rectangle extends shape {
    public double length;
    public  double width;
  public Rectangle(double length, double width,String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }  

    Rectangle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString (){
        return "ta co hinh chu nhat co chu vi la"+getPerimeter()+"va dien tich la"+getArea();
}
}

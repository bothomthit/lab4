/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author nhu quynh
 */
public class Circle extends shape {
    public double radius;
  
    public double getArea() {
        return 2*3.14*radius*radius;
    }

    public double getPerimeter() {
        return 2*3.14*radius;
    }

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
@Override
    public String toString (){
        return "ta co hinh tron co chu vi la"+getPerimeter()+"va dien tich la"+getArea();
}
}

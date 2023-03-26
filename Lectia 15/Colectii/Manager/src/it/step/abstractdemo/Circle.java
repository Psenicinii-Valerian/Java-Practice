package it.step.abstractdemo;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public void calculatePerimeter(){
        this.perimeter = 2 * Math.PI * radius;
    }

    public void calculateArea(){
         this.area = Math.PI * Math.pow(radius, 2);
    }
}

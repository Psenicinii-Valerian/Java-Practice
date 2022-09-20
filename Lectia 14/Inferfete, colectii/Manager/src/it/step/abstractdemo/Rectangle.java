package it.step.abstractdemo;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width =  width;
        calculateArea();
        calculatePerimeter();
    }

    public void calculatePerimeter(){
        this.perimeter = 2 * lenght + 2 * width;
    }

    public void calculateArea(){
        this.area = lenght * width;
    }
}

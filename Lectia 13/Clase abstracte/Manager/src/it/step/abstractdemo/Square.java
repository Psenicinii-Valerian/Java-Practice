package it.step.abstractdemo;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
        calculatePerimeter();
        calculateArea();
    }

    public void calculatePerimeter(){
        this.perimeter = side * 4;
    }

    public void calculateArea(){
        this.area = Math.pow(side, 2);
    }
}

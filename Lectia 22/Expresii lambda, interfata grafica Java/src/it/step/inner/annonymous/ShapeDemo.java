package it.step.inner.annonymous;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape square = new Shape() {
            public double getPerimeter() {
                return 25;
            }

            public double getArea() {
                return 20;
            }
        };

        System.out.println(square.getArea() + " " + square.getPerimeter());

    }

}
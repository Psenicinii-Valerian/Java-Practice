package it.step.abstractdemo;

import java.util.Scanner;

public class ShapeKeyboardCreator {

    Scanner sc = new Scanner(System.in);

    public Shape getShape() {
        System.out.println("Introduceti o figura: ");
        String shape = sc.nextLine();
        switch (shape.toLowerCase()) {
            case "circle" :
                System.out.println("Please enter circle radius");
                double radius = sc.nextDouble();
                return new Circle(radius);
            case "square" :
                System.out.println("Please enter square side lenght");
                double side = sc.nextDouble();
                return new Square(side);
            case "rectangle" :
                System.out.println("Please enter side lenght");
                double lenght = sc.nextDouble();
                System.out.println("Please enter side width");
                double width = sc.nextDouble();
                return new Rectangle(lenght, width);

            default:
                System.out.println("Sorry we don't support the shape of type:" + shape);
        }

        return null;
    }
}


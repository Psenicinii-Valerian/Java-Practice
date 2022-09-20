package it.step.abstractdemo;

public class App {

    public static void main(String[] args) {

        Square sq = new Square(2.5);
        sq.getPerimeter();
        Rectangle rectangle = new Rectangle(3.5, 2.7);
        Circle circ = new Circle(2.5);

        Shape circle = new Circle(3.6);
        Shape rect = new Rectangle(3.6, 4.5);
        Shape square = new Square(2.5);

        ShapeKeyboardCreator shapeCreator = new ShapeKeyboardCreator();
        Shape created = shapeCreator.getShape();

        System.out.println("Figure's perimeter = " + created.getPerimeter());
        System.out.println("Figure's area = " + created.getArea());

//      Shape[] shapes = new Shape[]{new Shape("circle", 3.6), new Shape("rectangle", 3.4, 2.3)};
    }

}

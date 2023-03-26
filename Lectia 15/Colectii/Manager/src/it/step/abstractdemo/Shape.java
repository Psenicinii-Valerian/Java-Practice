package it.step.abstractdemo;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    public abstract void calculatePerimeter();
    public abstract void calculateArea();
    public double getPerimeter(){
        return this.perimeter;
    }

    public double getArea(){
        return this.area;
    }

    // PROBLEMS:
    // 1) NU EXISTA NICI O VALIDARE
    // 2) DACA ESTE NECESITATE DE A INTRODUCE O FIGURA, TREBUIE REALIZATE MODIFICARI

//    public Shape(String name, double lungime, double latime){
//        this.name = name;
//        this.laturi = new double[]{lungime, latime};
//    }
}

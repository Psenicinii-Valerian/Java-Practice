package it.step.inner.with.bicycle;

public class Bicycle {
    private String model; // giant, author

    public Bicycle(String model) {this.model = model;}

    public void start() {
        System.out.println(" Start bicicleta!");
    }

    public class HandleBar{

        public String color;

        public void turnRight() {
            System.out.println(" Turn right!");
        }

        public void turnLeft() {
            System.out.println(" Turn left!");
        }

    }

    public class Seat {

        public void up() {
            System.out.println(" Scaunul se ridica!");
        }

        public void down() {
            System.out.println(" Scaunul coboara!");
        }
    }



}

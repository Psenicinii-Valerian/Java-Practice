package it.step.inner.without;

public class BasicExample {

    public static void main(String[] args) {
        Bicycle author = new Bicycle("Autor");
        HandleBar handle = new HandleBar();
        Seat seat = new Seat();

        seat.up();
        author.start();
        handle.turnLeft();
        handle.turnRight();
    }

}

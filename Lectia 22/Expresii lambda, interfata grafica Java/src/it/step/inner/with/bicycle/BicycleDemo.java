package it.step.inner.with.bicycle;

import it.step.inner.with.bicycle.Bicycle;

public class BicycleDemo {
    public static void main(String[] args) {

        Bicycle giant = new Bicycle("Giant");
        Bicycle.HandleBar handleBar = giant.new HandleBar();
        Bicycle.Seat seat = giant.new Seat();

        seat.up();
        giant.start();
        handleBar.turnRight();
        handleBar.turnLeft();
    }

}

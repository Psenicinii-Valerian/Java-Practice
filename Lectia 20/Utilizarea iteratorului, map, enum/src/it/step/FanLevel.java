package it.step;

public enum FanLevel {

    LOW(1200),
    MEDIUM(3500),
    HIGH(5000);

    private int speed;

    FanLevel(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}

class FanDemo {
    public static void main(String[] args) {
        System.out.println(FanLevel.LOW);
        System.out.println(FanLevel.LOW.getSpeed());
    }
}

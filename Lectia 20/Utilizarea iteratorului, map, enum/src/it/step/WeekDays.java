package it.step;

public enum WeekDays {

    WEDNESDAY(3),
    THURSDAY(4),
    MONDAY(1),
    FRIDAY(5),
    TUESDAY(2),
    SATURDAY(6),
    SUNDAY(7);

    private int order;
    WeekDays(int order) {
        this.order=order;
    }

    public int getOrder(){
        return this.order;
    }
}

class WeekDemo{
    public static void main(String[] args) {
        System.out.println(" Sunteti in a " + (WeekDays.MONDAY.ordinal()+1) + " zi a saptamanii!");
        System.out.println(" Sunteti in a " + WeekDays.TUESDAY.getOrder() + " zi a saptamanii!");
    }
}

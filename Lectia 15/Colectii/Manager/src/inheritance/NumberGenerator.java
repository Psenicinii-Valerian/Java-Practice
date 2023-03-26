package inheritance;

public class NumberGenerator {
    public void first100Numbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public void sum(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        System.out.println("Suma primelor 100 numere este: " + sum);
    }

}

package it.step.inner.staticclasses;

public class Animal {

    private static String name;
    private String[] type;

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public static class Reptile {

        public void apelName() {
            System.out.println(name);
        }

        // putem apela prin clasele statice campuri si metode statice ale clasei in interiorul careia ne aflam

    }

    public static class Mammal extends Animal {

        public void animalType() {
            setType(new String[]{" crocodile, fish"} );
        }

        // putem obtine cu ajutorul mostenirii campurile si metodele non-statice, cu toate ca am creat o clasa statica

    }

    public static class Birds extends Animal {

    }

}


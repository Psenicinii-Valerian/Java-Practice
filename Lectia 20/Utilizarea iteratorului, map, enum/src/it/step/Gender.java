package it.step;

public enum Gender {

    MALE, // Male
    FEMALE;

    public String getName() {
        return this.toString().toLowerCase();
    }

    @Override
    public String toString() {
        String name = super.toString();
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }

    public static Gender getGender(String input) {

        if (input.equalsIgnoreCase("male") || input.equalsIgnoreCase("m")){
            return MALE;
        }

        if (input.equalsIgnoreCase("female") || input.equalsIgnoreCase("f")){
            return FEMALE;
        }

        return null;
    }



}
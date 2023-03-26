package it.step.inner.with.person;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = new Person("John Smith");

        Person.Document id = person.new Document(DocumentType.ID, "AA156984");
        id.getInfo();

        Person.Document passport = person.new Document(DocumentType.PASSPORT, "B2356984");
        passport.getInfo();
    }
}

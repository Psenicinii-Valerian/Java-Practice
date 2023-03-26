package it.step.inner.with.person;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public class Document {
        private String number;
        private DocumentType type;

        public Document(DocumentType type, String number) {
            this.type = type;
            this.number = number;
        }

        public void getInfo() {
            System.out.println("Document: " + type
                    + ", number: " + number
                + ", person: " + name); // se poate de scris si Person.this.name
        }
    }
}


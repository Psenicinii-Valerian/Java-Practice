package it.step.interfaces;

public interface EmployeeManager {

    void view();
    void create(String name, String surname);
    void update(int index, String name, String surname);
    void delete(int index);
}

interface PrinterInterface {
    void print();
}

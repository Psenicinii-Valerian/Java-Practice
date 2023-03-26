package com.step;

import com.step.model.Address;
import com.step.model.Employee;
import com.step.model.EmployeeDao;
import com.step.hibernate.HibernateUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    /*
         Aplicatie de employee management::
         *  Intrebari ce ar trebui sa dam pentru afla mai multe detalii de la client:
            1) Ce functionalitati trebuie sa aiba aplicatia?
            2) Care sunt datele necesare ce trebuie sa contina aplicatia?
            3) Ce constrangeri doriti sa aiba aplicatia?

         TODO:
         Aplicatie care gestioneaza angajatii unei companii
         Fiecare angajat apartine la un departament al companiei
         Compania poate avea 1 sau mai multe departamente
         Fiecare departament are un nume si desriere
         Fiecare angajat are un nume, prenume, data nasterii, salariu si adresa
         Adresa consta din strada, oras, tara, numarul blocului, apartament

         TODO:
          1) Adaugati logica necesara in departament pentru ca sa fie posibil de creat 4,5 departamente in aplicatie
           2) La crearea angajatului sa fie selectat departamentul la care este atribuit
    */

        EmployeeDao dao = new EmployeeDao();
//      AddressDao addressDao = new AddressDao();

        // 1. Create random objects.
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Address address =  new Address("Street " + i, "City " + i, "Chisinau " + i, "26/8", "758");
            Employee employee = new Employee("Name " + i, "Surname " + i, LocalDate.of(i, 10, 10));
            employee.setAddress(address);
            employeeList.add(employee);
        }

        // 2. Save random objects
        dao.create(employeeList);

        // 3. Create single object
        dao.create(new Employee("John", "Smith", LocalDate.of(999, 9, 9)));

        // 4. Update single object
        dao.update(1, "UPDATED NAME", "UPDATED SURNAME", LocalDate.of(1999, 9, 9));

        // 5. Display the updated values
        List<Employee> updatedEmployees = dao.findAll();
        for (Employee emp: updatedEmployees) {
            System.out.println(emp);
        }

        // 6. Delete object by ID
        dao.delete(5);
        HibernateUtil.shutdown();
    }
}


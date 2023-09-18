package org.example;

import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = Worker.getEmployees(5);
        employees.addAll(Freelancer.getEmploees(5));
        for (Employee employee: employees) {
            System.out.println(employee);
        }
/*
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
*/
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    private Freelancer (String surName, String name, double salary) {
        super(surName, name);
        this.salary = salary;
    }
    public static Employee getInstance (){
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(200, 1800));
    }
    public static List<Employee> getEmploees (int count) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(Freelancer.getInstance());
        }
        return employees;
    }

    @Override
    public double calculateSalary() {
        return 20.8*8*salary;
    }

    @Override
    public String toString () {
        return String.format("%s %s; Фрилансер; Средняя месячная заралата (без фиксированной ставки за месяц): %.2f (руб.)",
                surName, name, calculateSalary());
    }
    @Override
    public void setSalary (double salary) {
        this.salary = salary;
    }

}

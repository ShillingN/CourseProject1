package courseproject;

import java.util.Objects;

public class Employee {
    private static int counter;
    private final String fullname;
    private int department;
    private double salary;
    private final int id;


    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String toSting() {
        return "ФИО: " + fullname + "; Отдел № " + department + "; Заработная плата " + salary + " рублей.";
    }
}
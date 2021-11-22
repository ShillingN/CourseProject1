package pro.sky.java.courseproject1;

import java.util.Objects;

public class Employee {
    private final String fullname;
    private final int id;
    private static int counter;
    private int department;
    private double salary;


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
        return fullname;
    }

    public int getDepartment() {
        return department;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ФИО: " + fullname + "; Отдел № " + department + "; Заработная плата " + salary + " рублей.";
    }
}
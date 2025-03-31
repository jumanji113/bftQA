package org.example.homework7;

public class Manager extends Employee{

    String name;
    int salary;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void work(){
        System.out.println("Менеджер работает");
    }
}

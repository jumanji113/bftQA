package org.example.homework7;

public class MainHomework {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Четырехугольник");
        rectangle.draw();
        Circle circle = new Circle("Окружность");
        circle.draw();

        Manager manager = new Manager("Alex", 40000);
        Developer developer = new Developer("Ivan", 300);
        Employee employee = new Employee("Sasha", 432645);
        manager.work();
        developer.work();
        employee.work();
    }
}

package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Challenge1 {
    static class Person{
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

    }

    static class Car{
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }


    }
    static class Employee{
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {

        Person[] persons = {
                new Person("Kapil",23),
                new Person("Dravid",26),
                new Person("Sachin",21),
                new Person("Virat",27),
                new Person("Dhoni",19)

        };

        // Problem statement -> Get all the list of person's name

        Function<Person,String> nameFunction = person -> person.name;

        List<String> namesExtracted = Arrays.stream(persons)
                                      .map(nameFunction)
                .collect(Collectors.toList());
        System.out.println("Extracted names");
        namesExtracted.forEach(System.out::println);
// Extract white cars
        Car[] cars = {
                new Car("TATA","white", 25000.00F),
                new Car("MMM","pink", 25000.00F),
                new Car("NEXA","grey", 25000.00F),
                new Car("FORD","white", 25000.00F),
                new Car("Hyundai","red", 25000.00F),
                new Car("Citroen","white", 25000.00F)

        };

        List<Car> carList = new ArrayList<>(Arrays.asList(cars));

        List<Car> whiteCars = carList
                .stream()
                .filter((car -> car.color == "white"))
                .collect(Collectors.toList());
        System.out.println("White Cars");
        System.out.println(whiteCars);

        // Finding the sum of all employies salaries
        Employee[] employees = {
                new Employee("Pinaka",23,"Admin",500F),
                new Employee("Dinaka",33,"HR",200F),
                new Employee("Cinaka",13,"Manager",500F)

        };

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));

        System.out.println("Sum of salaries -:"+ employeeList
                .stream()
                .map(employee -> employee.salary)
                .reduce(0F,(a,b)->a+b));
            }
}

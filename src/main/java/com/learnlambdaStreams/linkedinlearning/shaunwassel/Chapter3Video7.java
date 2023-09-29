package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter3Video7 {
    protected static class Employee {

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public  final  String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;


    }
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Sameer",40,"developer",10f),
                new Employee("nagpal",41,"IT admin",20f),
                new Employee("Sopan",42,"IT qa",30f),
                new Employee("Dev",43,"developer",40f),
                new Employee("Chai",44,"IT devops",50f),
                new Employee("Chinu",45,"developer",60f),
                new Employee("gopal",41,"IT admin",70f),
                new Employee("Ropan",42,"IT qa",80f),
                new Employee("Phai",41,"IT devops",90f)

        };

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));

        Float totalDeveloperSalaries = employeeList.stream()
                .filter(developer -> developer.jobTitle == "developer")
                .map(developer -> developer.salary)
                .reduce(0f,(a,b)->a+b);

        Long noOfDevelopers =  employeeList.stream()
                .filter(developer -> developer.jobTitle == "developer")
                .collect(Collectors.counting());

        System.out.println("Average developers salary =="+totalDeveloperSalaries/noOfDevelopers);

        // map of job title and salary

        Map<String, Float> averageSalaryMap = employeeList.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.jobTitle
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()
                                .stream()
                                .map(employee -> employee.salary )
                                .reduce(0f,(acc,x)-> acc+x)/entry.getValue().size()
                ));

        System.out.println("Average Salary: "+averageSalaryMap);
        System.out.println("just to keep the continunity");


    }
}

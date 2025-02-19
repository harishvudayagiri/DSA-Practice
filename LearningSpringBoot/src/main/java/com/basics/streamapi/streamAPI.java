package com.basics.streamapi;

import com.basics.baseclassesforpractice.NewEmployee;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class streamAPI {

    static List<Employee>employees=new ArrayList<>();

    static {
        employees.add(
                new Employee("Jai","Dhingraa",
                        7000, List.of("Apple Support","Dev1")));
        employees.add(
                new Employee("Harish","Vudayagiri",
                        600000, List.of("GoogleNest","Google Browser")));

        employees.add(
                new Employee("Spartan","Hash",
                        50000, List.of("Apple Macbook Pro","Apple Imac")));
    }

    public static void main(String[] args) {

        Calendar ca=new GregorianCalendar();
        NumberFormat n=new DecimalFormat();
        //list all employee Details
        employees.stream().forEach(employee -> System.out.println(employee));
        System.out.println("========================");
        List<Employee>hikedList=employees.stream().map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
                employee.getSalary()*1.3,employee.getProjects())).collect(Collectors.toList());
        System.out.println(hikedList);
        System.out.println("========================");
        List<Employee>higherEmployees=
                employees.stream().filter(employee -> employee.getSalary()>100000).collect(Collectors.toList());
        System.out.println(higherEmployees);
        System.out.println("========================");
        List<Employee>salriedGreateThan1000=
        employees.stream().filter(employee -> employee
                .getSalary()>15000)
                .collect(Collectors.toList());
        System.out.println(salriedGreateThan1000);
        System.out.println("========================");
        List<Employee> firstEmployee=employees.stream().findFirst().stream().collect(Collectors.toList());
        System.out.println(firstEmployee);
        System.out.println("================ Find First ===============");

        Employee findFirst=employees.stream().map(employee -> new
                Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary()*1.3,employee.getProjects() )).
                filter(employee -> employee.getSalary()>10000).findFirst().get();
        System.out.println(findFirst);
        employees.forEach(i-> System.out.println("in  method references "+i));
        employees.stream().forEach(i -> System.out.println(i));


        NewEmployee employee=new NewEmployee();


        List<NewEmployee> employeeList = new ArrayList<NewEmployee>();

        employeeList.add(new NewEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new NewEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new NewEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new NewEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new NewEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new NewEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new NewEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new NewEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new NewEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new NewEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new NewEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new NewEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new NewEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new NewEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new NewEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new NewEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new NewEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        Map<String,Long> maleAndFemaleCount= employeeList.stream().collect(Collectors.groupingBy(NewEmployee::getGender,Collectors.counting()));
        System.out.println(maleAndFemaleCount);

        Map<String,Long> departmentWiseCount=employeeList.stream().collect(Collectors.groupingBy(NewEmployee::getDepartment,Collectors.counting()));
        System.out.println(departmentWiseCount);

        employeeList.stream().map(NewEmployee::getDepartment).distinct().forEach(System.out::println);

        System.out.println(employeeList.stream().collect(Collectors.groupingBy(NewEmployee::getGender,Collectors.averagingInt(NewEmployee::getAge))));
        System.out.println(employeeList.stream().filter(i -> i.getYearOfJoining()>2015).map(NewEmployee::getName).collect(Collectors.toList()));
        employeeList.stream().distinct().forEach(System.out::println);

        Integer[] values={1, 2, 1, 3, 4, 4};
        HashSet<Integer> hs=new HashSet<>();
        System.out.println("distinct Values");

        Set<Integer> k=Arrays.stream(values).filter(i-> !hs.add(i)).collect(Collectors.toSet());
        System.out.println(k);
    }


}

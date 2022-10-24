import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(
                new Employee("Abhishek", "Nautiyal", 1000.0, Arrays.asList("Project 1", "Project 2"))
        );
        employeeList.add(
                new Employee("Ram", "Nadar", 800.0, Arrays.asList("Project 1", "Project 3"))
        );
        employeeList.add(
                new Employee("Nikhil", "Patel", 6000.0, Arrays.asList("Project 2", "Project 3"))
        );
        employeeList.add(
                new Employee("Aryan", "Patel", 10000.0, Arrays.asList("Project 2", "Project 4"))
        );
    }

    public static void main(String args[]) {

        //foreach is terminal operation
        employeeList.stream().forEach(employee -> System.out.println(employee));

        System.out.println("**********----------**************-------------------");


        //intermediate operation
        //map operation to increase salary by 10%
        List<Employee> increasedSal=employeeList.stream().map(employee -> new Employee(employee.getFirstName(),employee.getLastName(),employee.getSalary()*1.10,employee.getProjects()))
                .collect(Collectors.toList());

        System.out.println(increasedSal);

        System.out.println("**********----------**************-------------------");

        //filter operation
        List<Employee> filterEmployeeList=employeeList.stream().filter(employee -> employee.getSalary()>5000.0)
                .map(employee -> new Employee(employee.getFirstName(),employee.getLastName(),employee.getSalary(),employee.getProjects()))
                .collect(Collectors.toList());

        System.out.println(filterEmployeeList);

        System.out.println("**********----------**************-------------------");


        //sorting based on first name
        //this is also intermediate operation and in end we are using collect to terminate operation
        List<Employee> sortedEmployee=employeeList.stream().sorted((o1,o2)->o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee);



    }
}

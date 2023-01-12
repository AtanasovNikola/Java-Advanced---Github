package DefiningClasses.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEmployees = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new HashMap<>();
        while (numOfEmployees-- > 0) {
            String[] currentEmployee = scanner.nextLine().split("\\s+");
            String name = currentEmployee[0];
            double salary = Double.parseDouble(currentEmployee[1]);
            String position = currentEmployee[2];
            String department = currentEmployee[3];
            Employee employee = null;
            switch (currentEmployee.length) {

                case 4:
                    employee = new Employee(name, salary, position, department);

                    break;
                case 5:
                    if (currentEmployee[4].matches("\\d+")) {
                        int age = Integer.parseInt(currentEmployee[4]);
                        employee = new Employee(name, salary, position, department, age);
                    } else {
                        String email = currentEmployee[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    String email = currentEmployee[4];
                    int age = Integer.parseInt(currentEmployee[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);

        }
Department highestPaidDepartment =departmentMap.entrySet()
        .stream()
        .max(Comparator.comparingDouble(e -> e.getValue().calculateAverageSalary()))
        .get()
        .getValue();
        System.out.printf("Highest Average Salary: %s%n",highestPaidDepartment);
        departmentMap.get(highestPaidDepartment.getName()).getEmployees().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        departmentMap.get(highestPaidDepartment.getName()).getEmployees().forEach(System.out::println);
    }
}

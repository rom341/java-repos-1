package Task1;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Employee> employeeList = List.of(
                new Employee("Tom", 21,2500, "Build a nuclear reactor"),
                new Employee("Oleg", 24, 2750, "Create new OS")
        );
        List<Employee> employeeList1 = List.of(
                new Employee("Krain", 34, 2900, "Save humanity"),
                new Employee("Strelok", 35, 2600, "Kill Strelok")
        );

        Manager manager = new Manager("Eve", 24, 3000, employeeList);
        Manager manager1 = new Manager("Lara", 29, 3500, employeeList1);

        List<Manager> managerList = List.of(manager, manager1);
        Director director = new Director("Robert", 38, 4500, managerList);
        
        director.showInfo();
    }
}
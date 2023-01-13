package Task1;

public class Main {
    public static void main(String[] args)
    {
        Employee employee = new Employee("Bob", 22, 5000, "make a nuclear reactor");
        Manager manager = new Manager("Eve", 20, 6500, "9:00 - go to work\n23:00 - go to bed");
        Director director = new Director("Robert", 35, 7500, "Tom, Eve");

        System.out.println(employee.doWork());
        System.out.println(manager.getPlanOfDay());
        System.out.println(director.getTeamMembers());
    }
}
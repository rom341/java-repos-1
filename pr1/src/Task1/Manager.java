package Task1;

import java.util.List;

public class Manager extends Worker{
private List<Employee> employeeList;

    public Manager(String name, int age, float salary, List<Employee> employeeList) {
        super(name, age, salary);
        this.employeeList = employeeList;
    }
    @Override
    public void showInfo()
    {
        System.out.println("Manager: " + name + " has a small team:");
        for (Employee e : employeeList) {
            e.showInfo();
        }
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

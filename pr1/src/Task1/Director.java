package Task1;

import java.util.List;

public class Director extends Worker {

    private List<Manager> managerList;

    public Director(String name, int age, float salary, List<Manager> managerList) {
        super(name, age, salary);
        this.managerList = managerList;
    }
    @Override
    public void showInfo()
    {
        System.out.println("===");
        System.out.println("Director: " + name + "has a big team");
        for (Manager m:managerList)
        {
            System.out.println("\n");
            m.showInfo();
        }
        System.out.println("===");
    }
    public void addEmployee(Manager manager)
    {
        managerList.add(manager);
    }
    public void removeEmployee(Manager manager)
    {
        managerList.remove(manager);
    }
    public List<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(List<Manager> managerList) {
        this.managerList = managerList;
    }
}

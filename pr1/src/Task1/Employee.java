package Task1;

public class Employee extends Worker{
    private String listOfWork;

    public Employee(String name, int age, float salary, String listOfWork) {
        super(name, age, salary);
        this.listOfWork = listOfWork;
    }

    public String getListOfWork() {
        return listOfWork;
    }

    public void setListOfWork(String listOfWork) {
        this.listOfWork = listOfWork;
    }

    @Override
    void showInfo() {
        System.out.println("Employee: " + name + " get " + salary + " for completing: " + listOfWork);
    }
}

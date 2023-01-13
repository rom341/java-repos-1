package Task1;

public class Employee extends Worker{
    private String listOfWork;

    public Employee(String name, int age, float salary, String listOfWork) {
        super(name, age, salary);
        this.listOfWork = listOfWork;
    }

    public String doWork()
    {
        return name + " get: " + salary + "$ for completing your list of work: '" + listOfWork + "'";
    }

    public String getListOfWork() {
        return listOfWork;
    }

    public void setListOfWork(String listOfWork) {
        this.listOfWork = listOfWork;
    }
}

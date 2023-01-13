package Task1;

public class Manager extends Worker{
private String timeManagmentPlan;

    public Manager(String name, int age, float salary, String timeManagmentPlan) {
        super(name, age, salary);
        this.timeManagmentPlan = timeManagmentPlan;
    }

    public String getPlanOfDay()
    {
        return name + "`s day plan:\n{\n" + timeManagmentPlan+"\n}";
    }
    public String getTimeManagmentPlan() {
        return timeManagmentPlan;
    }

    public void setTimeManagmentPlan(String timeManagmentPlan) {
        this.timeManagmentPlan = timeManagmentPlan;
    }
}

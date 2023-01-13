package Task1;

public class Director extends Worker{
    private String memberList;

    public Director(String name, int age, float salary, String memberList) {
        super(name, age, salary);
        this.memberList = memberList;
    }

    String getTeamMembers()
    {
        return "The " + name + "`s team contains: " + memberList;
    }
    public String getMemberList() {
        return memberList;
    }

    public void setMemberList(String memberList) {
        this.memberList = memberList;
    }
}

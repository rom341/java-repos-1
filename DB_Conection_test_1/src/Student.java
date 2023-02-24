public class Student {
    private long id;
    private String name;
    private String lastName;
    private int age;
    private String group;

    public Student(long id, String name, String lastName, int age, String group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

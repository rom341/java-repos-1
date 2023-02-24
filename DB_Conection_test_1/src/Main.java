import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBController dbc = new DBController();

        Student s = new Student(6, "Oleg", "Olegov", 15, "C7");
        //System.out.println(dbc.save(s).getName());
        //System.out.println(dbc.delete(10).getName());
        //System.out.println(dbc.update(1, s).getName());
        //dbc.findAllByGroup("B1").stream().forEach(student -> System.out.print(student.getName() + " "));
        //dbc.findAllByAge(19).stream().forEach(student -> System.out.print(student.getName() + " "));
        //System.out.println(dbc.findByID(3).get().getName());
        //System.out.println(dbc.findByFullName("Roman Romanov").get().getGroup());
    }
}
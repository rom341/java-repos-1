import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.JdbcAccessor;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Optional;
public class DBController implements StudentRepository{
    private JdbcTemplate template = new JdbcTemplate(setDataSource());
    //Студент-заглушка
    private Student emptyStudent = new Student(0, "noName", "noLastName", 0, "0");

    @Autowired
    public DataSource setDataSource() {
        //this.template.setDataSource(dataSource);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
        dataSource.setUsername("root");
        dataSource.setPassword("my-secret-pw");
        return dataSource;
    }
    @Override
    public List<Student> findAllByAge(int age) {
        return template.query("select * from DB1.Student where age=" + age, new StudentMapper());
    }

    @Override
    public Optional<Student> findByID(long id) {
        String sql = "select * from DB1.Student where id=" + id + " limit 1";
        Optional<Student> O = template.queryForStream(sql, new StudentMapper()).findAny();
        return Optional.of(O.orElse(emptyStudent));
    }

    @Override
    public Optional<Student> findByFullName(String fullName) {
        String sql = "select * from DB1.Student where first_name='" + fullName.split(" ")[0] + "' and last_name='" + fullName.split(" ")[1] + "' limit 1";
        Optional<Student> O = template.queryForStream(sql, new StudentMapper()).findAny();
        return Optional.of(O.orElse(emptyStudent));
    }

    @Override
    public List<Student> findAllByGroup(String group) {
        return template.query("select * from DB1.Student where student_group='" + group + "'", new StudentMapper());
    }

    @Override
    public Student save(Student student) throws SQLException {
        String sql = "insert into DB1.Student(first_name, last_name, age, student_group) values(?, ?, ?, ?)";
        template.update(sql, student.getName(), student.getLastName(), student.getAge(), student.getGroup());
        return student;
    }

    @Override
    public Student update(long id, Student student) throws SQLException {
        String sql = "update DB1.Student set first_name='"+student.getName()+"', last_name='"+student.getLastName()+"', age=" + student.getAge() + ", student_group='"+student.getGroup() + "' where id=" + id;
        template.update(sql);
        return student;
    }

    @Override
    public Student delete(long id) throws SQLException {
        String sqlDel = "delete from DB1.Student where id=" + id;
        String sqlFind = "select * from DB1.Student where id=" + id + " limit 1";
        Student student = template.queryForStream(sqlFind, new StudentMapper()).findAny().orElse(emptyStudent);
        template.update(sqlDel);
        return student;
    }
}

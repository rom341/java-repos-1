import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<Student> findAllByAge(int age);

    Optional<Student> findByID(long id);

    Optional<Student> findByFullName(String fullName);

    List<Student> findAllByGroup(String group);

    Student save(Student student) throws SQLException;

    Student update(long id, Student student) throws SQLException;

    Student delete(long id) throws SQLException;
}

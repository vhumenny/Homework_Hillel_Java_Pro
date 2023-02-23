package lesson30.homework20.service;

import lesson30.homework20.dao.DAO;
import lesson30.homework20.dao.DAOImpl;
import lesson30.homework20.entity.Student;

import java.util.List;

public class StudentService {
    private final DAO dao = new DAOImpl();
    public void addStudent(Student student) {
        dao.addStudent(student);
    }
    public void deleteStudent(Long id) {
        dao.deleteStudent(id);
    }
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }
    public Student getStudent(Long id) {
        return dao.getStudentById(id);
    }
}

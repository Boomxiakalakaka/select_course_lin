package lin.service.inter;

import java.util.List;

import lin.domain.Course;
import lin.domain.Department;
import lin.domain.Student;
import lin.domain.Teacher;

public interface ManagerServiceInter {

	public boolean getMatchCount(String userName, String password);
	public List getAllDepartment();
	public List getAllTeacher();
	public List getAllCourse();
	public List getAllStudent();
	public void addStudent(Student student);
	public void addDepartment(Department department);
	public void addCourse(Course course);
	public void addTeacher(Teacher teacher);
}

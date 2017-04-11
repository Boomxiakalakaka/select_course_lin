package lin.dao.inter;

import java.util.List;

import lin.domain.Student;

public interface StudentDaoInter {

	public int getMatchCount(String userName, String password);
	public void addStudent(Student student);
	public List<Student> findAllStudent();
	
}

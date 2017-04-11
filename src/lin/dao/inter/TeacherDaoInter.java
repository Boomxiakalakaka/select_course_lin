package lin.dao.inter;

import java.util.List;

import lin.domain.Department;
import lin.domain.Teacher;



public interface TeacherDaoInter {
	public List<Teacher> findAllTeacher();
	public void addTeacher(Teacher teacher);
}

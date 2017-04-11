package lin.dao.inter;

import java.util.List;

import lin.domain.Course;

public interface CourseDaoInter {

	public void addCourse(Course course);
	public List<Course> findAllCourse();
}

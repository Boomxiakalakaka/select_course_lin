package lin.service;

import java.util.List;

import lin.dao.CourseDao;
import lin.dao.DepartmentDao;
import lin.dao.ManagerDao;
import lin.dao.StudentDao;
import lin.dao.TeacherDao;
import lin.domain.Course;
import lin.domain.Department;
import lin.domain.Student;
import lin.domain.Teacher;
import lin.service.inter.ManagerServiceInter;

public class ManagerService implements ManagerServiceInter {

	@Override
	public boolean getMatchCount(String userName, String password) {
		// TODO Auto-generated method stub
		ManagerDao managerDao = new ManagerDao();
		int matchCount =managerDao.getMatchCount(userName, password);
		return matchCount>0;
	}

	//获取所有学院信息
	@Override
	public List getAllDepartment() {
		// TODO Auto-generated method stub
		DepartmentDao  departmentDao = new DepartmentDao();
		
		return departmentDao.findAllDepartment();
	}
	
	//新增学生
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		studentDao.addStudent(student);
	}

	//新增学院
	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao = new DepartmentDao();
		departmentDao.addDepartment(department);
	}

	//新增课程
	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		CourseDao courseDao = new CourseDao();
		courseDao.addCourse(course);
	}

	//新增教师
	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.addTeacher(teacher);
	}

	//获取所有教师
	@Override
	public List getAllTeacher() {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.findAllTeacher();
	}

	//获取所有课程
	@Override
	public List getAllCourse() {
		// TODO Auto-generated method stub
		CourseDao courseDao = new CourseDao();
		return courseDao.findAllCourse();
	}

	//获取所有学生
	@Override
	public List getAllStudent() {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		return studentDao.findAllStudent();
	}

}

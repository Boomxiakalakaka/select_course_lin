package lin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import lin.domain.Course;
import lin.domain.Department;
import lin.domain.Student;
import lin.domain.Teacher;
import lin.service.ManagerService;

import org.apache.struts2.ServletActionContext;

public class Forward_page {

	private List<Department> departmentList;
	private List<Teacher> teacherList;
	private List<Course> courseList;
	private List<Student>studentList;

	ManagerService managerService = new ManagerService();

	//当前页数
	private int currentPage;
	//总页数
	private int totalPage;
	//当前条件查询下的总记录数目
	private int recordNumber;
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(int recordNumber) {
		this.recordNumber = recordNumber;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public List<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	
	
	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

public String addStudent(){
		setDepartmentList(managerService.getAllDepartment());
		/*HttpServletRequest request=ServletActionContext.getRequest();
		request.getSession().setAttribute("student",getStudent());*/
		return "addStudent";
	}
	
	public String deleteStudent(){
		return "deleteStudent";
	}
	
	public String addCourse(){
		setTeacherList(managerService.getAllTeacher());
		return "addCourse";
	}
	
	public String deleteCourse(){
		return "deleteCourse";
	}
	
	public String addDepartment(){
		return "addDepartment";
	}
	
	public String addTeacher(){
		return "addTeacher";
	}
	
	public String queryCourse(){
		
		setDepartmentList(managerService.getAllDepartment());
		setCourseList(managerService.getAllCourse());
		if(currentPage == 0) currentPage = 1;
	    totalPage = managerService.getAllCourse().size(); 
		return "queryCourse";
	}
	
	public String queryStudent(){
		setStudentList(managerService.getAllStudent());
		if(currentPage == 0) currentPage = 1;
	    totalPage = managerService.getAllStudent().size();
		return "queryStudent";
	}
	
	public String queryTeacher(){
		setTeacherList(managerService.getAllTeacher());
		if(currentPage == 0) currentPage = 1;
	    totalPage = managerService.getAllTeacher().size();
		return "queryTeacher";
	}
	
	public String queryDepartment(){
		setDepartmentList(managerService.getAllDepartment());
		if(currentPage == 0) currentPage = 1;
	    totalPage = managerService.getAllDepartment().size();
		return "queryDepartment";
	}
}

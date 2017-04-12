package lin.action;

import java.util.List;

import lin.domain.Course;
import lin.domain.Department;
import lin.domain.Record;
import lin.domain.Student;
import lin.domain.Teacher;
import lin.service.ManagerService;

import com.opensymphony.xwork2.ActionSupport;

public class SaveMember extends ActionSupport{

	private Student student;
	private Department department;
	private Teacher teacher;
	private Course course;
	
	private  String tip=null;
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String addStudent(){
		Student student1 = new Student();
		student1.setStudent_name(student.getStudent_name());
		student1.setStudent_gender(student.getStudent_gender());
		student1.setIdcard(student.getIdcard());
		student1.setStudent_password(student.getStudent_password());
		student1.setPolitics(student.getPolitics());
		student1.setPhonenumber(student.getPhonenumber());
		student1.setMailbox(student.getMailbox());
		student1.setQqnumber(student.getQqnumber());
		student1.setFamilyaddress(student.getFamilyaddress());
		System.out.println(student.getStudent_name()+":"+student.getStudent_gender()+":"+
		student.getIdcard()+":"+student.getStudent_password()+":"+student.getPolitics()+":"+student.getPhonenumber()
		+":"+student.getMailbox()+":"+student.getQqnumber()+":"+student.getFamilyaddress());
		ManagerService managerService=new ManagerService();
		managerService.addStudent(student1);
		
		setTip("新增学生");
		return "success";
	}
	
	public String addCourse(){
		Course course1 = new Course();
		course1.setCourse_name(course.getCourse_name());
		course1.setTeacher_name(course.getTeacher_name());
		course1.setCourse_time(course.getCourse_time());
		course1.setCourse_period(course.getCourse_period());
		course1.setCourse_credit(course.getCourse_credit());
		course1.setCourse_site(course.getCourse_site());
		course1.setCourse_introduce(course.getCourse_introduce());
		ManagerService   managerService = new ManagerService();
		managerService.addCourse(course1);
		setTip("新增课程");
		return "success";
	}
	
	public String addRecord(){
		List<Record> listRecord = null;
		List<Course> listCourse = null;
		setTip("新增选课记录");
		return "success";
	}
	
	public String addDepartment(){
		Department department1 = new Department();
		department1.setDepartment_name(department.getDepartment_name());
		department1.setDepartment_director(department.getDepartment_director());
		department1.setDepartment_photonumber(department.getDepartment_photonumber());
		department1.setDepartment_introduce(department.getDepartment_introduce());
		ManagerService  managerService = new ManagerService();
		managerService.addDepartment(department1);
		setTip("新增学院");
		return "success";
	}
	
	public String addTeacher(){
		Teacher teacher1 = new Teacher();
		teacher1.setTeacher_name(teacher.getTeacher_name());
		teacher1.setTeacher_gender(teacher.getTeacher_gender());
		teacher1.setTeacher_idcard(teacher.getTeacher_idcard());
		teacher1.setTeacher_post(teacher.getTeacher_post());
		teacher1.setEntry_time(teacher.getEntry_time());
		teacher1.setTeacher_password(teacher.getTeacher_password());
		teacher1.setPhone_number(teacher.getPhone_number());
		teacher1.setPhotoaddress(teacher.getPhotoaddress());
		teacher1.setFamilyaddress(teacher.getFamilyaddress());
		teacher1.setIntroduce(teacher.getIntroduce());
		ManagerService managerService = new ManagerService();
		managerService.addTeacher(teacher1);
		setTip("新增教师");
		return "success";
	}
}

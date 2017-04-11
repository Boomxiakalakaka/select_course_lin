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

	private int student_id;
	private String student_name;
	private int student_gender;
	private String idcard;
	private String student_password;
	private int department_id;
	private int specialty_id;
	private String politics;
	private String photoaddress;
	private int phonenumber;
	private String mailbox;
	private int qqnumber;
	private String familyaddress;
	
	
	private int course_id;
	private String course_name;
	private String teacher_name;
	private String course_time;			//上课时间
	private String course_period;		//课程课时
	private String course_credit;		//课程学分
	private String course_site;			//上课地点
	private String course_introduce;	//课程介绍
	
	private int record_id;
	private int record_student_id;
	private int record_course_id;

	
	private String department_name;
	private String department_director;		//学院主任
	private String department_photonumber;	//学院联系方式
	private String department_introduce;	//学院介绍
	
	
	private int teacher_id;
	
	private int teacher_gender;
	private String teacher_idcard;		//教师身份证号
	private String teacher_post;		//教师职位
	private String entry_time;			//教师入职时间
	private String teacher_password;
	private String phone_number;
	
	private String introduce;
	
	
	private  String tip=null;
	
	
	

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public int getTeacher_gender() {
		return teacher_gender;
	}

	public void setTeacher_gender(int teacher_gender) {
		this.teacher_gender = teacher_gender;
	}

	public String getTeacher_idcard() {
		return teacher_idcard;
	}

	public void setTeacher_idcard(String teacher_idcard) {
		this.teacher_idcard = teacher_idcard;
	}

	public String getTeacher_post() {
		return teacher_post;
	}

	public void setTeacher_post(String teacher_post) {
		this.teacher_post = teacher_post;
	}

	public String getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(String entry_time) {
		this.entry_time = entry_time;
	}

	public String getTeacher_password() {
		return teacher_password;
	}

	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(int student_gender) {
		this.student_gender = student_gender;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getSpecialty_id() {
		return specialty_id;
	}

	public void setSpecialty_id(int specialty_id) {
		this.specialty_id = specialty_id;
	}

	public String getPolitics() {
		return politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getPhotoaddress() {
		return photoaddress;
	}

	public void setPhotoaddress(String photoaddress) {
		this.photoaddress = photoaddress;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public int getQqnumber() {
		return qqnumber;
	}

	public void setQqnumber(int qqnumber) {
		this.qqnumber = qqnumber;
	}

	public String getFamilyaddress() {
		return familyaddress;
	}

	public void setFamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}

	

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getCourse_time() {
		return course_time;
	}

	public void setCourse_time(String course_time) {
		this.course_time = course_time;
	}

	public String getCourse_period() {
		return course_period;
	}

	public void setCourse_period(String course_period) {
		this.course_period = course_period;
	}

	public String getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(String course_credit) {
		this.course_credit = course_credit;
	}

	public String getCourse_site() {
		return course_site;
	}

	public void setCourse_site(String course_site) {
		this.course_site = course_site;
	}

	public String getCourse_introduce() {
		return course_introduce;
	}

	public void setCourse_introduce(String course_introduce) {
		this.course_introduce = course_introduce;
	}

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public int getRecord_student_id() {
		return record_student_id;
	}

	public void setRecord_student_id(int record_student_id) {
		this.record_student_id = record_student_id;
	}

	public int getRecord_course_id() {
		return record_course_id;
	}

	public void setRecord_course_id(int record_course_id) {
		this.record_course_id = record_course_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_director() {
		return department_director;
	}

	public void setDepartment_director(String department_director) {
		this.department_director = department_director;
	}

	public String getDepartment_photonumber() {
		return department_photonumber;
	}

	public void setDepartment_photonumber(String department_photonumber) {
		this.department_photonumber = department_photonumber;
	}

	public String getDepartment_introduce() {
		return department_introduce;
	}

	public void setDepartment_introduce(String department_introduce) {
		this.department_introduce = department_introduce;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String addStudent(){
		Student student = new Student();
		student.setStudent_name(getStudent_name());
		student.setStudent_gender(getStudent_gender());
		student.setIdcard(getIdcard());
		student.setStudent_password(getStudent_password());
		student.setPolitics(getPolitics());
		student.setPhonenumber(getPhonenumber());
		student.setMailbox(getMailbox());
		student.setQqnumber(getQqnumber());
		student.setFamilyaddress(getFamilyaddress());
		System.out.println(student.getStudent_name()+":"+student.getStudent_gender()+":"+
		student.getIdcard()+":"+student.getStudent_password()+":"+student.getPolitics()+":"+student.getPhonenumber()
		+":"+student.getMailbox()+":"+student.getQqnumber()+":"+student.getFamilyaddress());
		ManagerService managerService=new ManagerService();
		managerService.addStudent(student);
		
		setTip("新增学生");
		return "success";
	}
	
	public String addCourse(){
		Course course = new Course();
		course.setCourse_name(course_name);
		course.setTeacher_name(teacher_name);
		course.setCourse_time(course_time);
		course.setCourse_period(course_period);
		course.setCourse_credit(course_credit);
		course.setCourse_site(course_site);
		course.setCourse_introduce(course_introduce);
		ManagerService   managerService = new ManagerService();
		managerService.addCourse(course);
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
		Department department = new Department();
		department.setDepartment_name(getDepartment_name());
		department.setDepartment_director(getDepartment_director());
		department.setDepartment_photonumber(getDepartment_photonumber());
		department.setDepartment_introduce(getDepartment_introduce());
		ManagerService  managerService = new ManagerService();
		managerService.addDepartment(department);
		setTip("新增学院");
		return "success";
	}
	
	public String addTeacher(){
		Teacher teacher = new Teacher();
		teacher.setTeacher_name(teacher_name);
		teacher.setTeacher_gender(teacher_gender);
		teacher.setTeacher_idcard(teacher_idcard);
		teacher.setTeacher_post(teacher_post);
		teacher.setEntry_time(entry_time);
		teacher.setTeacher_password(teacher_password);
		teacher.setPhone_number(phone_number);
		teacher.setPhotoaddress(photoaddress);
		teacher.setFamilyaddress(familyaddress);
		teacher.setIntroduce(course_introduce);
		ManagerService managerService = new ManagerService();
		managerService.addTeacher(teacher);
		setTip("新增教师");
		return "success";
	}
}

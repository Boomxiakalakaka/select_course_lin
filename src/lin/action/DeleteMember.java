package lin.action;



public class DeleteMember {
	private int student_id;
	private int course_id;
	public  String tip=null;
	
	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String execute(){
		/*UpdateMemberServiceImpl updateMemberServiceImpl= new UpdateMemberServiceImpl();
		updateMemberServiceImpl.deleteStudent(student_id);
		setTip("删除学生");*/
		return "success";
	}
	
	public String deleteCourse(){
		/*UpdateMemberServiceImpl updateMemberServiceImpl= new UpdateMemberServiceImpl();
		updateMemberServiceImpl.deleteCourse(course_id);
		setTip("删除课程");*/
		return "success";
	}
}

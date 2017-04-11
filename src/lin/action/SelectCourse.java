package lin.action;

import java.util.List;

import lin.domain.Course;

public class SelectCourse {
	
	private List<Course> courseList=null;
	
	
	
	public List<Course> getCourseList() {
		return courseList;
	}



	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}



	//学生选课
	public String studentSelectCourse(){	
		/*UpdateMemberServiceImpl updateMemberServiceImpl = new UpdateMemberServiceImpl();
		setCourseList(updateMemberServiceImpl.findCourse());*/
		return "studentSelectCourse";
	}
}

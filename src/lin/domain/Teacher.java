package lin.domain;

import java.util.Date;

public class Teacher {
	
	private int teacher_id;
	private String teacher_name;
	private int teacher_gender;
	private String teacher_idcard;		//老师身份证号
	private String teacher_post;		//老师职位
	private Date entry_time;			//教师入职时间
	private String teacher_password;
	private String phone_number;
	private String photoaddress;
	private String familyaddress;
	private String introduce;
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
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
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
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
	public String getPhotoaddress() {
		return photoaddress;
	}
	public void setPhotoaddress(String photoaddress) {
		this.photoaddress = photoaddress;
	}
	public String getFamilyaddress() {
		return familyaddress;
	}
	public void setFamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	
}

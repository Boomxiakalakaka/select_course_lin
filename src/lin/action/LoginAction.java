package lin.action;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import lin.domain.Manager;
import lin.domain.Student;



import lin.service.ManagerService;
import lin.service.StudentService;




import org.apache.struts2.ServletActionContext;
import org.dom4j.Node;
import org.dom4j.rule.Action;










import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{

	
	private String username;
	private String password;
	private String tip;
	/*@Autowired
	private StudentService studentService;*/
	
	

	public String execute(){
		System.out.println(getUsername()+":"+getPassword());
		ManagerService  managerService = new ManagerService();
		boolean isValidUser=managerService.getMatchCount(getUsername(), getPassword());
		
			if(isValidUser){
				HttpServletRequest request=ServletActionContext.getRequest();
				request.getSession().setAttribute("username",getUsername());
				//ActionContext.getContext().getSession().put("user",getUsername());
				return "success";
			}			
		setTip("用户名或密码错误！");	
		return "error";
	}
	

	public String StudentLoginVerify(){
		System.out.println(getUsername()+":"+getPassword());
		StudentService studentService = new StudentService();
		boolean isValidUser=studentService.getMatchCount(getUsername(), getPassword());
		
			if(isValidUser){
				HttpServletRequest request=ServletActionContext.getRequest();
				request.getSession().setAttribute("username",getUsername());
				//ActionContext.getContext().getSession().put("user",getUsername());
				return "welcome_student";
			}			
		setTip("用户名或密码错误！");	
		return "error";
	}
	
	/*public String StudentLoginVerify(){
		LoginVerifyServiceImpl loginVerifyServiceImpl=new LoginVerifyServiceImpl();
		List<Student>students =loginVerifyServiceImpl.StudentLoginVerify();
		for(Student student:students){
			
			if(getUsername().equals(student.getStudent_name())&&getPassword().equals(student.getStudent_password())){
				ActionContext.getContext().getSession().put("user",getUsername());
				return "success";
			}
		}	
		return "error";
	}*/
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}

package lin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lin.dao.inter.TeacherDaoInter;
import lin.domain.Department;
import lin.domain.Teacher;
import lin.util.SessionFactoryUtil;

public class TeacherDao implements TeacherDaoInter {
	SessionFactoryUtil sessionFactoryUtil=new SessionFactoryUtil();
	SessionFactory  sessionFactory=sessionFactoryUtil.getSessionFactory();
	Session session = null;
	static List<Teacher> teacherList=null;
	
	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		try{
			session= sessionFactory.openSession();
			session.save(teacher);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public List<Teacher> findAllTeacher() {
		String hqlString ="from Teacher"; 
		try{
			 session=sessionFactory.openSession();
			 teacherList=session.createQuery(hqlString).list();  
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return teacherList;
	}

}

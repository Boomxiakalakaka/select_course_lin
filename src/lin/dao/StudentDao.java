package lin.dao;

import java.util.List;

import lin.dao.inter.StudentDaoInter;
import lin.domain.Student;
import lin.util.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements StudentDaoInter{
	SessionFactoryUtil sessionFactoryUtil=new SessionFactoryUtil();
	SessionFactory  sessionFactory=sessionFactoryUtil.getSessionFactory();
	static List<Student>studentList =null;
	@Override
	public int getMatchCount(String userName, String password){
		String hqlString ="select count(*) from Student as s where s.student_name='"+userName+"' and s.student_password='"+password+"'";
		int matchCount=0;
		try{
			Session session = sessionFactory.openSession();
			Query query			= session.createQuery(hqlString);
		    matchCount=((Number)query.uniqueResult()).intValue();
		}catch(Exception e){
			e.printStackTrace();
		}
		return matchCount;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.openSession();
			session.save(student);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		String sqlString ="from Student";
		try{
			Session session = sessionFactory.openSession();
			studentList=session.createQuery(sqlString).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return studentList;
	}
	
	

}


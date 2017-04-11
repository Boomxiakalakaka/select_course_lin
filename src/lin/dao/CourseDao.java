package lin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lin.dao.inter.CourseDaoInter;
import lin.domain.Course;
import lin.util.SessionFactoryUtil;

public class CourseDao implements CourseDaoInter {
	SessionFactoryUtil sessionFactoryUtil=new SessionFactoryUtil();
	SessionFactory  sessionFactory=sessionFactoryUtil.getSessionFactory();
	Session session = null;
	static List<Course>courseList=null;
	
	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		try{
			session=sessionFactory.openSession();
			session.save(course);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//查询所有课程
	@Override
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		String hqlString = "from Course";
		try{
			session = sessionFactory.openSession();
			courseList=session.createQuery(hqlString).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return courseList;
	}

}

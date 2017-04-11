package lin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lin.dao.inter.DepartmentDaoInter;
import lin.domain.Department;
import lin.util.SessionFactoryUtil;

public class DepartmentDao implements DepartmentDaoInter {
	SessionFactoryUtil sessionFactoryUtil=new SessionFactoryUtil();
	SessionFactory  sessionFactory=sessionFactoryUtil.getSessionFactory();
	Session session = null;
	static List<Department> departmentList=null;
	
	//查询所有学院
	@Override
	public List<Department> findAllDepartment() {
		
		String hqlString ="from Department"; 
		try{
			 session=sessionFactory.openSession();
			 departmentList=session.createQuery(hqlString).list();  
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return departmentList;
	}

	//新增学院
	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		try{
			session=sessionFactory.openSession();
			session.save(department);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}

package lin.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lin.dao.inter.ManagerDaoInter;
import lin.util.SessionFactoryUtil;

public class ManagerDao implements ManagerDaoInter {
	SessionFactoryUtil sessionFactoryUtil=new SessionFactoryUtil();
	SessionFactory  sessionFactory=sessionFactoryUtil.getSessionFactory();
	
	//登录验证
	@Override
	public int getMatchCount(String userName, String password) {
		String hqlString ="select count(*) from Manager as m where m.manager_name='"+userName+"' and m.manager_password='"+password+"'";
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
	
	
}



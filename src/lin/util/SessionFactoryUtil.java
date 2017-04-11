package lin.util;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try{
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory getsessionFactory = (SessionFactory)ac.getBean("sessionFactory");
		return getsessionFactory;
		}catch(Exception e){
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void shutdown(){
		getSessionFactory().close();
	}
}

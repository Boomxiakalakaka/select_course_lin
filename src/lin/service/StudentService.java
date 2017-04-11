package lin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lin.dao.StudentDao;
import lin.service.inter.StudentServiceInter;

@Service
public class StudentService implements StudentServiceInter{
	
	/*@Autowired
	StudentDao studentDao;*/
	
	@Override
	public boolean getMatchCount(String userName, String password) {
		// TODO Auto-generated method stub
		StudentDao studentDao=new StudentDao();
		int matchCount=studentDao.getMatchCount(userName, password);
		return matchCount>0;
	}

}

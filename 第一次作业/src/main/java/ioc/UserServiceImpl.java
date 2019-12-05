package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		this.userDao.say();
		System.out.println("UserService say hello World!");
	}

}

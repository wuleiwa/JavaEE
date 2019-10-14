package service;

import org.springframework.stereotype.Service;

import dao.UserDao;
import lombok.Setter;

@Service
public class UserServiceImpl implements UserService{

	@Setter
	private UserDao userDao;
	
	@Override
	public void updateUser() {
		userDao.updateUser();
		
	}

	@Override
	public void deleteUser() {
		userDao.deleteUser();
		
	}

}

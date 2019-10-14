package ioc;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		System.out.println("userDao say hello World!");
	}

}

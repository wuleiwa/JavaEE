package dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println("更新用户信息");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("删除用户信息");
	}

}

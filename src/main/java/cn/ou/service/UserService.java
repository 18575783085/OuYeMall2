package cn.ou.service;

import cn.ou.entity.User;
/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 业务层根据用户名和密码实现登录，
	 * 如果根据用户名和密码能够查询出用户信息则返回该用户的信息，
	 * 反之返回null
	 * @param username ：用户名
	 * @param password ：密码
	 * @return 存在则返回User user ，不存在则返回null
	 */
	public User login(String username, String password);
	
	/**
	 * 判断用户名在user表中是否存在
	 * @param username : 用户名
	 * @return true：用户已存在  false：不存在
	 */
	public boolean unisExist(String username);

}
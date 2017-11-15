package cn.uc.yqb.dao;

import cn.uc.yqb.utils.Result;

public interface UserDao {

	/**
	 * 查看全部
	 */
	Result getAllUser();
	
	/**
	 * 查询
	 */
	Result getUser(UserDao user);
	
	/**
	 *增加
	 */
	Result insertUser(UserDao user);
	
	/**
	 * 修改
	 */
	Result updateUser(UserDao user);
	
	/**
	 * 删除
	 */
	Result deleteUser(int id);
	
	
}

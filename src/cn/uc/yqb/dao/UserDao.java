package cn.uc.yqb.dao;

import cn.uc.yqb.utils.Result;

public interface UserDao {

	/**
	 * �鿴ȫ��
	 */
	Result getAllUser();
	
	/**
	 * ��ѯ
	 */
	Result getUser(UserDao user);
	
	/**
	 *����
	 */
	Result insertUser(UserDao user);
	
	/**
	 * �޸�
	 */
	Result updateUser(UserDao user);
	
	/**
	 * ɾ��
	 */
	Result deleteUser(int id);
	
	
}

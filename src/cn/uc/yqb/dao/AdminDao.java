package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Admin;
import cn.uc.yqb.utils.Result;

public interface AdminDao {

	/**
	 * ���
	 */
	Result insertAdmin(Admin admin);
	
	/**
	 * �޸�
	 */
	Result updateAdmin(Admin admin);
	
	/**
	 * ɾ��
	 */
	Result deleteAdmin(int id);
	
}

package cn.uc.yqb.dao;

import cn.uc.yqb.utils.Result;

public interface TypeDao {
	
	/**
	 * �鿴ȫ��
	 */
	Result getAllType();
	
	/**
	 * ���
	 */
	Result insertType(TypeDao type);
	
	/**
	 * ɾ��
	 */
	Result deleteType(int id);

}

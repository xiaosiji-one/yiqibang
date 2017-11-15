package cn.uc.yqb.dao;

import cn.uc.yqb.utils.Result;

public interface TypeDao {
	
	/**
	 * 查看全部
	 */
	Result getAllType();
	
	/**
	 * 添加
	 */
	Result insertType(TypeDao type);
	
	/**
	 * 删除
	 */
	Result deleteType(int id);

}

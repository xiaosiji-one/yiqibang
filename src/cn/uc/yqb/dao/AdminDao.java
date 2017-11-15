package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Admin;
import cn.uc.yqb.utils.Result;

public interface AdminDao {

	/**
	 * Ìí¼Ó
	 */
	Result insertAdmin(Admin admin);
	
	/**
	 * ĞŞ¸Ä
	 */
	Result updateAdmin(Admin admin);
	
	/**
	 * É¾³ı
	 */
	Result deleteAdmin(int id);
	
}

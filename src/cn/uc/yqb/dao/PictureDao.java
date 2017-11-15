package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Picture;
import cn.uc.yqb.utils.Result;

public interface PictureDao {
	
	/**
	 * ��ѯ
	 */
	Result getPicture(Picture pic);
	
	/**
	 * ����
	 */
	Result insertPicture(Picture pic);
	
	/**
	 * �޸�
	 */
	Result updatePicture(Picture pic);
	
	/**
	 * ɾ��
	 */
	Result deletePicture(Picture pic);
}

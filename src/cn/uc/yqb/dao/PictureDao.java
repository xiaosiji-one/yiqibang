package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Picture;
import cn.uc.yqb.utils.Result;

public interface PictureDao {
	
	/**
	 * 查询
	 */
	Result getPicture(Picture pic);
	
	/**
	 * 增加
	 */
	Result insertPicture(Picture pic);
	
	/**
	 * 修改
	 */
	Result updatePicture(Picture pic);
	
	/**
	 * 删除
	 */
	Result deletePicture(Picture pic);
}

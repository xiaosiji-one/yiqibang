package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Comment;
import cn.uc.yqb.utils.Result;

public interface CommentDao {
	
	/**
	 * 查看全部
	 * @return
	 */
	Result getAllComment();
	
	/**
	 * 查询
	 */
	Result getComment(Comment comment);
	
	/**
	 * 修改
	 */
	Result updateComment(Comment comment);
	
	/**
	 * 删除
	 */
	Result deleteComment(int id);
	
}

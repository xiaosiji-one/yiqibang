package cn.uc.yqb.dao;

import cn.uc.yqb.beans.Comment;
import cn.uc.yqb.utils.Result;

public interface CommentDao {
	
	/**
	 * �鿴ȫ��
	 * @return
	 */
	Result getAllComment();
	
	/**
	 * ��ѯ
	 */
	Result getComment(Comment comment);
	
	/**
	 * �޸�
	 */
	Result updateComment(Comment comment);
	
	/**
	 * ɾ��
	 */
	Result deleteComment(int id);
	
}

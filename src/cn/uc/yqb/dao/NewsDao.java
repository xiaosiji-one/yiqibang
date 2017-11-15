package cn.uc.yqb.dao;

import cn.uc.yqb.beans.News;
import cn.uc.yqb.utils.Result;

public interface NewsDao {
	
	/**
	 * ��ʾȫ��
	 * @return
	 */
	public Result getAllNews(); 
	
	/**
	 * ��ѯ
	 * @return
	 */
	public Result selectNews(News news);
	
	/**
	 * ���
	 */
	public Result insertNews(News news);
	
	/**
	 * �޸�
	 */
	public Result updateNews(News news);
	
	/**
	 * ɾ��
	 */
	public Result deleteNews(int news_id);
	
	
}

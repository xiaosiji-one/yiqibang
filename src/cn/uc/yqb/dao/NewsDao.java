package cn.uc.yqb.dao;

import cn.uc.yqb.beans.News;
import cn.uc.yqb.utils.Result;

public interface NewsDao {
	
	/**
	 * 显示全部
	 * @return
	 */
	public Result getAllNews(); 
	
	/**
	 * 查询
	 * @return
	 */
	public Result selectNews(News news);
	
	/**
	 * 添加
	 */
	public Result insertNews(News news);
	
	/**
	 * 修改
	 */
	public Result updateNews(News news);
	
	/**
	 * 删除
	 */
	public Result deleteNews(int news_id);
	
	
}

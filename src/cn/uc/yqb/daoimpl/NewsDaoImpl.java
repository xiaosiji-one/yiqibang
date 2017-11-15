package cn.uc.yqb.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yqb.beans.News;
import cn.uc.yqb.dao.NewsDao;
import cn.uc.yqb.utils.Constants;
import cn.uc.yqb.utils.MyBatisUtils;
import cn.uc.yqb.utils.Result;

public class NewsDaoImpl implements NewsDao{
	

	@Override
	public Result getAllNews() {
		Result result = new Result();
		SqlSession session = MyBatisUtils.openSession();

		List<News> newList = session.selectList(Constants.SELECTNEWS);
		session.close();
		if(newList!=null){
			result.setMsg(true);
			result.setRetData(newList);
		}else{
			result.setMsg(false);
						
		}
		
		return result;
	}

	@Override
	public Result insertNews(News news) {
		Result result = new Result();
		SqlSession session = MyBatisUtils.openSession();

		int row = session.insert(Constants.INSERTNEWS,news);
		session.commit();
		session.close();
		
		if(row!=0){
			result.setCode(Constants.RESP_CODE_SUCCESS);
			result.setMsg(true);
		}else{
			result.setCode(Constants.RESP_CODE_FAILS);
			result.setMsg(false);
		}
		
		return result;
	}
	
	@Override
	public Result selectNews(News news) {
		return null;
	}

	@Override
	public Result updateNews(News news) {
		
		Result result = new Result();
		SqlSession session = MyBatisUtils.openSession();

		int row = session.update(Constants.UPDATENEWS,news);
		session.commit();
		session.close();
		
		if(row!=0){
			result.setCode(Constants.RESP_CODE_SUCCESS);
			result.setMsg(true);
		}else{
			result.setCode(Constants.RESP_CODE_FAILS);
			result.setMsg(false);
		}
		
		return result;
		
	}

	@Override
	public Result deleteNews(int news_id) {
		// TODO Auto-generated method stub
		return null;
	}


}

package cn.uc.yqb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.yqb.beans.News;
import cn.uc.yqb.dao.NewsDao;
import cn.uc.yqb.daoimpl.NewsDaoImpl;
import cn.uc.yqb.utils.Result;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/NewsServlet")
public class NewsServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
   
	NewsDao newsDao = new NewsDaoImpl(); 
	/**
	 * 查看全部
	 * @param request
	 * @param response
	 */
	public void getAllNews(HttpServletRequest request,HttpServletResponse response){
		
		Result result = newsDao.getAllNews();
		
		request.setAttribute("result", result);
		try {
			request.getRequestDispatcher("/page/back/news_manage.jsp").forward(request, response);
		} catch (ServletException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		};
		
		/*String jsonResult = JSONObject.fromObject(result).toString();
		
		try {
			response.getWriter().print(jsonResult);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
	/**
	 * 查询
	 */
	
	/**
	 * 添加
	 */
	public void insertNews(HttpServletRequest request,HttpServletResponse response){
		
		int type = Integer.parseInt(request.getParameter("type"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String source = request.getParameter("source");
		String content = request.getParameter("content");
		boolean ifhot = request.getParameter("ifHot") == "true";
		
		News news = new News(title,source,type,0,0,null,new Date(),content,author,0,ifhot,false);		
		Result result = newsDao.insertNews(news);
		
		String jsonObject = JSONObject.fromObject(result).toString();
		
		try {
			response.getWriter().println(jsonObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 修改
	 */
	public void updateNews(HttpServletRequest request,HttpServletResponse response){
		
		int id = Integer.parseInt(request.getParameter("id"));
		int type = Integer.parseInt(request.getParameter("type"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String source = request.getParameter("source");
		String content = request.getParameter("content");
		boolean ifhot = request.getParameter("ifHot") == "true";
		
		News news = new News(title,source,type,0,0,null,new Date(),content,author,0,ifhot,false);	
		news.setId(id);
		Result result = newsDao.insertNews(news);
		
		String jsonObject = JSONObject.fromObject(result).toString();
		
		try {
			response.getWriter().println(jsonObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}

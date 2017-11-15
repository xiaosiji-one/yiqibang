package cn.uc.yqb.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.yqb.utils.Result;
import net.sf.json.JSONObject;



/**
 * Servlet implementation class beanServlet
 */
@WebServlet("/BeanServlet")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Result result = new Result();
		result.setMsg(false);
		
		String action = request.getParameter("action");
		
		if(action==null||"".equals(action)){
			result.setRetData("请求参数非法，必须携带action表明您的意图");
			String jsonResult = JSONObject.fromObject(result).toString();
			
			response.getWriter().println(jsonResult);
		}else{
			
			try {
				Method method = this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			
				method.invoke(this,request, response);
			
			} catch (NoSuchMethodException e) {				
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
			
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				result.setRetData("请求参数错误！！！");
				String jsonResult = JSONObject.fromObject(result).toString();				
				response.getWriter().println(jsonResult);
				
				e.printStackTrace();
			}
			
		}
			
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}

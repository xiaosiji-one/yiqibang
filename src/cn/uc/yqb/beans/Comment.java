package cn.uc.yqb.beans;

import java.util.Date;

public class Comment {
	/**
	 * 主键id
	 */
	private int id;
	/**
	 * 评论新闻id
	 */
	private int t_n_id;
	/**
	 * 评论用户id
	 */
	private int t_u_id;
	/**
	 * 评论内容
	 */
	private StringBuilder c_content;
	/**
	 * 修改时间
	 */
	private Date c_createtime;
	
	/**
	 * 点赞人数
	 */
	private int c_thumbscoumt;
	
	public Comment(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getT_n_id() {
		return t_n_id;
	}

	public void setT_n_id(int t_n_id) {
		this.t_n_id = t_n_id;
	}

	public int getT_u_id() {
		return t_u_id;
	}

	public void setT_u_id(int t_u_id) {
		this.t_u_id = t_u_id;
	}

	public StringBuilder getC_content() {
		return c_content;
	}

	public void setC_content(StringBuilder c_content) {
		this.c_content = c_content;
	}

	public Date getC_createtime() {
		return c_createtime;
	}

	public void setC_createtime(Date c_createtime) {
		this.c_createtime = c_createtime;
	}

	public int getC_thumbscoumt() {
		return c_thumbscoumt;
	}

	public void setC_thumbscoumt(int c_thumbscoumt) {
		this.c_thumbscoumt = c_thumbscoumt;
	}
	
	

}

package cn.uc.yqb.beans;

import java.util.Date;

public class Comment {
	/**
	 * ����id
	 */
	private int id;
	/**
	 * ��������id
	 */
	private int t_n_id;
	/**
	 * �����û�id
	 */
	private int t_u_id;
	/**
	 * ��������
	 */
	private StringBuilder c_content;
	/**
	 * �޸�ʱ��
	 */
	private Date c_createtime;
	
	/**
	 * ��������
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

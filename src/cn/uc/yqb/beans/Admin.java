package cn.uc.yqb.beans;

public class Admin {
	/**
	 * 主键id
	 */
	private int id;
	/**
	 * 用户id
	 */
	private int t_u_id;
	/**
	 * 管理员状态
	 */
	private int u_state;
	/**
	 * 管理员等级
	 */
	private int u_level;
	
	public Admin(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getT_u_id() {
		return t_u_id;
	}

	public void setT_u_id(int t_u_id) {
		this.t_u_id = t_u_id;
	}

	public int getU_state() {
		return u_state;
	}

	public void setU_state(int u_state) {
		this.u_state = u_state;
	}

	public int getU_level() {
		return u_level;
	}

	public void setU_level(int u_level) {
		this.u_level = u_level;
	}

	
}

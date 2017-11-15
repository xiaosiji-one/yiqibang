package cn.uc.yqb.beans;

import java.util.Date;

public class User {
	
	private int id;
	private String u_username;
	private String u_nickname;
	private String u_password;
	private boolean u_sex;
	private String u_bindtel;
	private String u_email;
	private String u_headimg;
	private boolean u_state;//×´Ì¬
	private String u_birthday;
	private String u_remark;//¸öÐÔÇ©Ãû
	private Date u_createtime;
	private Date u_update;
	private String provimce_id;
	private String city_id;
	private String area_id;
	
	public User(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getU_username() {
		return u_username;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public String getU_nickname() {
		return u_nickname;
	}

	public void setU_nickname(String u_nickname) {
		this.u_nickname = u_nickname;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public boolean isU_sex() {
		return u_sex;
	}

	public void setU_sex(boolean u_sex) {
		this.u_sex = u_sex;
	}

	public String getU_bindtel() {
		return u_bindtel;
	}

	public void setU_bindtel(String u_bindtel) {
		this.u_bindtel = u_bindtel;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_headimg() {
		return u_headimg;
	}

	public void setU_headimg(String u_headimg) {
		this.u_headimg = u_headimg;
	}

	public boolean isU_state() {
		return u_state;
	}

	public void setU_state(boolean u_state) {
		this.u_state = u_state;
	}

	public String getU_birthday() {
		return u_birthday;
	}

	public void setU_birthday(String u_birthday) {
		this.u_birthday = u_birthday;
	}

	public String getU_remark() {
		return u_remark;
	}

	public void setU_remark(String u_remark) {
		this.u_remark = u_remark;
	}

	public Date getU_createtime() {
		return u_createtime;
	}

	public void setU_createtime(Date u_createtime) {
		this.u_createtime = u_createtime;
	}

	public Date getU_update() {
		return u_update;
	}

	public void setU_update(Date u_update) {
		this.u_update = u_update;
	}

	public String getProvimce_id() {
		return provimce_id;
	}

	public void setProvimce_id(String provimce_id) {
		this.provimce_id = provimce_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	
	

}

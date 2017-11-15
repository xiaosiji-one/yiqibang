package cn.uc.yqb.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class News {
	/**
	 * ����id
	 */
	private int id;
	/**
	 * ����
	 */
	private String n_title;
	/**
	 * ������Դ
	 */
	private String n_source;
	/**
	 * ��������id
	 */
	private int t_t_id;
	
	/**
	 * �������
	 */
	private int n_readcount;
	/**
	 * ��������
	 */
	private int n_commcount;
	
	/**
	 * ��Ƶ
	 */
	private String n_video;
	/**
	 * ����ʱ��
	 */
	private Date n_createtime;
	/**
	 * ����
	 */
	private String n_content;
	/**
	 * ����
	 */
	private String n_author;
	/**
	 * ������
	 */
	private int n_sharecount;
	/**
	 * �Ƿ��ȵ�
	 */
	private boolean n_ifhot;
	/**
	 * �Ƿ񱻾ٱ�
	 */
	private boolean n_ifreport;
	
	public News(){
		
	}
	
	
	
	public News(String n_title, String n_source, int t_t_id, int n_readcount, int n_commcount, 
			String n_video, Date n_createtime, String n_content, String n_author, int n_sharecount, boolean n_ifhot,
			boolean n_ifreport) {
		super();
		this.n_title = n_title;
		this.n_source = n_source;
		this.t_t_id = t_t_id;
		this.n_readcount = n_readcount;
		this.n_commcount = n_commcount;

		this.n_video = n_video;
		this.n_createtime = n_createtime;
		this.n_content = n_content;
		this.n_author = n_author;
		this.n_sharecount = n_sharecount;
		this.n_ifhot = n_ifhot;
		this.n_ifreport = n_ifreport;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_source() {
		return n_source;
	}

	public void setN_source(String n_source) {
		this.n_source = n_source;
	}

	public int getT_t_id() {
		return t_t_id;
	}

	public void setT_t_id(int t_t_id) {
		this.t_t_id = t_t_id;
	}

	public int getN_readcount() {
		return n_readcount;
	}

	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}

	public int getN_commcount() {
		return n_commcount;
	}

	public void setN_commcount(int n_commcount) {
		this.n_commcount = n_commcount;
	}

	public String getN_video() {
		return n_video;
	}

	public void setN_video(String n_video) {
		this.n_video = n_video;
	}

	public String getN_createtime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String createtime = sdf.format(this.n_createtime);
		return createtime;
	}

	public void setN_createtime(Date n_createtime) {
		
		this.n_createtime = n_createtime;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public String getN_author() {
		return n_author;
	}

	public void setN_author(String n_author) {
		this.n_author = n_author;
	}

	public int getN_sharecount() {
		return n_sharecount;
	}

	public void setN_sharecount(int n_sharecount) {
		this.n_sharecount = n_sharecount;
	}

	public boolean isN_ifhot() {
		return n_ifhot;
	}

	public void setN_ifhot(boolean n_ifhot) {
		this.n_ifhot = n_ifhot;
	}

	public boolean isN_ifreport() {
		return n_ifreport;
	}

	public void setN_ifreport(boolean n_ifreport) {
		this.n_ifreport = n_ifreport;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+"";
	}
}

package cn.uc.yqb.utils;

public class Constants {

	/**
	 * 响应码
	 */
	public static final int RESP_CODE_SUCCESS = 0;
	public static final int RESP_CODE_FAILS=2000;
	
	/**
	 * 响应文件的根路径
	 */
	public static final String ROOT = "cn.uc.yqb.mapper";
	
	/**
	 * 新闻管理
	 */
	public static final String NEWMAPPER = ".newsMapper";
	
	//sql语句id
	public static final String GETALLNEWSID = ".getAllNews";
	public static final String INSERTNEWSID = ".insertNews";
	public static final String UPDATENEWSID = ".updateNews";
	
	public static final String SELECTNEWS = ROOT+NEWMAPPER+GETALLNEWSID;
	public static final String INSERTNEWS = ROOT+NEWMAPPER+INSERTNEWSID;
	public static final String UPDATENEWS = ROOT+NEWMAPPER+UPDATENEWSID;
	
}

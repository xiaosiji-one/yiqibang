package cn.uc.yqb.utils;

public class Constants {

	/**
	 * ��Ӧ��
	 */
	public static final int RESP_CODE_SUCCESS = 0;
	public static final int RESP_CODE_FAILS=2000;
	
	/**
	 * ��Ӧ�ļ��ĸ�·��
	 */
	public static final String ROOT = "cn.uc.yqb.mapper";
	
	/**
	 * ���Ź���
	 */
	public static final String NEWMAPPER = ".newsMapper";
	
	//sql���id
	public static final String GETALLNEWSID = ".getAllNews";
	public static final String INSERTNEWSID = ".insertNews";
	public static final String UPDATENEWSID = ".updateNews";
	
	public static final String SELECTNEWS = ROOT+NEWMAPPER+GETALLNEWSID;
	public static final String INSERTNEWS = ROOT+NEWMAPPER+INSERTNEWSID;
	public static final String UPDATENEWS = ROOT+NEWMAPPER+UPDATENEWSID;
	
}

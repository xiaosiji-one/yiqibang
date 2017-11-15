<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>新闻管理</title>
		<link href="css/news_index.css" rel="stylesheet">
	    <link href="../bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	
	    <script src="../jQuery/jquery-3.2.1.min.js" type="text/javascript"></script>
	    <script src="../bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	    <script src="js/date_util.js" type="text/javascript"></script>
	    
	    <!-- eEditor -->
	    <!-- 配置文件 -->
	    <script type="text/javascript" src="js/uEditer/ueditor.config.js"></script>
	    <!-- 编辑器源码文件 -->
	    <script type="text/javascript" src="js/uEditer/ueditor.all.js"></script>

	  
	 	
	</head>
<body>

	
    <div id="all">
        <!--头部-->
        <%@include file="top.jsp" %>
        <!--体部分-->
        <div id="body" class="clear">
            <!--左边-->
            <%@include file="left.jsp" %>
            <!-- 右边部分 -->
            <div id="right">
            	<div class="clear">
            		<p>新闻管理</p>
            		<div>
            			<span>类型</span><input type="text" name="class">
		                <span>标题</span><input type="text" name="name">
		                <span>时间</span><input type="text" name="date">
		                <button>查找</button>
            		</div>
	                
	                <button id="add_new" type="button" data-toggle="modal" data-target="#myModal">
	                添加
	                </button>

            	</div>
            	
            	<div class="table">
					<form>	
	                <table>
	                    <thead>
		                    <th>序号</th>
		                    <th>标题</th>
		                    <th>作者</th>
		                    <th>来源</th>
		                    <th>分类</th>
		                    <th>图片</th>
		                    <th>视频</th>
		                    <th>内容</th>
		                    <th>热点</th>
		                    <th>举报</th>
		                    <th>创建时间</th>
		                    <th>浏览数</th>
		                    <th>评论数</th>
		                    <th>点赞数</th>
		                    <th>操作</th>
	                    </thead>
	                    <tbody>
	                  <c:if test="${result.msg==true }">
	                  <c:forEach items="${result.retData}" var="n">
		                    <tr>
		                        <td>${n.id }</td>
		                        <td class="title">
		                        	<div title="${n.n_title }">${n.n_title }</div>
		                        </td>
		                        <td class="aut">${n.n_author }</td>
		                        <td class="aut">${n.n_source }</td>
		                        <td>${n.t_t_id }</td>
		                        <td class="pic">
		                            <img class="p1" src="">
		                        
									<img class="p2" src="">
								
									<img class="p3" src="">
									
		                        </td>
		                        <td class="video">${n.n_video }</td>
		                        <td class="content">
		                        	<div title="${n.n_content }">${n.n_content }</div>
		                        </td>
		                        <td>${n.n_ifhot?"是":"否" }</td>
		                        <td>${n.n_ifreport?"是":"否" }</td>
		                        <td>
		                        	${n.n_createtime }	                        
		                        </td>
		                        <td>${n.n_readcount }</td>
		                        <td>${n.n_commcount }</td>
		                        <td>${n.n_sharecount }</td>
		                        <td>
		                            <img src="img/xiugai.png" class="update_news">
		                            <img src="img/shanchu.png">
		                        </td>
		                     
		                    </tr> 
			           	</c:forEach>   
			          </c:if>      
	                    </tbody> 
	                    </form>                  	
                    
	                </table>
            
                </div>
                <!-- 页码部分 -->
                <%@include file="page_num.jsp" %>
            </div>
        </div>
        
        <%@include file="add_update.jsp" %>
    
    </div>
	

</body>
	<script type="text/javascript" src="js/new_script.js"></script>
	<script type="text/javascript">
	 /*$("#myModal").modal('show');*/
	
    //实例化编辑器
    var ue = UE.getEditor('editor', {
        //focus时自动清空初始化时的内容
        autoClearinitialContent : true,
        //关闭字数统计
        wordCount : false,
        //关闭elementPath
        elementPathEnabled : false,
        //默认的编辑区域高度
        initialFrameWidth : 650,
        initialFrameHeight : 280
        //更多其他参数，请参考ueditor.config.js中的配置项
    });
	
	</script>
</html>
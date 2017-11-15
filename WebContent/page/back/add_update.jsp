<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >

   <!-- 增加部分 --> 
    <div id="addNews" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">   
		<div class="all"></div>
		
        <div class="add_all">
            <div class="add">
                <h4>添加新闻</h4>
                <form>
                    <table>
                        <tr>
                            <td>
                                <label for="typeid">类型</label>
                            </td>
                            <td>
                                <select name="typeid" id="typeid">
                                    <option value="1">军事</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="title">标题</label>
                            </td>
                            <td>
                                <input type="text" id="title">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="author">作者</label>
                            </td>
                            <td>
                                <input type="text" id="author">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="source">来源</label>
                            </td>
                            <td>
                                <input type="text" id="source">
                            </td>
                        </tr>

                        <tr>
                            <td class="content">
                                <label>内容</label>
                            </td>
                            <td>
                                <div>
                                    <script id="editor" type="text/plain"></script>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>是否是热点</label>
                            </td>
                            <td>
                                <input class="hot" id="yes" type="radio" name="ifhot">
                                <span><label for="yes">是</label></span>
                                <input class="hot" id="no" type="radio" name="ifhot">
                                <span><label for="no">否</label></span>
                            </td>
                        </tr>
                    </table>
                    <div class="but">
                        <button type="button" class="clo">取消</button>
                        <button type="button" class="form">确定</button>

                    </div>
                    
                    

                </form>
            </div>
	
	        </div>
		</div>
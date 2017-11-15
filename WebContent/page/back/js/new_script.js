$(function(){
	var id;
	
	$(".update_news").click(function(){
		
		/* $(this).parents("tr").load("update_news.jsp");  */
		$("#addNews").modal('show');
		$("#addNews").find("h4").text("修改新闻");
		
		id = $(this).parents("tr").children().eq(0).text();	
		
		var typeid = $(this).parents("tr").children().eq(4).text();
		$("#typeid").val(typeid);
		
		var title = $(this).parents("tr").children().eq(1).text();
		$("#title").val(trim(title));
		
		var author = $(this).parents("tr").children().eq(2).text();
		$("#author").val(author);
		
		var source = $(this).parents("tr").children().eq(3).text();
		$("#source").val(source);
		
		var content = $(this).parents("tr").children().eq(7).text();
		ue.setContent(trim(content));
		
		var ifHot = $(this).parents("tr").children().eq(8).text();
		if(ifHot=="是"){
			$("#yes").attr("checked", true);
			$("#no").removeAttr("checked");
			
		}else{
			$("#yes").removeAttr("checked");
			$("#no").attr("checked", true);
		}
		
	}) 

	
	$("#add_new").click(function(){
		$("#addNews").modal('show');
	})
	
	$(".clo").click(function(){
		$("#addNews").modal('hide');
	})
	
	$(".form").click(function(){
		
		var h = $("#addNews").find("h4").text();
		alert(h);
		
		var type = $("#typeid").val();
		var title = $("#title").val();
		var author = $("#author").val();
		var source = $("#source").val();
		var content =ue.getContent();
		var ifHot = $("#yes").prop("checked") ? true:false;
		
		if(title==""&&author==""&&source==""&&content==""){
			
		}else{
			var data = {
				type:type,
				title:title,
				author:author,
				source:source,
				content:content,
				ifHot:ifHot					
			};
			
			if(h=="添加新闻"){
				data.action="insertNews";
			}else{
				data.action="updateNews";
				data.id=id;
			}
			
			$.ajax({
				url:"/yiqibang/NewsServlet",
				data:data,
				type : "post",
				timeout : 5000,
				success : function(data){
					console.log(data);
					var result = JSON.parse(data);
					if(result.msg){
						/*window.location.reload();*/						
						
					}else{
						alert("上传失败！！！");
					}
				}
				
			});
			
		}
	})
});

function trim(str) {
  return str.replace(/(^\s+)|(\s+$)/g, "");
};











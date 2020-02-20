<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/index_like.css">
<title>列表</title>
<!-- .mytable{
width:500em;
table-layout:fixed;/* 只有定义了表格的布局算法为fixed，下面td的定义才能起作用。 */
}
.mytable td{
width:100%;
word-break:keep-all;/* 不换行 */
white-space:nowrap;/* 不换行 */
overflow:hidden;/* 内容超出宽度时隐藏超出部分的内容 */
text-overflow:ellipsis;/* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一 起使用。*/
}
采用 css 样式 来隐藏 -->
<style type="text/css">
.style1{
overflow: hidden;
white-space:nowrap;
text-overflow: ellipsis;
width:200px;
}
</style>
</head>
<body>
发布时间：<input type="text" name="t1" onclick="WdatePicker()" value="${t1 }">--
<input type="text" name="t2" onclick="WdatePicker()" value="${t2 }">
排序<select name="sortt">
		<option value="1" ${sorrt==1?'selected':'' }>发布时间</option>
		<option value="2" ${sorrt==2?'selected':'' }>作者</option>
		<option value="3" ${sorrt==3?'selected':'' }>评论数量</option>
	</select>
	<input type="submit" value="查询">
<table>
	<tr>
		<td>编号</td>
		<td>标题</td>
		<td>内容</td>
		<td>栏目</td>
		<td>分类</td>
		<td>是否热门</td>
		<td>文章状态</td>
		<td>创建时间</td>
		<td>文章浏览量</td>
	</tr>
	<c:forEach items="${pg.list}" var="a" varStatus="count">
		<tr>
			<td >${count.count}</td>
			<td>${a.title}</td>
			<td><%-- ${a.content} --%></td>
			<td>${a.name}</td>
			<td>${a.name2}</td>
			<td>
				<c:if test="${a.hot==0}">非热门</c:if>
				<c:if test="${a.hot==1}">热门</c:if>
			</td>
			<td>
				<c:if test="${a.status==0}">审核被拒</c:if>
				<c:if test="${a.status==1}">审核通过</c:if>
			</td>
			<td>${a.created}</td>
			<td>${a.commentCnt}</td>
		</tr>
	</c:forEach>
	<tr>
			<td colspan="10s">
				<button name="pageNum" value="1">首页</button>
	  			<button name="pageNum" value="${pg.prePage==0?1:pg.prePage}">上一页</button>
	  			 <button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
	  			<button name="pageNum" value="${pg.pages }">尾页</button> 
			</td>
		</tr>
</table>
</body>
</html>
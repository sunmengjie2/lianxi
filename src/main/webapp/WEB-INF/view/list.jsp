<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="/css/index_work.css">
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
</head>
<script type="text/javascript">
function add() {
	location="toAdd";
}

function updSta(state,id){
	location="updSta?state="+state+"&&id="+id;
}

</script>
<body>
<form action="list" method="post">
<table>
  <tr>
    <th></th>
    <th>影片名</th>
    <th>导演</th>
    <th>票价</th>
    <th>上映时间</th>
    <th>时长</th>
    <th>类型</th>
    <th>年代</th>
    <th>区域</th>
    <th>状态</th>
    <th>操作
    	<input type="button" value="添加" onclick="add()" />
    </th>
  </tr>
  <c:forEach items="${list }" var="f">
  <tr>
    <td></td>
    <td>${f.name }</td>
    <td>${f.direct }</td>
    <td>${f.price }</td>
    <td><fmt:formatDate value="${f.dataa }" pattern="yyyy-MM-dd"/></td>
    <td>${f.duration }</td>
    <td>${f.type }</td>
    <td>${f.timea }</td>
    <td>${f.area }</td>
    <td>
    	${f.state==0?"已经下架":"" }
    	${f.state==1?"正在热映":"" }
    	${f.state==2?"即将上映":"" }
    </td>
    <td>
    	<input type="button" onclick=updSta("${f.state==1?0:1}","${f.id }")  value="${f.state==1?'下架':'上架' }"/>
    </td>
  </tr>
  </c:forEach>
  <tr>
  	<td	colspan="20">
  		<button name="pageNum" value="1">首页</button>
  		<button name="pageNum" value="${page.prePage==0?1:page.prePage }">上一页</button>
  		<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button>
  		<button name="pageNum" value="${page.pages }">尾页</button>
  	</td>
  </tr>
</table>
</form>
</body>
</html>
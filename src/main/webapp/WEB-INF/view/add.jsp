<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="add" method="post" modelAttribute="f">
<table>
  <tr>
    <td>影片名</td>
    <td>
    	<form:input path="name"/>
    	<form:errors path="name"></form:errors>
    </td>
  </tr>
  <tr>
    <td>导演</td>
    <td>
    	<form:input path="direct"/>
    	<form:errors path="direct"></form:errors>
    </td>
  </tr>
  <tr>
    <td>票价</td>
    <td>
    	<form:input path="price"/>
    	<form:errors path="price"></form:errors>
    </td>
  </tr>
  <tr>
    <td>上映时间</td>
    <td>
    	<form:input path="dataa"/>
    	<form:errors path="dataa"></form:errors>
    </td>
  </tr>
  <tr>
    <td>时长</td>
    <td>
    	<form:input path="duration"/>
    	<form:errors path="duration"></form:errors>
    </td>
  </tr>
  <tr>
    <td>类型</td>
    <td>
    	<form:input path="type"/>
    	<form:errors path="type"></form:errors>
    </td>
  </tr>
  <tr>
    <td>年代</td>
    <td>
    	<form:input path="timea"/>
    	<form:errors path="timea"></form:errors>
    </td>
  </tr>
  <tr>
    <td>区域</td>
    <td>
    	<form:input path="area"/>
    	<form:errors path="area"></form:errors>
    </td>
  </tr>
  <tr>
    <td colspan="10">
    	<form:button>提交</form:button>
    </td>
  </tr>
</table>
</form:form>
</body>
</html>
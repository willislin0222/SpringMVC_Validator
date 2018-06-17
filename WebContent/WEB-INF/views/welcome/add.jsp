<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEMO</title>
</head>
<body>
<%-- 	          <form method="get" action="<%=request.getContextPath()%>/validator/show.do"> --%>
			<form:form  action="show.do"  modelAttribute="user" method="post">
               <font color="red"><form:errors path="*" cssClass="errorblock" element="div" /></font><%-- 全部顯示--%>
<%--                <font color="red"><form:errors path="email" cssClass="error"/></font><br>  單筆顯示 --%>
               <label for="name">名字</label>
               <form:input type="text" path="name" /><br>
               <label for="address">地址</label>
               <form:input type="text" path="address" /><br>
                <label for="email">信箱</label>
               <form:input type="text" path="email" /><br>
                <label for="email">照片</label>
               <form:input type="file" path="photo" /><br>
               <input type="submit" value="送出">
               
            </form:form>
<%--             </form> --%>
</body>
</html>
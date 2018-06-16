<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%// request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<title>我是展示層 (view) back-view.jsp</title>
</head>
<body>
<b>        
          這是 Internal Resource View (內部資源視圖): /WEB-INF/views/welcome/back-view.jsp
</b>
<hr>
	   【forward from Spring4 MVC】 \${param.name} = ${param.name}

<br> 
	   【forward from Spring4 MVC】 \${requestScope.greetingKey} = ${requestScope.greetingKey}

</body>
</html>





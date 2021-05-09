<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="GB18030">
    <title>一个简单的jsp页面——显示系统时间</title>
</head>
<body>
<!-- <% %>java代码 -->
<%
    Date data=new Date();  //获取日期对象
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //设置日期格式
    String today=df.format(data); //获取当前日期
%>
当前时间:<%=today%>   <!-- =java表达式 -->
</body>
</html>
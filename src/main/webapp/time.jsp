<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="GB18030">
    <title>һ���򵥵�jspҳ�桪����ʾϵͳʱ��</title>
</head>
<body>
<!-- <% %>java���� -->
<%
    Date data=new Date();  //��ȡ���ڶ���
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //�������ڸ�ʽ
    String today=df.format(data); //��ȡ��ǰ����
%>
��ǰʱ��:<%=today%>   <!-- =java���ʽ -->
</body>
</html>
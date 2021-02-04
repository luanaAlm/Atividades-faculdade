<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<%@ page import="br.com.facid.*" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta http-equiv="cache-control" content="max-age=0" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
	<meta http-equiv="pragma" content="no-cache" />
</head>

<body>
	<%="Hello World!"%>
	<br/>
	<%

		out.println("Your IP address is " + request.getRemoteAddr());
	%>
	<br/>
	<%
	   Date dNow = new Date();
	   SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	   out.print( "<h4 align=\"center\">" + ft.format(dNow) + "</h4>");
	%>

	<br/>
	<%
		HelloWorldJSP hello = new HelloWorldJSP();
	   out.print( "<h5 align=\"center\">" + hello.retorno() + "</h5>");
	%>
</body>

</html>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.*,java.text.*"%>
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
	<br />
	<%
		for(int i = 1 ; i<= 100;i++){
		out.println("Your IP address is " + request.getRemoteAddr());
	%>
	OK<br/>
	<%
		}
	%>
	<br />
</body>

</html>
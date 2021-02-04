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
	<table border="1" >
		<tr>
			<td>Nome</td>
			<td>Idade</td>
		</tr>
	<%
		List<Pessoa> lista  = BD.getPessoas();
		for(Pessoa p : lista){
	%>
	<tr>
		<td>
			<%
			out.println(p.getNome());
			%>
		</td>
		<td>
			<%
			out.println(p.getIdade());
			%>
		</td>
	</tr>
	<%
		}
	%>
	</table>
</body>

</html>
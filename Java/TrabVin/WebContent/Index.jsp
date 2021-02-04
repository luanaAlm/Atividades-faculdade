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
<meta charset="UTF-8">
<title>Cadastro de Maquinas</title>

<link rel="stylesheet" href="./style.css">
<style type="text/css"></style>

</head>

<body>
	<div class="contact_form">
		<div class="formulario">
			<h1>Cadastro de Maquinas</h1>
			<form action="maquinas" method="get">
				<p>
					<label>Cliente </label> <input type="text" name="nomeResp"
						placeholder="Nome do Cliente">
				</p>
				<p>
					<label>Maquina </label> <input type="text" name="marca"
						placeholder="Modelo da Maquina">
				</p>
				<p>
					<label>Processador </label> <input type="text" name="processador"
						placeholder="Modelo da Maquina">
				</p>
				<p>
					<label>Numero de Série </label> <input type="number"
						name="numSerie" placeholder="Número de série da Maquina">
				</p>
				<p>
					<label>Entrega </label> <input type="date" name="entrega"
						placeholder="entrega">
				</p>
				
			
				 <button type="submit" name="" id="enviar"><p>Cadastrar</p></button>
				
			</form>
			
		
		</div>
	</div>
</body>
</html>
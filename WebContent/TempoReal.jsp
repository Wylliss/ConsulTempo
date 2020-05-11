<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Macroclima"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<title>Clima agora</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
	<%
		Macroclima macroclima = (Macroclima) request.getAttribute("macroclima");
	%>
	<div id="main" class="container">
		<h1 class="page-header">
			<strong>Cidade</strong>: <strong><%=macroclima.getCidade()%></strong>
		</h1>
		<div class="row">
			<div class="col-md-12" style="background-color: #C0C0C0;">
				<p>
					<strong>Temperatura:</strong>
					<%=macroclima.getTemperatura()%>
					°C
				</p>
				<p>
					<strong>Condição:</strong>
					<%=macroclima.getCondicao()%></p>
				<p>
					<strong>Umidade:</strong>
					<%=macroclima.getUmidade()%>%
				</p>
				<p>
					<strong>Vento:</strong>
					<%=macroclima.getVento()%>
					km/h
				</p>
				<p>
					<strong>Pressão:</strong>
					<%=macroclima.getPressao()%>
					hPa
				</p>
			</div>
		</div>
		<hr />
		<div id="actions" class="row">
			<div class="col-md-12">
				<a href="index.html" class="btn btn-primary">Voltar</a>
			</div>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>
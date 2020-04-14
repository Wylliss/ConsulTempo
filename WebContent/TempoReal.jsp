<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Clima"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<title>Tempo Real</title>
</head>

<body>
	<%
		Clima clima = (Clima) request.getAttribute("clima");
	%>
	<div id="main" class="container">
		<h3 class="page-header">
			Cidade:
			<%=clima.getCidade()%></h3>
			<div class="row">
			<div class="col-md-12" style="background-color: #C0C0C0;">
		<p>
			Temperatura:
			<%=clima.getTemperatura()%>
			°C
		</p>
		<p>
			Condição:
			<%=clima.getCondicao()%></p>
		<p>
			Umidade:
			<%=clima.getUmidade()%>%
		</p>
		<p>
			Vento:
			<%=clima.getVento()%>
			km/h
		</p>
		<p>
			Pressão:
			<%=clima.getPressao()%>
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
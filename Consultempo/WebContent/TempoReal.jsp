<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Clima"%>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Tempo Real</title>
</head>

<body>
	<%
		Clima clima = (Clima) request.getAttribute("clima");
	%>
	
	<h1>Cidade: <%=clima.getCidade()%></h1>
	<p>Temperatura: <%=clima.getTemperatura()%> °C</p>
	<p>Condição: <%=clima.getCondicao()%></p>
	<p>Umidade: <%=clima.getUmidade()%>%</p>
	<p>Vento: <%=clima.getVento()%> km/h</p>
	<p>Pressão: <%=clima.getPressao()%> hPa</p>
</body>

</html>
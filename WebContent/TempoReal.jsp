<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Macroclima"%>
<!DOCTYPE html>
<html>

<style>
body {
	background-image: url(img/prev0.gif);
	background-attachment: fixed;
	background-size: 100%;
	background-repeat: no-repeat;
	background-color: #0000
}

head {
	background-image: url(img/prev0.gif);
	background-attachment: fixed;
	background-size: 100%;
	background-repeat: no-repeat;
	background-color: #0000
}
</style>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tempo Real</title>
</head>

<body>
	<%
		Macroclima macroclima = (Macroclima) request.getAttribute("macroclima");
	%>
	<div id="main" class="container">
		<h3 class="page-header">
			<strong>Cidade</strong>: <strong><%=macroclima.getCidade()%></strong>
		</h3>
		<div class="row">
			<div class="col-md-12" style="background-color: #C0C0C0;">
				<p>
					Temperatura:
					<%=macroclima.getTemperatura()%>
					°C
				</p>
				<p>
					Condição:
					<%=macroclima.getCondicao()%></p>
				<p>
					Umidade:
					<%=macroclima.getUmidade()%>%
				</p>
				<p>
					Vento:
					<%=macroclima.getVento()%>
					km/h
				</p>
				<p>
					Pressão:
					<%=macroclima.getPressao()%>
					hPa
				</p>

<div data-v-70bf4055="" class="topmenu"></div>
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
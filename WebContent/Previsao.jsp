<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Previsao, java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<title>previsão para semana</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<h1><strong>Previsão do clima para próxima semana</strong></h1>




	<%
		ArrayList<Previsao> previsoes = (ArrayList<Previsao>) request.getAttribute("previsao");
		for (Previsao p : previsoes) {
	%>
	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12" style="background-color: #C0C0C0;">
				<p>
					<label><strong>Data:</strong></label>
					<%=p.getDate()%><br> <em><%=p.getCondicao()%></em><br> <label><strong>Min:</strong></label>
					<%=p.getTempMin()%>
					°C<br> <label><strong>Max:</strong></label>
					<%=p.getTempMax()%>
					°C<br> <label><strong>Precipitação:</strong></label>
					<%=p.getChuvaPrec()%>
					mm<br> <label><strong>Chance de chuva:</strong></label>
					<%=p.getChuvaProb()%>%
				<p> <font color="Blue">******************* </font>

				<%
					}
				%>
				
				
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
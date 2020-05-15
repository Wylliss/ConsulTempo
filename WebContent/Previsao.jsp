<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Previsao, java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<head>
<title>previsão para semana</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<h1>
		<strong>Previsão do clima para próxima semana</strong>
	</h1>

	<%
		String icon;
		ArrayList<Previsao> previsoes = (ArrayList<Previsao>) request.getAttribute("previsao");
		for (Previsao p : previsoes) {

			if (p.getCondicao().equals("Sol")) {
				icon = "<img src='css/img/sol.gif' width=15% alt='Sol'  >";

			} else if (p.getCondicao().equals("Nublado")) {
				icon = "<img src='css/img/nublado.gif ' width=15% alt='Nublado'>";

			} else if (p.getCondicao().equals("Sol com algumas nuvens")) {
				icon = "<img src='css/img/nublado.gif'width=15% alt='Nublado' >";

			} else {
				icon = "<img src='css/img/chuva.gif' width=15% alt='chuva'>";
			}
	%>
	<div id="main" class="container"> 
	<div id="main" class="column"> 
		<div class="row">
			<div class="col-md-12" style="background-color: #C0C0C0;">
				<div class="row">
					
						<%=icon%>
					</div>
					
						<label>Data:</label>
						<%=p.getDate()%><br>
						<%=p.getCondicao()%><br> <label>Min:</label>
						<%=p.getTempMin()%>
						°C<br> <label>Max:</label>
						<%=p.getTempMax()%>
						°C<br> <label>Precipitação:</label>
						<%=p.getChuvaPrec()%>
						mm<br> <label>Chance de chuva:</label>
						<%=p.getChuvaProb()%>%
					</div>
				</div>
				
				<%
					}
				%>
				
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
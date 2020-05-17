<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="model.Clima, model.Macroclima, model.Microclima, java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<head>
<title>Tempo Real</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>

	<h1>
		São Paulo
	</h1>
	<%
		ArrayList<Clima> climas = (ArrayList<Clima>) request.getAttribute("climas");
		Microclima microclima = (Microclima) climas.get(0);
		Macroclima macroclima = (Macroclima) climas.get(1);
	%>

	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12" style="background-color: #FBF5EF;">


				<table border="1" width="50%" cellpadding="10">
					<tr>
						<td width="50%" valign="top">
							<h1>Micro</h1>
							<p>
								Temperatura:
								<%=microclima.getTemperatura()%>
								°C
							</p>
							<p>
								Pluviosidade:
								<%=microclima.getPluviosidade()%>
								mm
							</p>
							<p>
								<%
									ArrayList<Clima> Climas = (ArrayList<Clima>) request.getAttribute("climas");
									Microclima Microclima = (Microclima) climas.get(0);
									Macroclima Macroclima = (Macroclima) climas.get(1);

									String qAr;
									if (microclima.getQualidadeAr() <= 40) {
										qAr = "Bom";
									} else if (microclima.getQualidadeAr() <= 80) {
										qAr = "Moderado";
									} else if (microclima.getQualidadeAr() <= 120) {
										qAr = "Ruim";
									} else if (microclima.getQualidadeAr() <= 200) {
										qAr = "Muito ruim";
									} else {
										qAr = "Péssimo";
									}
								%>
							
							<p>
								Coeficiente da qualidade do ar:
								<%=microclima.getQualidadeAr()%>
								(<%=qAr%>)
							</p>
							<p>
								Umidade:
								<%=microclima.getUmidade()%>%
							</p>
							<p>
								Vento:
								<%=microclima.getVento()%>
								km/h
							</p>
							<p>
								Pressão:
								<%=Integer.valueOf(microclima.getPressao() / 100)%>
								hPa
							</p>
						</td>
						<td width="50%" valign="top">
							<h1>Macro</h1>
							<p>
								Temperatura:
								<%=macroclima.getTemperatura()%>
								°C
							</p>
							<p>
								Sensação:
								<%=macroclima.getSensacao()%>
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
						</td>
					</tr>
				</table>

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
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
	<h1>Gráficos e indicadores</h1>


	<div id="main" class="container">
		<div class="row">
			<div class="col-md-12">

				<div class="flex-box container-box">
					<div class="content-box">


						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/charts/2?color=%23ffae00&dynamic=true&results=60&title=Temperatura+x+Tempo&type=line"></iframe>

						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/widgets/180300"></iframe>

						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/charts/5?bgcolor=%23ffffff&color=%23ffae00&dynamic=true&results=60&title=Coeficiente+da+qualidade+do+ar+x+Tempo&type=line"></iframe>
						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/widgets/180283"></iframe>

						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/charts/1?color=%23ffae00&dynamic=true&results=60&title=Umidade+do+Ar+x+Tempo&type=line"></iframe>

						<iframe width="450" height="260"
							style="border: 1px solid #cccccc;"
							src="https://thingspeak.com/channels/1057428/charts/3?bgcolor=%23ffffff&color=%23ffae00&dynamic=true&results=60&title=Press%C3%A3o+Atmosf%C3%A9rica+x+Tempo&type=line"></iframe>

					</div>
				</div>
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
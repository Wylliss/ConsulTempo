const app = document.getElementById('root')

const container = document.createElement('div')
container.setAttribute('class', 'container')

app.appendChild(container)

var request = new XMLHttpRequest()
request.open('GET', 'http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=25149dde939896af87233909d1ba3bfc', true)
request.onload = function() {
  // Begin accessing JSON data here
  var result = JSON.parse(this.response)
  if (request.status >= 200 && request.status < 400) {
    const card = document.createElement('div')
    card.setAttribute('class', 'card')

    const h1 = document.createElement('h1')
    h1.textContent = `São Paulo`
	
	const date = document.createElement('p')
    date.textContent = `Data: ${result.data.date}`
	  
	const temp = document.createElement('p')
	temp.textContent = `Temperatura: ${result.data.temperature} °C`

	const desc = document.createElement('p')
    desc.textContent = `Condição: ${result.data.condition}`
	
	const humidity = document.createElement('p')
    humidity.textContent = `Umidade: ${result.data.humidity}%`
	
	const wind = document.createElement('p')
    wind.textContent = `Ventos: ${result.data.wind_velocity} km/h`
	
	const pressure = document.createElement('p')
    pressure.textContent = `Pressão: ${result.data.pressure} hPa`

    container.appendChild(card)
    card.appendChild(h1)
	card.appendChild(date)
	card.appendChild(temp)
    card.appendChild(desc)
	card.appendChild(humidity)
	card.appendChild(wind)
	card.appendChild(pressure)
  }
}

request.send()
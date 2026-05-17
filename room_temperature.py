def temperature(temp):
	print("the temperature is", temp)
	
print('Measurement')
print('1. c ->celsius')
print('2. f ->fahrenheit')

unit_measurement = int(input('Enter unit measurement: '))

match(unit_measurement):
	case 1 :
		degree = int(input('Enter temperature: '))
		fahrenheit = (degree * 9/5)+ 32
		print(fahrenheit,'F')


		if (fahrenheit)< 60:
			print('Cold advisory')
		if (fahrenheit)> 80:
			print('Heat alert')

	case 2 :
		f_degree = int(input('Enter temperature: '))
		celsius = (f_degree - 32)* 5/9
		print(celsius,'C')


		if (celsius)< 20:
			print('Cold advisory')
		if (celsius)> 30:
			print('Heat alert')
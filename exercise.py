exercises

4.1
it will not have a default option to fall to if all of the other options are false.

4.2
The stack keeps growing until it runs out of space.

#4.3
def cube(x):
	"""calculate the cube of x"""
	return x**3
print(cube(2))
	missing a return statement

4.4
def mystery(x):
	y = 0
	for value in x:
		y += value **2

	return y

x = [1,2,3,4,5]
print(mystery(x))
	# it calxulates the sum of square
exercises

4.1
it will not have a default option to fall to if all of the other options are false.

4.2
The stack keeps growing until it runs out of space.

#4.3
def cube(x):
	"""calculate the cube of x"""
	return x**3
print(cube(2))
	missing a return statement

4.4
def mystery(x):
	y = 0
	for value in x:
		y += value **2

	return y

x = [1,2,3,4,5]
print(mystery(x))
	# it calxulates the sum of square

#4.5

#4.6

#4.7

#4.8

#4.9
def temperature(temp):
	print("the temperature is", temp)
	
print('Measurement')
print('1. c ->celsius')
print('2. f ->fahrenheit')

unit_measurement = int(input('Enter unit measurement: '))

match(unit_measurement):
	case 1 :
		degree = int(input('Enter temperature: '))
		fahrenheit = (degree * 9//5)+ 32
		print(fahrenheit,'F')


		if (fahrenheit)< 60:
			print('Cold advisory')
		if (fahrenheit)> 80:
			print('Heat alert')

	case 2 :
		f_degree = int(input('Enter temperature: '))
		celsius = (f_degree - 32)* 5//9
		print(celsius,'C')


		if (celsius)< 20:
			print('Cold advisory')
		if (celsius)> 30:
			print('Heat alert')


#4.10
import random
bet = int(input('Throw away your money: '))
randomnumber = random.randrange(1,1000)
print(randomnumber)
    


#4.11
import random
bet = int(input('Throw away your money: '))
for number in range(bet):
	randomnumber = random.randrange(1,1000)
	if bet != randomnumber:


		#continue
		#randomnumber = random.randrange(1,1000)
		print(randomnumber)
		continue

4.12






#4.5

#4.6

#4.7

#4.8

#4.9
def temperature(temp):
	print("the temperature is", temp)
	
print('Measurement')
print('1. c ->celsius')
print('2. f ->fahrenheit')

unit_measurement = int(input('Enter unit measurement: '))

match(unit_measurement):
	case 1 :
		degree = int(input('Enter temperature: '))
		fahrenheit = (degree * 9//5)+ 32
		print(fahrenheit,'F')


		if (fahrenheit)< 60:
			print('Cold advisory')
		if (fahrenheit)> 80:
			print('Heat alert')

	case 2 :
		f_degree = int(input('Enter temperature: '))
		celsius = (f_degree - 32)* 5//9
		print(celsius,'C')


		if (celsius)< 20:
			print('Cold advisory')
		if (celsius)> 30:
			print('Heat alert')


#4.10
import random
bet = int(input('Throw away your money: '))
randomnumber = random.randrange(1,1000)
print(randomnumber)
    


#4.11
import random
bet = int(input('Throw away your money: '))
for number in range(bet):
	randomnumber = random.randrange(1,1000)
	if bet != randomnumber:


		#continue
		#randomnumber = random.randrange(1,1000)
		print(randomnumber)
		continue

#4.12






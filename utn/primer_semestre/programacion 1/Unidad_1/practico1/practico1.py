import math

# Los algoritmos están comentados profesora para que no se ejecutaran todos al mismo tiempo.

"""
# 1 - primer mensaje
hola_mundo = "hola mundo"
print(hola_mundo)
"""

"""
# 2 - nombre de persona
nombre = input("ingresa tu nombre:")
print(f'Hola {nombre}')
"""

"""
# 3 - nombre, apellido, edad y lugar de residencia
nombre = input("Ingresa tu nombre:")
apellido = input("Ingresa tu apellido:")
edad = input("Ingresa tu edad:")
residencia = input("Ingresa tu residencia:")
print(f'Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}')
"""

"""
# 4 - área y perímetro
radio_circulo = float(input("Ingresa el radio del circulo:"))
area = math.pi * (radio_circulo ** 2)
perimetro = 2 * math.pi * radio_circulo
print(f'El área es: {area:.2f} y el perímetro es: {perimetro:.2f}')
"""

"""
# 5 - transformar segundos a horas
segundos_por_hora = 3600
pedir_segundos = float(input("ingresa una cantidad de segundos para transformar en horas:"))
horas = pedir_segundos / segundos_por_hora
print(f'{segundos_por_hora} segundos son equivalentes a {horas:.2f} horas aproximadamente')
"""


""" # 6 - tabla multiplicar
factor = int(input("ingresa un número:"))
print('{factor} * 0 = {factor * 0}')
print(f'{factor} * 1 = {factor * 1}')
print(f'{factor} * 2 = {factor * 2}')
print(f'{factor} * 3 = {factor * 3}')
print(f'{factor} * 4 = {factor * 4}')
print(f'{factor} * 5 = {factor * 5}')
print(f'{factor} * 6 = {factor * 6}')
print(f'{factor} * 7 = {factor * 7}')
print(f'{factor} * 8 = {factor * 8}')
print(f'{factor} * 9 = {factor * 9}')
print(f'{factor} * 10 = {factor * 10}')
print(f'{factor} * 11 = {factor * 11}')
print(f'{factor} * 12 = {factor * 12}')
"""

"""
# 7 - Operadores
print("Ingresa 2 numeros enteros distintos de 0")
primer_numero = int(input("Ingresa el primer número:"))
segundo_numero = int(input("Ingresa el segundo número:"))

print(f'la suma de {primer_numero} + {segundo_numero} es: {primer_numero + segundo_numero}')
print(f'la división de {primer_numero} / {segundo_numero} es: {(primer_numero / segundo_numero):.2f}')
print(f'la multiplicación de {primer_numero} * {segundo_numero} es: {primer_numero * segundo_numero}')
print(f'la resta de {primer_numero} - {segundo_numero} es: {primer_numero - segundo_numero}')
"""

"""
# 8 - IMC
altura = float(input("Ingresa tu altura en metros:"))
peso = float(input("Ingresa tu peso en kilos:"))
imc = peso / (altura ** 2)
print(f'Tu IMC es igual a {imc:.2f}')
"""

"""
# 9 - celsius a fahrenheit
print("Calculemos grados celius a fahrenheit")
celsius = float(input("Ingresa una cantidad de grados celcius:"))
fahrenheit = (9/5) * celsius + 32
print(f'{celsius} grados celius equivalen a {fahrenheit:.2f} grados fahrenheit')
"""

"""
# 10 - promedio
print("Ingresa 3 números para calcular su promedio")
numero_uno = float(input("Ingresa el primer número:"))
numero_dos = float(input("Ingresa el primer número:"))
numero_tres = float(input("Ingresa el primer número:"))
promedio = (numero_uno + numero_dos + numero_tres) / 3
print('el promedio de los números ingresados es {promedio:.2f}')
"""
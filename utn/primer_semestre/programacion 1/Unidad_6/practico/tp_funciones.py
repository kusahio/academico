import math

# 1. Crear una función llamada imprimir_hola_mundo que imprima por
# pantalla el mensaje: “Hola Mundo!”. Llamar a esta función desde el
# programa principal.

"""
def imprimir_hola_mundo():
    print('Hola Mundo!')

imprimir_hola_mundo()
"""

# 2. Crear una función llamada saludar_usuario(nombre) que reciba
# como parámetro un nombre y devuelva un saludo personalizado.
# Por ejemplo, si se llama con saludar_usuario("Marcos"), deberá devolver: “Hola Marcos!”.
# Llamar a esta función desde el programa principal solicitando el nombre al usuario.
"""
def saludar_usuario(nombre):
    return print(f'Hola {nombre}')

ingresa_usuario = input('Ingresa tu nombre de usuario: ').strip()

saludar_usuario(ingresa_usuario)
"""

# 3. Crear una función llamada informacion_personal(nombre, apellido, edad, residencia)
# que reciba cuatro parámetros e imprima: “Soy [nombre] [apellido], tengo [edad] años y vivo  en [residencia]”.
# Pedir los datos al usuario y llamar a esta función con los valores ingresados.

""" 
def informacion_personal(nombre, apellido, edad, residencia):
    print(f'Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}')

nombre = input('Ingresa tu nombre: ').capitalize().strip()
apellido = input('Ingresa tu apellido: ').capitalize().strip()
edad = input('Ingresa tu edad: ').capitalize().strip()
residencia = input('Ingresa tu residencia: ').capitalize().strip()

informacion_personal(nombre, apellido, edad, residencia)
"""

# 4. Crear dos funciones: calcular_area_circulo(radio) que reciba el radio como parámetro y devuelva el área del círculo.
# calcular_perimetro_circulo(radio) que reciba el radio como parámetro y devuelva el perímetro del círculo.
# Solicitar el radio al usuario y llamar ambas funciones para mostrar los resultados.

"""
def calcular_area_circulo(radio):
    PI = math.pi
    area = PI * (radio ** 2)
    return area

def calcular_perimetro_circulo(radio):
    PI = math.pi
    perimetro = 2 * PI * radio
    return perimetro

radio_usuario = float(input("Por favor, introduce el valor del radio del círculo: "))

area = calcular_area_circulo(radio_usuario)
perimetro = calcular_perimetro_circulo(radio_usuario)

print(f'El área del círculo es {area:.2f} y el perímetro es {perimetro:.2f}')
"""

# 5. Crear una función llamada segundos_a_horas(segundos) que reciba
# una cantidad de segundos como parámetro y devuelva la cantidad
# de horas correspondientes. Solicitar al usuario los segundos y mostrar el resultado usando esta función.

"""
def segundos_a_horas(segundos):
    horas = segundos/3600
    return horas

segundos = int(input('Ingresa la cantidad de segundos a transformar en horas: '))

print(f'{segundos} segundos corresponden a {segundos_a_horas(segundos):.2f} horas.')
"""

# 6. Crear una función llamada tabla_multiplicar(numero) que reciba un
# número como parámetro y imprima la tabla de multiplicar de ese
# número del 1 al 10. Pedir al usuario el número y llamar a la función.

"""
def tabla_multiplicar(numero):
    for i in range(0, 11):
        print(f'{numero} * {i} = {numero*i}')

numero = int(input('Ingresa un numero para ver su tabla de multiplicar: '))

tabla_multiplicar(numero)
"""

# 7. Crear una función llamada operaciones_basicas(a, b) que reciba dos números como parámetros y devuelva
# una tupla con el resultado de sumarlos, restarlos, multiplicarlos y dividirlos.
# Mostrar los resultados de forma clara.

"""
def operaciones_basicas(a, b):
    suma = a + b
    resta = a - b
    multiplicacion = a * b
    division = a / b if b != 0 else 'No se puede dividir por 0'
    return (f'{a} + {b} = {suma}', f'{a} - {b} = {resta}', f'{a} * {b} = {multiplicacion}', f'{a} / {b} = {division:.2f}')
print('=== Operaciones básicas ===')
numero1 = int(input('Ingresa el primer número: '))
numero2 = int(input('Ingresa el segundo número: '))

resultados = operaciones_basicas(numero1, numero2)

for operacion in resultados:
    print(operacion)
"""

# 8. Crear una función llamada calcular_imc(peso, altura) que reciba el
# peso en kilogramos y la altura en metros, y devuelva el índice de
# masa corporal (IMC). Solicitar al usuario los datos y llamar a la función para mostrar el resultado con dos decimales.

"""
def calcular_imc(peso, altura):
    imc = peso/altura**2
    return imc

peso = float(input('Ingresa tu peso en kg: '))
altura = float(input('Ingresa tu estatura en metros, si usas decimales usa un . : '))

print(f'El IMC es: {calcular_imc(peso, altura):.2f}')
"""

# 9. Crear una función llamada celsius_a_fahrenheit(celsius) que reciba
# una temperatura en grados Celsius y devuelva su equivalente en
# Fahrenheit. Pedir al usuario la temperatura en Celsius y mostrar el
# resultado usando la función.

"""
def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32

    return fahrenheit

celsius = float(input('Ingresa los grados celsius a convertir en fahrenheit: ').strip())

print(f'{celsius} grados celsius son equivalentes a {celsius_a_fahrenheit(celsius):.2f} grados fahrenheit')
"""

# 10.Crear una función llamada calcular_promedio(a, b, c) que reciba
# tres números como parámetros y devuelva el promedio de ellos.
# Solicitar los números al usuario y mostrar el resultado usando esta
# función.

"""
def calcular_promedio(a, b, c):
    promedio = (a + b + c) / 3
    return promedio
print('=== Calcular promedio de 3 numeros ===\n')
num1 = int(input('Ingresa el primer numero: '))
num2 = int(input('Ingresa el segundo numero: '))
num3 = int(input('Ingresa el tercer numero: '))

print(f'\nel promedio de {num1}, {num2} y {num3} es: {calcular_promedio(num1, num2, num3):.2f}\n')
"""
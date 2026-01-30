from statistics import mode, median, mean
import random

"""
# 1
edad = int(input("Ingresa tu edad: "))

if edad > 18:
    print("Eres mayor de edad")
"""

"""
# 2
nota = float(input("Ingresa tu note: "))

if nota >= 6:
    print("Aprobado")
else:
    print("Desaprobado")
"""


"""
# 3
numero = int(input("Ingresa un número: "))

if numero % 2 == 0:
    print("Ha ingresado un número par")
else:
    print("Por favor, ingrese un número par")
"""


"""
# 4
edad = int(input("Ingresa tu edad: "))

if edad < 12:
    print("Niñ@")
elif edad >= 12 and edad < 18:
    print("Adolescente")
elif edad >= 18 and edad < 30:
    print("Adult@ joven")
else:
    print("Adult@")
"""

"""
# 5
password = len(input("Ingresa una contraseña entre 8 y 14 caracteres: "))

if password >= 8 and password <= 14:
    print("Ha ingresado una contraseña correcta")
else:
    print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres")
"""

"""
# 6
numeros_aleatorios = [random.randint(1, 100) for i in range(50)]
moda = mode(numeros_aleatorios)
mediana = median(numeros_aleatorios)
media = mean(numeros_aleatorios)

if media > mediana and mediana > moda:
    print("Sesgo positivo")
elif media < mediana and mediana < moda:
    print("Sesgo negativo")
else:
    print("Sin sesgo")
"""

"""
# 8
nombre = input("Ingresa tu nombre: ")
print("Ingresa 1 para tu nombre en MAYUSCULAS, ej: PEPE PEPIN")
print("Ingresa 2 para tu nombre en minúsculas, ej: pepe pepin")
print("Ingresa 3 para tu nombre con la primera letra en mayúscula, ej: Pepe pepin")
numero = int(input("Ingresa tu opción: "))

if numero == 1:
    print(nombre.upper())
elif numero == 2:
    print(nombre.lower())
else:
    print((nombre.lower()).title())
"""

"""
#9
magnitud_terremoto = float(input("¿De cuánto es la magnitud del terremoto?\nIngresa la magnitud: ").replace(",","."))

if magnitud_terremoto < 3:
    print("Muy leve (imperceptible)")
elif magnitud_terremoto >= 3 and magnitud_terremoto < 4:
    print("Leve (ligeramente perceptible)")
elif magnitud_terremoto >= 4 and magnitud_terremoto < 5:
    print("Moderado (sentido por personas, pero generalmente no causa daños)")
elif magnitud_terremoto >= 5 and magnitud_terremoto < 6:
    print("Fuerte (puede causar daños en estructuras débiles)")
elif magnitud_terremoto >= 6 and magnitud_terremoto < 7:
    print("Muy Fuerte (puede causar daños significativos)")
else:
    print("Extremo (puede causar graves daños a gran escala)")
"""

"""
# 10
hemisferio = (input("¿En cuál hemisferio estás?\nN para norte y S para sur: ")).lower()
mes = int(input("Ingresa el mes actual en formato MM, ej: 03 (Para Marzo): "))
dia = int(input("Ingresa el día del mes: "))

if (mes == 12 and dia >= 21) or (mes == 1) or (mes == 2) or (mes == 3 and dia <= 20):
    if hemisferio == 'n':
        print("estás en invierno")
    else:
        print("estás en verano")
elif (mes == 3 and dia >= 21) or (mes == 4) or (mes == 5) or (mes == 6 and dia <= 20):
    if hemisferio == 'n':
        print("estás en primavera")
    else:
        print("estás en otoño")
elif (mes == 6 and dia >= 21) or (mes == 7) or (mes == 8) or (mes == 9 and dia <= 20):
    if hemisferio == 'n':
        print("estás en verano")
    else:
        print("estás en invierno")
elif (mes == 9 and dia >= 21) or (mes == 10) or (mes == 11) or (mes == 12 and dia <= 20):
    if hemisferio == 'n':
        print("estás en otoño")
    else:
        print("estás en primavera")
else:
    print('La fecha ingresada no es válida')
"""
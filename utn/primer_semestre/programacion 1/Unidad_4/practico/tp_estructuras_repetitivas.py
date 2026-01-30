import random

#1) Crea un programa que imprima en pantalla todos los números enteros desde 0 hasta 100
#(incluyendo ambos extremos), en orden creciente, mostrando un número por línea
"""
for i in range(0, 101):
    print(i)
"""

# 2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de
# dígitos que contiene.
"""
numero_entero = input('Ingresa un número entero: ')
cantidad = 0
for i in range(len(numero_entero)):
    cantidad += 1
    texto = 'dígito' if cantidad == 1 or cantidad > 0 else 'dígitos'
    if cantidad == len(numero_entero):
        print(f'El número contiene {cantidad} {texto}')
"""

# 3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores
# dados por el usuario, excluyendo esos dos valores.
"""
suma = 0
numero1 = int(input('Ingresa el primer número: '))
numero2 = int(input('Ingresa el segundo número numero: '))

for i in range(numero1+1, numero2):
    suma = suma + i
print(f'la suma de los numeros comprendidos entre {numero1} y {numero2} (excluyendo dichos números) es: {suma}')
"""

# 4) Elabora un programa que permita al usuario ingresar números enteros y los sume en
# secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese
# un 0.
"""
suma = 0
es_cero = False
while not es_cero:
    numero = int(input('ingresa un número entero: '))
    suma += numero

    if numero == 0:
        es_cero = True
print(f'La suma acumulada de los números es: {suma}')
"""

# 5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el
# programa debe mostrar cuántos intentos fueron necesarios para acertar el número
"""
intentos = 1
adivina = False

while not adivina:
    numero_random = random.randint(0, 9)
    numero_usuario = int(input('adivina el número que la máquina escogió!: '))

    if numero_random == numero_usuario:
        print(f'\nAdivinaste!🤓 el número era {numero_random}')
        adivina = True
    elif numero_random != numero_usuario:
        print(f'Ups, no acertaste😵')
        intentos += 1
texto = f'al intento {intentos}' if intentos == 1 or intentos > 0 else f'los {intentos} intentos'
print(f'Lo lograste {texto}\n')
"""

# 6) Desarrolla un programa que imprima en pantalla todos los números pares comprendidos
# entre 0 y 100, en orden decreciente.
"""
for i in range(100, -1, -2):
    if i%2 == 0:
        print(i)
"""

# 7) Crea un programa que calcule la suma de todos los números comprendidos entre 0 y un
# número entero positivo indicado por el usuario.

"""
numero = int(input('\nIngresa un número: '))
suma = 0

for i in range(numero+1):
    suma += i
print(f'Total: {suma}\n')
"""

# 8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
# programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son
# negativos y cuántos son positivos. (Nota: para probar el programa puedes usar una cantidad
# menor, pero debe estar preparado para procesar 100 números con un solo cambio).
"""
cantidad_numeros = 6
pares = 0
impares = 0
negativos = 0
positivos = 0

for i in range(1, cantidad_numeros+1):
    numero = int(input('\nIngresa un número: '))
    if numero%2 == 0 and numero > 0:
        pares += 1
        positivos += 1
    elif numero%2 == 0 and numero < 0:
        pares += 1
        negativos += 1
    elif numero%2 != 0 and numero > 0:
        impares += 1
        positivos += 1
    elif numero%2 != 0 and numero < 0:
        impares += 1
        negativos += 1
print(f'\nNumeros pares: {pares}\nNúmeros impares: {impares}\nNúmeros positivos: {positivos}\nNúmeros negativos: {negativos}')
"""

# 9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la
# media de esos valores. (Nota: puedes probar el programa con una cantidad menor, pero debe
# poder procesar 100 números cambiando solo un valor).

"""
cantidad_numeros = 10
suma = 0

for i in range(1, cantidad_numeros+1):
    numero = int(input('\nIngresa un número: '))
    suma += numero
media = suma/cantidad_numeros
print(f'\nLa media de los números ingresados es: {media}')
"""

# 10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el
# usuario. Ejemplo: si el usuario ingresa 547, el programa debe mostrar 745.

numero = int(input('\nIngresa un número: '))
invertido = 0
valor = 0

while numero > 0:
    digito = numero%10
    invertido = (invertido * 10) + digito
    numero = numero // 10
print(invertido)
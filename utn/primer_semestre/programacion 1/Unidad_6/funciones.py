import random

def obtener_animal(animal):
    return random.choice(animal).upper()

def formatear_palabra(palabra):
    formateo = []
    for letra in palabra:
        formateo.append('_')
    return formateo

def comparar_letra(letra_ingresada, palabra, palabra_oculta, num_intentos, intentos_prev):
    acierto = False
    for i, letra in enumerate(palabra):
        if letra.upper() == letra_ingresada.upper():
            palabra_oculta[i] = letra_ingresada.upper()
            acierto = True
    print('=== Tu avance ===')
    print('Palabra: ',''.join(palabra_oculta))
    if acierto:
        print('\nHas encontrado una letra!')
        print('Letras ingresadas: ',' - '.join(intentos_prev))
    else:
        if letra_ingresada.upper() not in intentos_prev:
            intentos_prev.append(letra_ingresada.upper())
        num_intentos -= 1
        print('Letras ingresadas: ',' - '.join(intentos_prev))
        print(f'\nUps! Intenta nuevamente...\nTe quedan {num_intentos} intentos')
    return num_intentos

animales = ['perro', 'gato', 'raton', 'leon', 'elefante', 'jirafa', 'tigre', 'caballo', 'pulpo', 'tortuga', 'panda', 'canguro', 'capibara']
animal = obtener_animal(animales)
formateado = formatear_palabra(animal)
letras_ingresadas = []
juego_terminado = False
intentos = 6

print('=== Descubre el animal ===')
while not juego_terminado:
    ingresar_letra = input('Ingresa una letra y prueba suerte!: ')
    intentos = comparar_letra(ingresar_letra, animal, formateado, intentos, letras_ingresadas)

    if "_" not in formateado:
        print(f'\nHas encontrado el animal! El animal era {animal}')
        juego_terminado = True
    elif intentos == 0:
        print(f'\nTe quedaste sin intentos, el animal era {animal}')
        juego_terminado = True


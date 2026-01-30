import random

"""
corrimiento = int(input('Ingresa el corrimiento: '))
alfabeto = ['A', 'B', 'C', 'D', 'E', 'F','G', 'H', 'Y', 'J', 'K', 'L', 'M', 'N','Ñ', 'O', 'P', 'Q', 'R','S','T', 'U','V','W', 'X', 'Y', 'Z']

for i in range(1,6):
    palabra = input('Ingresa el mensaje: ').upper()
    nueva_palabra = ""

    for letra in palabra:
        total_lista = len(alfabeto)
        if letra in alfabeto:
            indice = alfabeto.index(letra)
            nva_letra = alfabeto[(indice+corrimiento)%total_lista]
            nueva_palabra += nva_letra
        else:
            nueva_palabra += letra

    print(nueva_palabra.lower())
    """

usuario = 0
maquina = 0
empate = 0
salir = False
opciones = ['piedra', 'papel', 'tijera']

while salir == False:
    eleccion_usuario = input('escribe tu tirada: piedra/papel/tijera: ').strip().lower()
    eleccion_maquina = random.choice(opciones)

    while eleccion_usuario not in opciones:
        eleccion_usuario = input('Opcion inválida, ingresa piedra/papel/tijera: ')

    if eleccion_usuario == 'piedra' and eleccion_maquina == 'tijera':
        usuario += 1
    elif eleccion_usuario == 'tijera' and eleccion_maquina == 'papel':
        usuario += 1
    elif eleccion_usuario == 'papel' and eleccion_maquina == 'piedra':
        usuario += 1
    elif eleccion_maquina == eleccion_usuario:
        empate += 1
    else:
        maquina += 1

    print(f'Usuario: {eleccion_usuario} | Máquina: {eleccion_maquina}')
    
    sigue = ''

    while sigue not in ['n', 's']:
        sigue = input('¿Deseas salir: S/N? - ').lower()
        if sigue == 's':
            salir = True
    

print(f'Usuario: {usuario} | Máquina: {maquina} | Empates: {empate}')

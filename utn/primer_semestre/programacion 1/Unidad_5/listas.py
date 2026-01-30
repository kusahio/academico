import random

numeros = random.sample(range(1, 51), 25)
carton = [numeros[i:i+5] for i in range(0, 25, 5)]

filas_completas = []
juego_activo = True

print('\nTu cartón inicial:\n')
for fila in carton:
    print(fila)

while juego_activo:
    bingo = random.randint(1, 50)
    encontrado = False
    fila_actual = 0

    for fila in carton:
        if bingo in fila:
            index = fila.index(bingo)
            fila[index] = 0
            print(f'\nSe sortea el número... {bingo} -> Lo tienes.')
            encontrado = True

            if sum(fila) == 0 and fila_actual not in filas_completas:
                print(f'\n¡Has completado la fila {fila_actual + 1}!')
                filas_completas.append(fila_actual)
            break

        fila_actual += 1

    if not encontrado:
        print(f'\nSe sortea el número... {bingo} -> No lo tienes.')

    print('\nTu cartón actualizado:\n')
    for fila in carton:
        print(fila)

    if all(num == 0 for fila in carton for num in fila):
        print('\n¡Cartón completo!\n¡Has ganado el bingo!')
        break

    while True:
        respuesta = input('\n¿Sortear otro número? (S/N): ').lower()
        if respuesta in ['s', 'n']:
            juego_activo = respuesta == 's'
            break
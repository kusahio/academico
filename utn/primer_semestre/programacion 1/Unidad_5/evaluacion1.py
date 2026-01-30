titulos = []
ejemplares = []

agregar_mas = True
salir = False

while not salir:
    opciones = int(input('\nOpciones:\n1- Agregar Título\n2- Agregar Cantidad de Ejemplares\n3- Mostrar Catálogo\n4- Consultar disponibilidad\n5- Listar Agotados\n6- Agregar título\n7- Titulos no Disponibles\n8- Actualizar ejemplares (préstamo/devolución)\n9- Ver Catálogo\n10- Salir\nElige una opción: \n'))

    if opciones == 1:
        cantidad_agregar = int(input('¿Cuántos libros quieres agregar?: \n'))
        for i in range(cantidad_agregar):
            ejemplar = input('Ingresa el Título: \n').lower()
            titulos.append(ejemplar)
    elif opciones == 2:
        for titulo in titulos:
            stock = int(input(f'Cantidad de ejemplares para {titulo}: '))
            ejemplares.append(stock)
    elif opciones == 3:
        print('Catálogo:\n')
        for titulo in titulos:
            index = titulos.index(titulo)
            texto = 'ejemplar' if ejemplares[index] == 1 else 'ejemplares'
            print(f'{titulo.capitalize()}: {ejemplares[index]} {texto}')
    elif opciones == 4:
        consulta = input('Ingresa el titulo a consultar: ').lower()
        if consulta in titulos:
            index = titulos.index(consulta)
            texto = 'copia disponible' if ejemplares[index] == 1 else 'copias disponibles'
            print(f'\n{ejemplares[index]} {texto} para {titulos[index].capitalize()}\n')
    elif opciones == 5:
        for stock in ejemplares:
            index = ejemplares.index(stock)
            if stock == 0:
                print(f'{titulos[index]}: no tiene ejemplares disponibles')
            elif index == len(ejemplares)-1:
                print('\nTodos los títulos están disponibles\n')
    elif opciones == 6:
        nuevo_titulo = input('Ingresa el nuevo título: ').lower()
        stock = int(input('Ingresa la cantidad de ejemplares: '))
        titulos.append(nuevo_titulo)
        ejemplares.append(stock)
    elif opciones == 7:
        for stock in ejemplares:
            index = ejemplares.index(stock)
            if stock == 0:
                print(f'{titulos[index]}: no tiene ejemplares disponibles')
            if index == len(ejemplares)-1:
                print('\nTodos los títulos están disponibles\n')
    elif opciones == 8:
        actualiza = int(input('Préstamo = 1 | Devolución = 2: '))
        if actualiza == 1:
            libro = input('Ingresa el libro que quieres pedir: ').strip()
            index = titulos.index(libro)
            if ejemplares[index] == 0:
                print('No hay copias para prestar\n')
            else:
                ejemplares[index] = ejemplares[index] - 1
                print(f'Stock de {titulos[index]} actualizado: {ejemplares[index]}')
        elif actualiza == 2:
            libro = input('Ingresa el libro que quieres devolver: ').strip()
            index = titulos.index(libro)
            ejemplares[index] = ejemplares[index] + 1
    elif opciones == 9:
        for titulo in titulos:
            print(f'\n{titulo}')
    elif opciones == 10:
        salir = True

    
"""
print('Ingresa los Títulos\n')
while agregar_mas:
    introducir_titulo = input('Ingresa el título del libro: ').strip()
    cantidad_ejemplares = int(input('Ingresa la cantidad de ejemplares: '))
    titulos.append(introducir_titulo)
    ejemplares.append(cantidad_ejemplares)

    while True:
        pregunta = input('¿Agregar más libros? S/N: ').lower().strip()
        if pregunta in ['s', 'n']:
            agregar_mas = pregunta == 's'
            break
"""
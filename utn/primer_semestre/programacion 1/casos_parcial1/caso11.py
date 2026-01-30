opciones = ['Ingresar orden', 'Ingresar horas estimadas', 'Mostrar agenda', 'Consultar horas por orden', 'Listar órdenes con 0 horas', 'Agregar orden', 'Ver sin estimación (0)', 'Actualizar horas', 'Salir']
ordenes = []
tiempo_estimado = []
salir = False

while not salir:
    print('\n==== Menú Taller ====')
    print('Ingresa el número de opción\n')
    for i, opcion in enumerate(opciones):
        print(f'{i+1}- {opcion.capitalize()}')
    ingresa_opcion = int(input('\nIngresa el número de opción: '))

    opcion_valida = True if ingresa_opcion in range(1,10) else False

    if opcion_valida:
        match ingresa_opcion:
            case 1:
                print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                agregar_mas = True
                while agregar_mas:
                    orden = input('Ingresa el número de orden (ej: ORD-000): ').strip().upper()
                    ordenes.append(orden)
                    pregunta = input('¿Desea agregar otra orden? S/N: ').strip().lower()

                    if pregunta == 'n':
                        agregar_mas = False
            case 2:
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                    for orden in ordenes:
                        estimado = abs(float(input(f'Ingresa el tiempo estimado para la orden {orden} (ej: 2.5): ').strip()))
                        tiempo_estimado.append(estimado)
                else:
                    print('\n=== Aviso ===\nNo existen órdenes')
            case 3:
                print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    if len(tiempo_estimado) == 0:
                        print('\n=== Aviso ===\nDebes agregar tiempos estimados a las ordenes')
                    for i, orden in enumerate(ordenes):
                        print(f'Orden n° {orden}: Tiempo estimado - {tiempo_estimado[i]} hrs')
                else:
                    print('\n=== Aviso ===\nNo existen órdenes ni tiempos estimados')
            case 4:
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                    consulta = input('\nIngresa el n° de orden: ').strip().upper()
                    if consulta in ordenes:
                        idx = ordenes.index(consulta)
                        print(f'Orden n° {consulta}: Tiempo estimado - {tiempo_estimado[idx]}')
                    else:
                        print('\n=== Aviso ===\nEl número de orden no se encuentra en la lista')
                else:
                    print('\n=== Aviso ===\nNo existen órdenes ni tiempos estimados')
            case 5:
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                    print(f'\nOrdenes pendientes de diagnóstico:\n')
                    for i, orden in enumerate(ordenes):
                        if tiempo_estimado[i] == 0:
                            print(f'Orden n° {orden}: Tiempo estimado - {tiempo_estimado[i]} hrs')
                else:
                    print('\n=== Aviso ===\nNo existen órdenes ni tiempos estimados')
            case 6:
                print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                agregar_mas = True
                if len(ordenes) != len(tiempo_estimado):
                    print('Primero debes verificar las opciones 1 o 2')
                else:
                    while agregar_mas:
                        orden = input('\nAgregar orden | Formato requerido ej: ORD-numero: ').strip().upper()
                        estimado = abs(float(input('\nAgrega el tiempo estimado para la orden(ej: 2.5): ')))
                        if orden in ordenes:
                            print('\nLa orden ya existe')
                        else:
                            ordenes.append(orden)
                            tiempo_estimado.append(estimado)

                            pregunta = input('¿Desea agregar otra orden? S/N: ').strip().lower()

                            if pregunta == 'n':
                                agregar_mas = False
            case 7:
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                    for i, orden in enumerate(ordenes):
                        if tiempo_estimado[i] == 0:
                            print(f'Orden n° {orden}: tiempo estimado - {tiempo_estimado[i]} hrs')
                else:
                    print('\n=== Aviso ===\nNo existen órdenes ni tiempos estimados')
            case 8:
                existe_orden = True if len(ordenes) > 0 else False
                if existe_orden:
                    print(f'Has elegido {opciones[ingresa_opcion-1]}\n')
                    orden = input('\nIngresa el número de orden: ').strip().upper()
                    if orden in ordenes:
                        idx = ordenes.index(orden)
                        nuevo_estimado = abs(float(input(f'Ingresa el nuevo tiempo estimado para la orden orden: ')))
                        tiempo_estimado[idx] = nuevo_estimado
                    else:
                        print('\nLa orden no existe en la lista')
                else:
                    print('\n=== Aviso ===\nNo existen órdenes ni tiempos estimados')
            case 9:
                print('\nHas salido del programa\n')
                salir = True
            case _:
                print('Opción no válida')
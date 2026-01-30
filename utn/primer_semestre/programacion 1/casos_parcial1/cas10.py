habitaciones = []
ocupadas = []
salir = False

while not salir:
    print('\n==== Habitaciones de Hotel ====')
    print('1. Ingresar números de habitación')
    print('2. Ingresar disponibilidad')
    print('3. Disponibilidad de habitaciones')
    print('4. Consultar habitación')
    print('5. Listar ocupadas o libres')
    print('6. Agregar nueva habitación')
    print('7. Mostrar habitaciones disponibles')
    print('8. Cambiar estado de habitación')
    print('9. Ver todas las habitaciones')
    print('10. Salir\n')
    
    opcion = int(input('Elige una opcion: ').strip().lower())

    match opcion:
        case 1:
            ingresar_mas = True

            while ingresar_mas:
                habitacion = input('Ingresa una habitación: ')
                if habitacion.isdigit():
                    habitaciones.append(habitacion)
                respuesta = input('\nDesea agregar otra habitacion?: S/N: ').strip().lower()
                if respuesta == 'n':
                    ingresar_mas = False
        
        case 2:
            if len(habitaciones) == 0:
                print('\n=== Aviso ===\nNo existen habitaciones')
            else:
                for habitacion in habitaciones:
                    disponibilidad = int(input(f'Ingresa la disponibilidad para la habitación {habitacion}: '))
                    ocupadas.append(disponibilidad)

        case 3:
            if len(habitaciones) == 0 or len(ocupadas) == 0:
                print('\n=== Aviso ===\nNo existen habitaciones')
            else:
                for i, habitacion in enumerate(habitaciones):
                    disponible = 'disponible' if ocupadas[i] == 0 else 'ocupada'
                    print(f'Habitacion {habitacion}: {disponible}')
        
        case 4:
            if len(habitaciones) == 0 or len(ocupadas) == 0:
                print('\n=== Aviso ===\nNo existen Habitaciones o debes agregar disponibilidad')
            else:
                habitacion = input('Ingresa la habitación para consultar disponibilidad: ')
                if habitacion.isdigit() and habitacion in habitaciones:
                    idx = habitaciones.index(habitacion)
                    ocupada = 'ocupada' if ocupadas[idx] == 1 else 'disponible'
                    print(f'La habitación {habitacion} está {ocupada}')
        case 5:
            seguir = True
            revisar = True if len(habitaciones) > 0 and len(ocupadas) > 0 else False
            if revisar:
                while seguir:
                    consulta =  int(input('consultar: \n1 = disponibles\n2 = ocupadas: '))
                    if consulta == 1:
                        for i, habitacion in enumerate(habitaciones):
                            if ocupadas[i] == 1:
                                print(f'La Habitacion {habitacion} está ocupada')
                            
                    elif consulta == 2:
                        for i, habitacion in enumerate(habitaciones):
                            if ocupadas[i] == 0:
                                print(f'La Habitacion {habitacion} está disponible')
                    
                    else:
                        print('\nLa opción ingresada no es válida')

                    respuesta = input('\nDeseas consultar nuevamente? S/N: ').strip().lower()
                    if respuesta == 'n': 
                        seguir = False
            else:
                print('\n=== Aviso ===\nDebes ingresar habitaciones primero')
        case 6:
            agregar_mas = True
            while agregar_mas:
                habitacion = input('\nIngresa la nueva habitacion: ').strip()
                habitaciones.append(habitacion)
                ocupadas.append(0)
                
                pregunta = input('\n¿Desea agregar más habitaciones? S/N: ').strip().lower()

                if pregunta == 'n':
                    agregar_mas = False
        case 7:
            existen_habitaciones = False if len(habitaciones) == 0 or len(ocupadas) == 0 else True

            if not existen_habitaciones:
                print('\n=== Aviso ===\nDebes hagregar habitaciones o configurar su disponibilidad antes')
            else:
                for i, libre in enumerate(ocupadas):
                    if libre == 0:
                        print(f'Habitación {habitaciones[i]}: Libre')
        case 8:
            existen_habitaciones = False if len(habitaciones) == 0 or len(ocupadas) == 0 else True
            if not existen_habitaciones:
                print('\n=== Aviso ===\nDebes hagregar habitaciones o configurar su disponibilidad antes')
            else:
                habitacion = input('Ingresa el número de habitación para cambiar su estado: ').strip().lower()
                if habitacion in habitaciones:
                    idx = habitaciones.index(habitacion)
                    estado = f'Habitación {habitacion}: {'ocupada' if ocupadas[idx] == 1 else 'disponible'}'
                    print(estado)
                    cambio_estado = int(input('Ingresa 0 para disponible | Ingresa 1 para ocupada: '))
                    ocupadas[idx] = cambio_estado
                    print(f'La habitacion {habitacion} ahora está {'ocupada' if cambio_estado == 1 else 'disponible'}')
        case 9:
            existen_habitaciones = False if len(habitaciones) == 0 or len(ocupadas) == 0 else True
            if not existen_habitaciones:
                print('\n=== Aviso ===\nDebes hagregar habitaciones o configurar su disponibilidad antes')
            for i, habitacion in enumerate(habitaciones):
                estado = 'disponible' if ocupadas[i] == 0 else 'ocupada'
                print(f'Habitacion {habitacion}: {estado}')
        case 10:
            salir = True

print(habitaciones, ocupadas)
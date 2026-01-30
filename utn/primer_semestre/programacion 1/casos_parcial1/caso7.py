alumnos = []
asistencias = []
opciones = ['Ingresar Estudiantes', 'Mostrar asistencias', 'Consultar asistencias por estudiante', 'Listar estudiantes sin asistencias', 'Agregar estudiante', 'Marcar asistencia de un estudiante', 'Ver todos', 'Salir']
salir = False

while not salir:
    print('\n==== Menú de asistencias ====')
    for opcion in opciones:
        index = opciones.index(opcion)
        print(f'{index+1}: {opcion}')

    opcion_menu = int(input('\nIngresa una opción: ').strip())
    print('')

    if opcion_menu == 1:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        ingresar = True
        while ingresar:
            alumno = input('Ingresa el nombre del alumno: ').title()
            asistencia = 0
            if alumno == "" or alumno.strip() == "" or any(num.isdigit() for num in alumno):
                print('El campo no puede estar vacío ni tener números')
                continue
            alumnos.append(alumno)
            asistencias.append(asistencia)

            while True:
                respuesta = input('\nDeseas agregar otro estudiante? S/N: ').lower()
                if respuesta in ['n', 's']:
                    ingresar = respuesta == 's'
                    break
                print('\nObservación: Debes ingresar una opción válida')

    elif opcion_menu == 2:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        existen_alumnos = True if len(alumnos) > 0 else False
        if not existen_alumnos:
            print('\nNo existen alumnos para consultar asistencias. Debes primero ingresar al menos uno.')
        for i, alumno in enumerate(alumnos):
            texto = f'{asistencias[i]} asistencias' if asistencias[i] > 1 else f'{asistencias[i]} asistencia'
            print(f'{alumno}: {texto}')

    elif opcion_menu == 3:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        alumno = input('\nIngresa el nombre del alumno: ').strip().title()
        if alumno.title() in alumnos:
            idx = alumnos.index(alumno)
            texto = f'{asistencias[idx]} asistencias' if asistencias[i] > 1 else f'{asistencias[idx]} asistencia'
            print(f'{alumno}: {texto}')
            continue
        print('\nEl alumno no está en el curso o has ingresado mal el nombre')
    elif opcion_menu == 4:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        for i, asistencia in enumerate(asistencias):
            if asistencia == 0:
                print(f'{alumnos[i]}: {asistencia}')
                continue
    elif opcion_menu == 5:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        ingresar = True
        while ingresar:
            alumno = input('Ingresa el nombre del alumno: ').strip().title()
            if alumno == "" or alumno == " " or any(num.isdigit() for num in alumno):
                print('El campo no puede estar vacío ni tener números')
                continue
            alumnos.append(alumno)
            asistencias.append(0)
            respuesta = input('\nDeseas agregar otro estudiante? S/N: \n').lower()
            if respuesta == 'n':
                ingresar = False
    elif opcion_menu == 6:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        alumno = input('Ingresa el nombre del estudiante para agregar asistencia: ').strip().title()
        if alumno in alumnos:
            idx = alumnos.index(alumno)
            asistencia = int(input('Ingresa la asistencia: ').strip())
            asistencias[idx] = asistencias[idx] + asistencia
            print(f'has agregado una asistencia al alumno {alumno}')
            print(f'{alumno}: {asistencias[idx]} asistencias')
            continue
        print('\nEl alumno no existe en el curso o ingresaste mal el nombre')
    elif opcion_menu == 7:
        print(f'\nSeleccionaste: {opciones[opcion_menu-1]}')
        for i, alumno in enumerate(alumnos):
            print(f'alumno: {asistencias[i]} asistencias')
    elif opcion_menu == 8:
        salir = True
            
print('Saliste del programa.')
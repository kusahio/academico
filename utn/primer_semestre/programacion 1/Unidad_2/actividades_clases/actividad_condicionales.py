dias_semana = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes']
fecha = input('Ingresa la fecha actual en formato: ej: lunes, 03(día)/12(mes): ')
dia = fecha.split(",")[0].lower().strip()
DD = int(fecha.split(",")[1].split("/")[0].strip())
MM = int(fecha.split(",")[1].split("/")[1].strip())

if dia in dias_semana and (DD >= 1 and DD <= 31) and (MM >= 1 and MM <= 12):
    if dia == dias_semana[0]:
        print('Clases nivel principiante')
        print('¿Se tomaron exámenes?')
        examen = input('S/N (S para si y N para no): ').lower()

        if examen == 's':
            aprobados = int(input('Ingresa la cantidad de alumnos aprobados: '))
            reprobados = int(input('Ingresa la cantidad de alumnos reprobados: '))
            total_alumnos = aprobados + reprobados
            print(f'El porcentaje el alumnos que aprobaron fue {((aprobados/total_alumnos)*100):.2f}%')
            print(f'El porcentaje el alumnos que reprobaron fue {((reprobados/total_alumnos)*100):.2f}%')

    elif dia == dias_semana[1]:
        print('Clases nivel intermedio')
        print('¿Se tomaron exámenes?')
        examen = input('S/N (S para si y N para no): ').lower()

        if examen == 's':
            aprobados = int(input('Ingresa la cantidad de alumnos aprobados: '))
            reprobados = int(input('Ingresa la cantidad de alumnos reprobados: '))
            total_alumnos = aprobados + reprobados
            print(f'El porcentaje el alumnos que aprobaron fue {((aprobados/total_alumnos)*100):.2f}%')
            print(f'El porcentaje el alumnos que reprobaron fue {((reprobados/total_alumnos)*100):.2f}%')

    elif dia == dias_semana[2]:
        print('Clases nivel avanzado')
        print('¿Se tomaron exámenes?')
        examen = input('S/N (S para si y N para no): ').lower()

        if examen == 's':
            aprobados = int(input('Ingresa la cantidad de alumnos aprobados: '))
            reprobados = int(input('Ingresa la cantidad de alumnos reprobados: '))
            total_alumnos = aprobados + reprobados
            print(f'El porcentaje el alumnos que aprobaron fue {((aprobados/total_alumnos)*100):.2f}%')
            print(f'El porcentaje el alumnos que reprobaron fue {((reprobados/total_alumnos)*100):.2f}%')

    elif dia == dias_semana[3]:
        print('práctica hablada')
        asistencia = float(input('Ingresa el porcentaje de asistencia: '))

        if asistencia > 50:
            print('Asistió la mayoría')
        else:
            print('No asistió la mayoría')

    elif dia == dias_semana[4]:
        print('inglés para viajeros')
        
        if DD == 1 and (MM == 1 or MM == 7):
            print('Comienzo nuevo ciclo')
            cant_alumnos = int(input('Ingresa la cantidad de alumnos: '))
            arancel = int(input('Ingresa el arancel: '))
            total = cant_alumnos * arancel

            print(f'El ingreso total es de ${total}')
    else:
        pass
else:
    print('Hubo un error con la fecha ingresada')
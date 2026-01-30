
def mochila():
    while True:
        try:
            cantidad = int(input('Ingresa la cantidad de espacios den la mochila: '))
            return cantidad
            break
        except ValueError:
            print("Error: debe ingresar un número válido.")
    
mochila()

# match es_valido:
#     case 1:
#         print('valido')
#     case _:
#         print('Opción no válida')
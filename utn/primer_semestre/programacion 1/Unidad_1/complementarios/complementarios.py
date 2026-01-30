numero1 = 11
numero2 = 0.43
suma = numero1 + numero2
resta = numero1 - numero2
division = numero1 / numero2
multiplicacion = numero1 * numero2
print('-------------------------------')
print(f'suma de {numero1} y {numero2}: {suma}')
print(f'resta de {numero1} y {numero2}: {resta}')
print(f'division de {numero1} y {numero2}: {division:.2f}')
print(f'multiplicación de {numero1} y {numero2}: {multiplicacion:.2f}')
print('-------------------------------')

#----------------------#

nombre = 'Camilo'
print('-------------------------------')
print(f'nombre: {nombre}')
print('-------------------------------')

#----------------------#

precio = 10990
descuento = 0.25
precio_final = precio - (precio * descuento)
print('-------------------------------')
print(f'precio: {precio}')
print(f'precio final con descuento del 25%: {precio_final}')
print('-------------------------------')

#----------------------#

cadena = 'este es un string'
longitud = len(cadena)
print('-------------------------------')
print(f'string: {cadena}')
print(f'longitud de cadena: {longitud}')
print('-------------------------------')

#----------------------#

precio = int(3450.75)
print('-------------------------------')
print(f'precio: {precio}')
print(f'precio transformado a entero: {precio}')
print('-------------------------------')

#----------------------#

nombre = 'Camilo'
apellido = 'Illanes'
nombre_completo = f'{nombre} {apellido}'
print('-------------------------------')
print(f'nombre : {nombre}')
print(f'apellido: {apellido}')
print(f'nombre completo: {nombre_completo}')
print('-------------------------------')

#----------------------#

print('-------------------------------')
edad = 36
print(f'edad: {edad}')
edad = edad + 5
print(f'edad incrementada en 5: {edad}')
edad = edad - 10
print(f'edad disminuida en 10: {edad}')
print('-------------------------------')

#----------------------#

print('-------------------------------')
altura = 1.68
print(f'altura: {altura}mts')
altura = altura * 4
print(f'altura multiplicada por 4: {altura}')
altura = altura / 3
print(f'altura dividida por 3: {altura:.2f}')
print('-------------------------------')

#----------------------#

print('-------------------------------')
nombre_mayuscula = 'CAMILO ILLANES DONOSO'
print(f'nombre en mayúsculas: {nombre_mayuscula}')
nombre_minuscula = nombre_mayuscula.lower()
print(f'nombre en minúsculas: {nombre_minuscula}')
nombre_primera_mayus = f'{(nombre_mayuscula.lower()).capitalize()}'
print(f'nombre con primera letra en mayúscula: {nombre_primera_mayus}')
print('-------------------------------')
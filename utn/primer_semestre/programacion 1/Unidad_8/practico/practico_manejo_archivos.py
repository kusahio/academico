def cargar_productos(nombre_archivo):
    productos = []
    try:
        with open(nombre_archivo, 'r') as archivo:
            for linea in archivo:
                nombre, precio, cantidad = linea.strip().split(',')
                producto = {
                    'nombre': nombre,
                    'precio': float(precio),
                    'cantidad': int(cantidad)
                }
                productos.append(producto)

    except FileNotFoundError:
        print(f"Error: El archivo '{nombre_archivo}' no fue encontrado. Asegúrate de crearlo primero.")
    except Exception as e:
        print(f"Ocurrió un error al leer el archivo: {e}")
    return productos

def mostrar_productos(lista_productos):
    print("\n--- Lista de Productos ---")
    if not lista_productos:
        print("No hay productos para mostrar.")
    else:
        for producto in lista_productos:
            print(f"Producto: {producto['nombre']} | Precio: ${producto['precio']} | Cantidad: {producto['cantidad']}")
    print("------------------------\n")

def agregar_producto(nombre_archivo):
    print("\n--- Agregar Nuevo Producto ---")
    nombre = input("Ingrese el nombre del producto: ")
    
    while True:
        try:
            precio = float(input("Ingrese el precio: "))
            break
        except ValueError:
            print("Error: Ingrese un precio válido (número).")

    while True:
        try:
            cantidad = int(input("Ingrese la cantidad: "))
            break
        except ValueError:
            print("Error: Ingrese una cantidad válida (número entero).")
            
    try:
        with open(nombre_archivo, 'a') as archivo:
            archivo.write(f"\n{nombre.capitalize()},{precio},{cantidad}")
        print("¡Producto agregado exitosamente!")
    except Exception as e:
        print(f"Ocurrió un error al guardar el producto: {e}")

def buscar_producto(lista_productos):
    nombre_buscado = input("Ingrese el nombre del producto que desea buscar: ")
    encontrado = False
    for producto in lista_productos:
        if producto['nombre'].lower() == nombre_buscado.lower():
            print("\n--- Producto Encontrado ---")
            print(f"Nombre: {producto['nombre']}")
            print(f"Precio: ${producto['precio']}")
            print(f"Cantidad: {producto['cantidad']}")
            print("---------------------------\n")
            encontrado = True
            break
    
    if not encontrado:
        print(f"Error: El producto '{nombre_buscado}' no fue encontrado.")

def guardar_productos_actualizados(nombre_archivo, lista_productos):
    try:
        with open(nombre_archivo, 'w') as archivo:
            for i, p in enumerate(lista_productos):
                linea = f"{p['nombre']},{p['precio']},{p['cantidad']}"
                archivo.write(linea)
                if i < len(lista_productos) - 1:
                    archivo.write("\n")
        print("Cambios guardados correctamente en el archivo.")
    except Exception as e:
        print(f"Ocurrió un error al guardar los cambios: {e}")

def main():
    archivo_productos = "productos.txt"
    
    while True:
        lista_de_productos = cargar_productos(archivo_productos)

        print("\n===== GESTIÓN DE PRODUCTOS =====")
        print("1. Mostrar todos los productos")
        print("2. Agregar un nuevo producto")
        print("3. Buscar un producto por nombre")
        print("4. Guardar y Salir")
        
        opcion = input("Seleccione una opción: ")
        opcion_entero = int(opcion) if opcion.isdigit() else 0

        match opcion_entero:
            case 1:
                mostrar_productos(lista_de_productos)
            case 2:
                agregar_producto(archivo_productos)
                lista_de_productos = cargar_productos(archivo_productos)
                print("Lista actualizada:")
                mostrar_productos(lista_de_productos)   
            case 3:
                buscar_producto(lista_de_productos)
            case 4:
                guardar_productos_actualizados(archivo_productos, lista_de_productos)
                print("Saliendo del programa.")
                break
            case _:
                print("\nOpción no válida. Por favor, intente de nuevo.")

main()
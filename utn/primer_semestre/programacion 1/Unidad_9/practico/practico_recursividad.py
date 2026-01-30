# 1 - Crea una función recursiva que calcule el factorial de un número. Luego, utiliza
# esa función para calcular y mostrar en pantalla el factorial de todos los números
# enteros entre 1 y el número que indique el usuario

""" def factorial_recursivo(n):
    if n == 0:
        return 1
    else:
        return n * factorial_recursivo(n - 1)

try:
    numero_limite = int(input("Ingrese un número entero para calcular factoriales: "))
    if numero_limite < 0:
        print("Por favor, ingrese un número no negativo.")
    else:
        print(f"\nFactoriales desde 1 hasta {numero_limite}:")
        for i in range(1, numero_limite + 1):
            resultado = factorial_recursivo(i)
            print(f"El factorial de {i} es: {resultado}")
except ValueError:
    print("Entrada no válida. Por favor, ingrese un número entero.") """

# 2 - Crea una función recursiva que calcule el valor de la serie de Fibonacci en la posición indicada.
# Posteriormente, muestra la serie completa hasta la posición que el usuario especifique.

""" def fibonacci_recursivo(pos):
    if pos == 0:
        return 0
    elif pos == 1:
        return 1
    else:
        return fibonacci_recursivo(pos - 1) + fibonacci_recursivo(pos - 2)

try:
    posicion_limite = int(input("Ingrese una posición para la serie de Fibonacci: "))
    if posicion_limite < 0:
        print("Por favor, ingrese una posición no negativa.")
    else:
        print(f"\nSerie de Fibonacci hasta la posición {posicion_limite}:")
        for i in range(posicion_limite + 1):
            print(fibonacci_recursivo(i), end=" ")
    print()
except ValueError:
    print("Entrada no válida. Por favor, ingrese un número entero.") """

# 3 - Crea una función recursiva que calcule la potencia de un número base elevado a un exponente,
# utilizando la fórmula 𝑛𝑚= 𝑛∗𝑛(𝑚−1). Prueba esta función en un algoritmo general.

""" def potencia_recursiva(base, exponente):
    if exponente == 0:
        return 1
    else:
        return base * potencia_recursiva(base, exponente - 1)
    
base = None
exponente = None

while True:
    base = input("\nIngresa un número base para calcular la potencia: ")
    if not any(digito.isalpha() for digito in base):
        break
    print("\nAVISO: Debes ingresar un digito para el número base\n")
    
while True:
    exponente = input("\nIngresa un número para usar de exponente: ")
    if not any(digito.isalpha() for digito in exponente):
        break    
    print("\nAVISO: Debes ingresar un digito para el exponente\n")

resultado = potencia_recursiva(int(base), int(exponente))
print(f"\nResultado: {base} elevado a {exponente} es: {resultado}") """

# 4 -  Crear una función recursiva en Python que reciba un número entero positivo en base decimal y devuelva su representación en binario como una cadena de texto.
# Cuando representamos un número en binario, lo expresamos usando solamente ceros (0) y unos (1), en base 2. Para convertir un número decimal a binario, se puede seguir este procedimiento:
# 1. Dividir el número por 2.
# 2. Guardar el resto (0 o 1).
# 3. Repetir el proceso con el cociente hasta que llegue a 0.
# 4. Los restos obtenidos, leídos de abajo hacia arriba, forman el número binario.
# Convertir el número 10 a binario:
# 10 ÷ 2 = 5 resto: 0
# 5 ÷ 2 = 2 resto: 1
# 2 ÷ 2 = 1 resto: 0
# 1 ÷ 2 = 0 resto: 1
# Leyendo los restos de abajo hacia arriba: 1 0 1 0 → El resultado binario es "1010".

""" def decimal_a_binario(n):
    if n <= 1:
        return str(n)
    else:
        return decimal_a_binario(n // 2) + str(n % 2)
numero = None

while True:
    numero = input("Ingresa un numero a convertir a binario: ").strip()
    if not any(digito.isalpha() for digito in numero):
        break
    print("Debes ingresar un número")

binario_resultado = decimal_a_binario(int(numero))
print(f"El número {numero} en binario es: {binario_resultado}") """

# 5 - Implementá una función recursiva llamada es_palindromo(palabra) que reciba una cadena de texto sin espacios ni tildes, y devuelva True si es un palíndromo o False si no lo es.
# Requisitos:
# La solución debe ser recursiva.
# No se debe usar [::-1] ni la función reversed().

""" def es_palindromo(palabra):
    palabra = palabra.lower()
    if len(palabra) <= 1:
        return "Si es palíndromo"
    else:
        if palabra[0] == palabra[-1]:
            return es_palindromo(palabra[1:-1])
        else:
            return "No es palíndromo"
palabra = None
while True:
    palabra = input("Ingresa una palabra para saber si es palindromo: ")

    print(f"¿{palabra} es palíndromo? {es_palindromo(palabra.strip().lower())}")

    pregunta = input("Verificar otra palabra? (s/n) : ")

    if pregunta == "n":
        break """

# 6 - Escribí una función recursiva en Python llamada suma_digitos(n) que reciba un número entero positivo y devuelva la suma de todos sus dígitos.
# Restricciones:
# No se puede convertir el número a string.
# Usá operaciones matemáticas (%, //) y recursión.
# Ejemplos:
# suma_digitos(1234) → 10 (1 + 2 + 3 + 4)
# suma_digitos(9) → 9
# suma_digitos(305) → 8 (3 + 0 + 5)

""" def suma_digitos(n):
    if n < 10:
        return n
    else:
        return (n % 10) + suma_digitos(n // 10)

numero = int(input("Ingresa un numero: "))
print(f"La suma de los dígitos de {numero} es: {suma_digitos(numero)}") """

# Un niño está construyendo una pirámide con bloques. En el nivel más bajo coloca n bloques, en el siguiente nivel uno menos (n - 1), y así sucesivamente hasta llegar al último nivel con un solo bloque.
# Escribí una función recursiva contar_bloques(n) que reciba el número de bloques en el nivel más bajo y devuelva el total de bloques que necesita para construir toda la pirámide.
# Ejemplos:
# contar_bloques(1) → 1 (1)
# contar_bloques(2) → 3 (2 + 1)
# contar_bloques(4) → 10 (4 + 3 + 2 + 1)

""" def contar_bloques(n):
    if n == 1:
        return 1
    else:
        return n + contar_bloques(n - 1)

bloques = int(input("Ingresa la cantidad de bloques para la base: "))
print(f"Total de bloques para una piramide con base de 4: {contar_bloques(4)}") """

# 8 - Escribí una función recursiva llamada contar_digito(numero, digito) que reciba un número
# entero positivo (numero) y un dígito (entre 0 y 9), y devuelva cuántas veces aparece ese dígito dentro del número.
# Ejemplos:
# contar_digito(12233421, 2) → 3
# contar_digito(5555, 5) → 4
# contar_digito(123456, 7) → 0

""" def contar_digito(numero, digito):
    if numero == 0:
        return 1 if digito == 0 else 0
    
    if numero < 10:
        return 1 if numero == digito else 0

    if numero % 10 == digito:
        return 1 + contar_digito(numero // 10, digito)
    else:
        return contar_digito(numero // 10, digito)

numero = int(input('Ingresa un número: '))
digito = int(input('Ingresa el dígito a verificar: '))
print(f"El dígito {digito} aparece en {numero}: {contar_digito(numero, digito)} veces.") """
lista_numeros = ["10", "20", "no_soy_un_numero", "30"]

def calcular_promedio(lista : list) -> None:
  numeros_float = []
  for i ,float_num in enumerate(lista):
    try:
      numeros_float.append(float(float_num))    
    except ValueError:
      print(f'el índice {i} "{float_num}" no es un número\n')
      continue
    finally:
      if i == len(lista)-1:
        print('Cálculo finalizado')
  
  if numeros_float:
        promedio = sum(numeros_float) / len(numeros_float)
        print(f'promedio: {promedio}')

calcular_promedio(lista_numeros)
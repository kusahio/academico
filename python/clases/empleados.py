class Empleado:
  def __init__(self, nombre: str, sueldo: float):
    self.nombre = nombre
    self.sueldo = sueldo
  
  def calcular_sueldo(self):
    return self.sueldo

class Programador(Empleado):
  def __init__(self, nombre, sueldo, bono: float):
    super().__init__(nombre, sueldo)
    self.bono = bono

  def calcular_sueldo(self):
    return super().calcular_sueldo() + self.bono

class Disenador(Empleado):
  def __init__(self, nombre, sueldo, bono: float):
    super().__init__(nombre, sueldo)
    self.bono = bono

  def calcular_sueldo(self):
    return super().calcular_sueldo() + self.bono

class Empresa:
  def __init__(self, empleados = None):
    self.empleados = empleados if empleados is not None else []

  def pagar_nomina(self):
    return self.empleados

empresa = Empresa()

while True:
  cantidad_empleados = int(input('¿Cuántos empleados agrega?: '))

  for i in range(cantidad_empleados):
    nombre = input(f'\nIngresa el nombre del {f'{i+1}er' if i < 2 else f'{i+1}do'} empleado: ').strip()
    rol = input('Ingresa rol del empleado: Programador | Diseñador: ').lower().strip()
    
    while True:
      if rol == 'programador' or rol == 'diseñador':
        break
      
      rol = input('\nIngresa rol del empleado: Programador | Diseñador : ').lower().strip()

    sueldo = float(input('Ingresa el sueldo: '))

    while True:
      if sueldo > 0 or sueldo is not None:
        break
      sueldo = float(input('Ingresa el sueldo: '))

    recibe_bono = input('¿Recibe bono? Si|No: ').lower()

    bono = 0

    while True:
      if recibe_bono == 'no' or recibe_bono == 'si':
        if recibe_bono == 'si':
          bono = float(input('Ingresa el total del bono a pagar: '))
          break
        break
      recibe_bono = input('¿Recibe bono? Si|No: ').lower()
    
    if rol == 'programador':
      empleado = Programador(nombre, sueldo, bono)
      empresa.empleados.append(empleado)

    if rol == 'diseñador':
      empleado = Disenador(nombre, sueldo, bono)
      empresa.empleados.append(empleado)
  
  agregar_mas = input('\n¿Deseas agregar más empleados? Si|No: \n').lower()

  if agregar_mas == 'no':
    break

for empleado in empresa.pagar_nomina():
  print(
    f'Empleado: {empleado.nombre}\n'
    f'Sueldo base: ${empleado.sueldo} | Bono: ${empleado.bono} | Total: ${empleado.calcular_sueldo()}\n'
    )
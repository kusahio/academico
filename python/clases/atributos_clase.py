class Tarea():
  contador_global = 0

  def __init__(self, titulo: str, prioridad: str, completed: bool = False):
    self.titulo = titulo
    self.prioridad = prioridad
    self.completed = completed
    Tarea.contador_global += 1
  
  def describir(self) -> str:
    estado = 'pendiente' if not self.completed else 'completada'
    return f'Tarea: {self.titulo} | Prioridad: {self.prioridad} | Estado: {estado}'

class Taskboard:
  def __init__(self, nombre_usuario: str):
    self.nombre_usuario = nombre_usuario
    self.tareas = []
  
  def agregar_tarea(self, tarea: Tarea):
    self.tareas.append(tarea)
  
  def mostrar_tablero(self):
    print(f'Tareas de {self.nombre_usuario}')

    for task in self.tareas:
      print(task.describir())
  
  def estadisticas(self):
    print(f'Tareas de {self.nombre_usuario}')
    print(f'Total de tareas de {len(self.tareas)}')
    print(f'Total de tareas gobales {Tarea.contador_global}')

board_casa = Taskboard('Camilo Casa')
board_trabajo = Taskboard("Camilo Laburo")

t1 = Tarea("Lavar platos", "Baja")
t2 = Tarea("Fix bug en FastAPI", "Alta")
t3 = Tarea("Jugar un rato", "Baja")

board_casa.agregar_tarea(t1)
board_casa.agregar_tarea(t3)
board_trabajo.agregar_tarea(t2)

board_casa.mostrar_tablero()
board_casa.estadisticas()
board_trabajo.mostrar_tablero()
board_trabajo.estadisticas()
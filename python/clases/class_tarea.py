class Tarea:
  def __init__(self, titulo: str, prioridad: str, completed : bool = False):
    self.titulo = titulo
    self.prioridad = prioridad
    self.completed = completed

  def marcar_finalizada(self):
    self.completed = True
  
  def describir(self) -> str:
    estado = 'pendiente' if not self.completed else 'completada'
    return f'Tarea: {self.titulo} | Prioridad: {self.prioridad} | Estado: {estado}'
  

# mi_tarea = Tarea("Aprender POO", "Alta")
# print(mi_tarea.describir())
# mi_tarea.marcar_finalizada()
# print(mi_tarea.describir())

class TareaUrgente(Tarea):
  def __init__(self, titulo, prioridad, motivo: str, completed = False):
    super().__init__(titulo, prioridad, completed)
    self.motivo = motivo

  def describir(self):
    return f'{super().describir()} | Motivo: {self.motivo}'

tarea_critica = TareaUrgente("Arreglar Servidor", "Alta", "El sistema está caído")
# tarea_critica.marcar_finalizada()
print(tarea_critica.describir())
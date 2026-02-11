class User:
  last_id = 0

  def __init__(self, name: str):
    User.last_id += 1
    self.name = name
    self.id = User.last_id

  def presentarse(self):
    return f'ID: {self.id} | Nombre: {self.name}'
  
numero_usuarios = int(input('Ingresa la cantidad de usuarios a agregar: '))

print(f'vas a agregar {numero_usuarios} usuarios')

usuarios = []
for i in range(numero_usuarios):
    ingresa_nombre = input('Ingresa el nombre de usuario: ')
    nuevo_usuario = User(ingresa_nombre)
    usuarios.append(nuevo_usuario)

for user in usuarios:
  print(user.presentarse())
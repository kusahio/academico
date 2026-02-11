config = {"host": "localhost", "puerto" : 5432}

def connect_user(credentials: dict) -> None:
  set_user = config.get('usuario', 'admin')
  host = credentials.get('host', None)
  port = credentials.get('puerto', None)
  
  if host is None:
    print('No se encontró el host')
    return
  if port is None:
    print('No se encontró el port')
    return
  
  print(f"Conectando a {set_user} en {host}:{port}")

connect_user(config)
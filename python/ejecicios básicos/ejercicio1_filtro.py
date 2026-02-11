clientes = [
  {'id': 1, 'cliente': 'Juan', 'monto': '30.00'},
  {'id': 2, 'cliente': 'Yerko', 'monto': '40.00'},
  {'id': 3, 'cliente': 'Roman', 'monto': '134.45'},
  {'id': 4, 'cliente': 'Pedro', 'monto': '120.5'},
  {'id': 5, 'cliente': 'Ramiris', 'monto': '96.76'},
  {'id': 6, 'cliente': 'Rapunzel', 'monto': '100.76'}
]

def procesar_pedido(lista : list[dict]) -> set[str]:
  sobre_100_usd = [cliente['id'] for cliente in lista if float(cliente['monto']) > 100.00]
  clientes_unicos = {cliente['cliente'] for cliente in lista}
  return clientes_unicos

print(procesar_pedido(clientes))
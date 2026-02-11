class Producto:
  def __init__(self, nombre: str, precio: float):
    self.nombre = nombre
    self.precio = precio

  def obtener_precio_final(self):
    return self.precio
    
class ProductoDescuento(Producto):
  def __init__(self, nombre, precio, porcentaje_descuento):
    super().__init__(nombre, precio)
    self.porcentaje_descuento = porcentaje_descuento

  def obtener_precio_final(self):
    precio_base = super().obtener_precio_final()
    return precio_base * (1 - self.porcentaje_descuento / 100)


perno = Producto('rosca', 90.9)
perno_descuento = ProductoDescuento('rosca', 90.9, 20)

lista = [perno, perno_descuento]

for prod in lista:
  print(f'Precio final(descuentos aplicados): ${prod.obtener_precio_final():.2f}')
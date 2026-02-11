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

class Cart:
  def __init__(self, items: list = [])-> None:
    self.items = items if items is not None else []
  
  def agregar_producto(self, producto: Producto)-> None:
    self.items.append(producto)
  
  def calcular_total(self):
    total = 0
    for prod in self.items:
      total += prod.obtener_precio_final()
    
    return total


perno = Producto('rosca', 150)
llave_inglesa = ProductoDescuento('llave inglesa', 300, 20)

cart = Cart()
cart.agregar_producto(perno)
cart.agregar_producto(llave_inglesa)

total = {
  'total_items': len(cart.items),
  'total_pagar': cart.calcular_total()
}

print(f'Items en carrito: {total["total_items"]}')
print(f'Total a pagar: {total["total_pagar"]:.2f}')
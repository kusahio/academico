total_cuenta = int(input("Ingresa el total de la cuenta a pagar: "))
propina_sugerida_10 = total_cuenta * 0.1
propina_sugerida_15 = total_cuenta * 0.15
total_propina_10 = total_cuenta + propina_sugerida_10
total_propina_15 = total_cuenta + propina_sugerida_15
print('------------------------------------------------')
print(f'Total de la cuenta: ${total_cuenta}')
print(f'Propina sugerida(10%): ${propina_sugerida_10}')
print(f'Total a pagar con propina(10%): ${total_propina_10}')
print(f'Propina sugerida(15%): ${propina_sugerida_15}')
print(f'Total a pagar con propina(15%): ${total_propina_15}')
print('------------------------------------------------')
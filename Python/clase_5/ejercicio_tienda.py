# Ejercicio tienda de libros
print("Ingresar los siguientes datos del libro")
nombreLibro = input("Ingresar el nombre del libro \n")
idLibro = int(input("Ingresar el id del libro \n"))
precioLibro = float(input("Ingresar el precio del libro \n"))
envioGratis = (input("Ingresar si el envio de gratuito (Si/No) \n"))

if envioGratis == "Si":
    envioGratis = True
else:
    envioGratis = False

print(f'''
                              
Nombre: {nombreLibro}
ID: {idLibro}
Precio: ${precioLibro:}
Envío gratuito: {envioGratis}
                               
''')
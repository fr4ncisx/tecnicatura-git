# Ejercicio 2: Determinar si es mayor de edad

edad = int(input("Ingresa tu edad \n"))

if(edad >= 18):
    print("Tu edad es {0}, eres mayor de edad".format(edad))
else:
    print("Tu edad es {0}, eres menor de edad".format(edad))
# Ejercicio número par o impar

i = int(input("Ingresa un número para saber si es par \n"))

if (i % 2 == 0):
    print("El número {0} es par".format(i))
else:
    print("El número {0} es impar".format(i))
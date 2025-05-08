# Ejercicio: El mayor de dos números
numero1 = int(input("Ingresa un número \n"))
numero2 = int(input("Ingresa otro número \n"))

if(numero1 > numero2):
    print("El número {0} es el mayor".format(numero1))
elif(numero2 > numero1):    
    print("El número {0} es el mayor".format(numero2))
elif(numero1 == numero2):
    print("Los números ingresados fueron {0},{1} y son iguales".format(numero1, numero2))
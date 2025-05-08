# Ejercicio: Rango entre 20 y 30 años

edad = int(input("Ingresa tu edad \n"))

mayorQueVeinte = edad > 20
menorQueTreinta = edad < 30

if(mayorQueVeinte and menorQueTreinta):
    print("Tu edad está dentro del rango de los 20 y 30 años")
else:
    print("Tu edad está fuera del rango de los 20 y 30 años")
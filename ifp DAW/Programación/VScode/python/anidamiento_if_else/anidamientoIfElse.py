
nota = int(input("Introduzca la nota del alumno: "))

if (nota>=9):
    if (nota>10):
        print("Nota no valida")
    else:
        print("Sobresaliente")
else:
    if (nota>=7):
        print("Notable")
    else:
        if (nota>=6):
            print("Bien")
        else:
            if (nota>=5):
                print("Aprobado")
            else:
                print("Suspenso")
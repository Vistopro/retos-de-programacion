##
## Escribe un programa que, dado un número, compruebe y muestre si es primo,
## fibonacci y par.
## Ejemplos:
## - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
## - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
## 
from math import sqrt
##Primo
def esPrimo(n):
    a=2
    if n>1:
        while (a<sqrt(n)+1):
            if(n%a==0 and n!=2):
                return "no es primo,"
            else: return "es primo,"
            a+=1
    else: return "no es primo,"

##Fibonacci
def esFibonacci(n):
    fib1 = 0
    fib2=1
    a=0
    while fib2 < n:
        a=fib2
        fib2=fib1+fib2
        fib1=a
    if fib2 == n or n == 0:
        return "es fibonacci"
    else: return "no es fibonacci"
        


def esPar(n):
    if n%2==0:
        return "es par"
    else: return "no es par"


n=int(input("Por favor, escribe un numero: "))

print (n, esPrimo(n),esFibonacci(n),"y",esPar(n))

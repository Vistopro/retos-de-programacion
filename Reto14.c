/*
 * Crea una función que reciba un número decimal y lo trasforme a Octal
 * y Hexadecimal.
 * - No está permitido usar funciones propias del lenguaje de programación que
 * realicen esas operaciones directamente.
 */

#include <unistd.h>

/* 
 * This function converts a decimal number to a given base and print
 the module using the recursivity.
 */
void base(int num, int nbase, char *str)
{
	if (num >= nbase)
	{
		base(num / nbase, nbase, str);
		num = num % nbase;
	}
	write(1, &str[num], 1);
}

/* 
 * This function prints the given number in its equivalent hexadecimal
  and octal representation.
 */

void printNumbers(int num)
{
	char *hex = "0123456789ABCDEF";
	char *octal = "01234567";

	write(1, "Número en base hexadecimal: ", 29);
	base(num, 16, hex);
	write(1, "\n", 1);
	write(1, "Número en base octal: ", 23);
	base(num, 8, octal);
}

int main()
{
	int num;
	num = 8;

	printNumbers(num);
}
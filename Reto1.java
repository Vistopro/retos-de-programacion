/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {

        Map<Character,String> diccionario = new HashMap<>();
        diccionario.put('a',"4");
        diccionario.put('b',"I3");
        diccionario.put('c',"[");
        diccionario.put('d',")");
        diccionario.put('e',"3");
        diccionario.put('f',"|=");
        diccionario.put('g',"&");
        diccionario.put('h',"#");
        diccionario.put('i',"1");
        diccionario.put('j',",_|");
        diccionario.put('k',">|");
        diccionario.put('l',"1");
        diccionario.put('m',"JV|");
        diccionario.put('n',"^/");
        diccionario.put('o',"0");
        diccionario.put('p',"|*");
        diccionario.put('q',"(_,)");
        diccionario.put('r',"|2");
        diccionario.put('s',"5");
        diccionario.put('t',"7");
        diccionario.put('u',"(_)");
        diccionario.put('v',"|/");
        diccionario.put('w',"VV");
        diccionario.put('x',"><");
        diccionario.put('y',"j");
        diccionario.put('z',"2");
        diccionario.put('1',"L");
        diccionario.put('2',"R");
        diccionario.put('3',"E");
        diccionario.put('4',"A");
        diccionario.put('5',"S");
        diccionario.put('6',"b");
        diccionario.put('7',"T");
        diccionario.put('8',"B");
        diccionario.put('9',"g");
        diccionario.put('0',"o");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor, escribe una frase: ");
        String texto = scanner.nextLine();

        char[] textoArray=texto.toLowerCase().toCharArray();

        for (char i : textoArray) {

            System.out.print(diccionario.getOrDefault(i,String.valueOf(i)));


        }
    }
}

/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */
public class Reto2 {

    public static void main(String[] args) {
        //Inicio controladores de puntuación de cada jugador
        int cont1=0;
        int cont2=0;
        String[] juego= {"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
        //Inicio de string con las puntuaciones posibles
        String[] puntos= {"Love","15","30","40","Deuce","Ventaja"};
        for (String s : juego) {
            //sentencia if para contar puntaciones
            if (s.equals("P1")) {
                cont1++;
            } else if (s.equals("P2")) {
                cont2++;
            }
            //sentencia if diferenciando cuando tienen menos o mas  de 40 puntos
            if (cont1>=3 && cont2>=3){
                if(Math.abs(cont1-cont2)==1){
                    System.out.println(puntos[5]+" " +s);
                }
                else if(cont1-cont2==0){
                    System.out.println(puntos[4]);
                }
                else if(Math.abs(cont1-cont2)==2){
                    System.out.println("Ha ganado el "+ s);
                }
            }

            else {
                System.out.println(puntos[cont1] + " - "+puntos[cont2]);
            }



        }

    }

}


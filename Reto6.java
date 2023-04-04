/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */

public class Reto6 {
    public static void main(String[] args) {

        String[][] jugada= {{"🗿","✂️"}, {"✂️","✂️"}, {"📄","✂️"}};
            
            int player1=0;
            int player2=0;
        for (int i = 0; i < jugada.length; i++) {
            if (!jugada[i][0].equals(jugada[i][1])){
                if (jugada[i][0].equals("🗿") && (jugada[i][1].equals("✂️") ||jugada[i][1].equals("🦎"))) {
                    player1++;
                }
                else if (jugada[i][0].equals("📄") && (jugada[i][1].equals("🗿") ||jugada[i][1].equals("🖖"))) {
                    player1++;
                }
                else if (jugada[i][0].equals("✂️") && (jugada[i][1].equals("📄") ||jugada[i][1].equals("🦎"))) {
                    player1++;
                }
                else if (jugada[i][0].equals("🦎") && (jugada[i][1].equals("🖖") ||jugada[i][1].equals("📄"))) {
                    player1++;
                }
                else if (jugada[i][0].equals("🖖") && (jugada[i][1].equals("✂️") ||jugada[i][1].equals("🗿"))) {
                    player1++;
                }
                
                else player2++;
            }
        }
        if (player1>player2){
            System.out.println("Player 1");
        }
        else if(player1==player2){
            System.out.println("Tie");
        }
        else System.out.println("Player 2");

    }
}


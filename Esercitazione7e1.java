import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * Esercitazione7e1
 */
public class Esercitazione7e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            //game
            ////////////////////////////////////////
            int toGuess = MetodiE7e1.estraiNumeroCasuale();
            System.out.println("indovina il numero che ho appena esrtatto (da 1 a 100)");
            System.out.printf("debug spoiler: %d", toGuess);
            int guess;
            int closestMinGuess = -1;
            int ClosestMaxGuess = 101;
            do{
                guess = scanner.nextInt();
                //invalid input
                if(guess < 1 || guess > 100)
                    System.out.println("il numero deve essere tra 1 e 100");
                else{
                    int comp = MetodiE7e1.confrontaNumeri(guess, toGuess);
                    //correct answer
                    if(comp == 0){
                        System.out.println("bravo");
                        break;
                    }
                    //guess is smaller
                    else if(comp == -1){
                        if(guess < closestMinGuess){
                            System.out.printf("hai inserito %d ma ti ho gia detto che il numero è minor di %d ", guess, closestMinGuess);
                        }
                        else{
                            System.out.printf("il numero %d è piu piccolo di quello da indovinare", guess);
                            closestMinGuess = guess;
                        }
                    }
                    //guess is bigger
                    else{
                        if(guess > ClosestMaxGuess){
                            System.out.printf("hai inserito %d ma ti ho gia detto che il numero è minor di %d ", guess, closestMinGuess);
                        }
                        else {
                            System.out.printf("il numero %d è piu grande di quello da indovinare", guess);
                            ClosestMaxGuess = guess;
                        }
                    }
                }
            }while(true);
            ////////////////////////////////////////
        }
    }
}

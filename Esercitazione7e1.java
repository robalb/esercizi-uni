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
        while(true){
            //game
            ////////////////////////////////////////
            int toGuess = MetodiE7e1.estraiNumeroCasuale();
            final int MAX_ATTEMPTS = 10;
            int attempts = 0;
            System.out.println("indovina il numero che ho appena estratto (è nel range da 1 a 100)");
//            System.out.printf("debug spoiler: %d", toGuess);
            int guess;
            //closest answer approaching answer from left
            int closestMinGuess = -1;
            //closest answer approaching answer from right
            int closestMaxGuess = 101;
            do{
                //scanner is buffered. This system fixes several issues related to that
                guess = new Scanner(System.in).nextInt();
                attempts ++;
                //reached attempts limit
                if(attempts == MAX_ATTEMPTS){
                    System.out.println("hai ragginto il limite di tentativi");
                    break;
                }
                //invalid input
                if(guess < 1 || guess > 100)
                    System.out.println("il numero deve essere tra 1 e 100");
                //valid input, analysis logic
                else{
                    int comp = MetodiE7e1.confrontaNumeri(guess, toGuess);
                    //correct answer
                    if(comp == 0){
                        System.out.printf("bravo, pensavo esattamente a %d%n", guess);
                        break;
                    }
                    //guess is smaller
                    else if(comp == -1){
                        if(guess < closestMinGuess){
                            System.out.printf("hai inserito %d ma ti ho gia detto che il numero è maggiore di %d %n", guess, closestMinGuess);
                        }
                        else{
                            System.out.printf("il numero a cui sto pensando è maggiore di %d %n", guess);
                            closestMinGuess = guess;
                        }
                    }
                    //guess is bigger
                    else{
                        if(guess > closestMaxGuess){
                            System.out.printf("hai inserito %d ma ti ho gia detto che il numero è minore di %d %n", guess, closestMaxGuess);
                        }
                        else {
                            System.out.printf("il numero a cui sto pensando è minore di %d %n", guess);
                            closestMaxGuess = guess;
                        }
                    }
                }

            }while(true);
            ////////////////////////////////////////
            System.out.println("vuoi giocare ancora? Y n");
            //see scanner docs to see why calling scanner.nextLine twice may be necessary
            String cmd = new Scanner(System.in).nextLine();
            if(cmd.equals("n") || cmd.equals("N") ){
                break;
            }
        }
    }
}

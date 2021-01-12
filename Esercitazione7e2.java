import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * Esercitazione7e2
 */
public class Esercitazione7e2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toGuess = MetodiE7e2.EstraiStringaCasuale();
        char[] toGuessCh = toGuess.toCharArray();
        int englishLetters = 'z' - 'a'+1; //26 letters
        boolean[] guessed = new boolean[englishLetters];
        int attempts = 0;
        while(true){
            attempts++;
            boolean completed = MetodiE7e2.stampaLettereIndovinate(toGuess, guessed);
            if(completed){
                System.out.println("congratulazioni hai vinot");
                break;
            }
            if(attempts == 20){
                System.out.println("congratulazioni hai perso");
                break;
            }
            //print masked word
            System.out.printf("%n");
            //read input
            System.out.println("inserisci una lettera");
            char c = scanner.nextLine().charAt(0);
            if(guessed[c-'a'])
                System.out.println("hai gia inserito sta lettera");
            else{
                guessed[c-'a'] = true;
                //check if toguess contains this char
                if(MetodiE7e2.scopriLettera(toGuess, c))
                    System.out.println("la parola da indovinare non ha questa lettera");
                else{
                    System.out.println("hai trovato una lettera");
                }
            }
        }

    }
}

import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 13/01/2021
 * Esercitazione7e5
 */
public class Esercitazione7e5 {
    public static void main(String[] args) {
        //global variables
        String key = "";
        String test ="persemplicitsupponiamocheiessaggileparolechiavesianoformatesolamentedalettereminuscolenizialmentelaparolachiavenonancorastataspecificataedquindilastringavuotauttavianonsipossonocifrareoecifraremessaggiseprimanonsispecificataunaparolachiaveseutenteprovaafarloiprogrammadevestampareavideounmessaggioerrore";
        //ui loop
        while(true){
            int input = MetodiE7e5.sceltaMenu();
            //exit
            if(input == 0)
                break;
            //change key
            else if(input == 1){
                key = MetodiE7e5.cambiaParolaChiave(key);
            }
            else if(input == 3){
                System.out.printf("-- decifra messaggio -- %n la chiave è: %n");
                System.out.printf("%s%ntrascrivi o incolla il tuo messaggio cifrato e premi invio:%n", key);
                String message;
                do{
                    message = new Scanner(System.in).nextLine();
                    if(message.matches("[a-z]*"))
                        break;
                    else
                        System.out.println("solo lettere a-z minuscole permesse");
                }while(true);
                MetodiE7e5.decifraMessaggio(key, message);
            }
            else{
                System.out.printf("-- cifra messaggio -- %n la chiave è: %n");
                System.out.printf("%s%nsscrivi il tuo messaggio e premi invio:%n", key);
                String message;
                do{
                    message = new Scanner(System.in).nextLine();
                    if(message.matches("[a-z]*"))
                        break;
                    else
                        System.out.println("solo lettere a-z minuscole permesse");
                }while(true);
                MetodiE7e5.cifraMessaggio(key, message);
            }
        }
    }
}

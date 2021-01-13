import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 13/01/2021
 * MetodiE7e5
 */
public class MetodiE7e5 {
    public static int sceltaMenu(){
        System.out.println("-- MENU PRINCIPALE --");
        System.out.println("1 - Inserisci/cambia la parola chiave");
        System.out.println("2 - cifra un messaggio ");
        System.out.println("3 - decifra un emssaggio");
        System.out.println("0 - esci dal programma");
        int in;
        do{
            in = new Scanner(System.in).nextInt();
        }while(in <0 || in > 3);
        return in;
    }
    public static String cambiaParolaChiave(String key){
        System.out.println("-- cambio parola chiave --");
        System.out.println("la parola chiave attuale è: ");
        System.out.println(key);
        System.out.println("inserisci la nuova parola e premi invio.");
        String newKey = new Scanner(System.in).nextLine();
        if(newKey.length() < 2){
            System.out.println("chiave non cambiata perhe troppo corta");
            return key;
        }
        if(!newKey.matches("[a-z]*")){
            System.out.println("chiave non cambiata perchè contiene caratteri != da a-z lowecase");
            return key;
        }
        return newKey;
    }

    public static char[][] creaMatrice(){
        char[][] table = new char[26][26];
        for (int i = 0; i < table.length; i++) {
            char[] shiftedAlphabet = table[i];
            for (int j = 0; j < shiftedAlphabet.length; j++) {
                int offset =  (j + i) % 26;
                table[i][j] = (char)( 'a' + offset);
            }
        }
        return table;
    }

    public static void cifraMessaggio(String key, String message){
        char[][] table = creaMatrice();
        String out = "";
        for (int i = 0; i < message.length(); i++) {
            char messageC = message.charAt(i);
            char keyC = key.charAt(i%key.length());
            out += cifraLettera(messageC, keyC, table);
        }
        System.out.println(out);
    }

    public static void decifraMessaggio(String key, String message){
        char[][] table = creaMatrice();
        String out = "";
        for (int i = 0; i < message.length(); i++) {
            char messageC = message.charAt(i);
            char keyC = key.charAt(i%key.length());
            out += decifraLettera(messageC, keyC, table);
        }
        System.out.println(out);
    }

    public static char cifraLettera(char messageC, char keyC, char[][] matrice){
        return matrice[(messageC - 'a')][(keyC - 'a')];
    }
    public static char decifraLettera(char messageC, char keyC, char[][] matrice){
        int columnIndex = keyC - 'a';
        int i;
        for (i = 0; i < 26; i++) {
            if(matrice[i][columnIndex] == messageC){
                break;
            }
        }
        return matrice[i][0];
    }
}

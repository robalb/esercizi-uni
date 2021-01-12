import javax.swing.*;
import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * MetodiE7e2
 */
public class MetodiE7e2 {
    public static String EstraiStringaCasuale(){
        String[] dictionary = {
                "abecedario","abate","sticazzi"
        };
        return dictionary[dictionary.length-1];
    }
    public static boolean stampaLettereIndovinate(String toGuess, boolean[] guessed){
        boolean completed = true;
        for(int i=0; i< toGuess.length(); i++){
            char c = toGuess.charAt(i);
            if(guessed[c-'a']){
                System.out.print(c);
            }
            else{
                completed = false;
                System.out.print("-");
            }
        }
        return completed;
    }

    public static boolean scopriLettera(String str, char c){
        return str.indexOf(c) == -1;
    }
}

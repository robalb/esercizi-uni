import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * Esercitazione7e3
 */
public class Esercitazione7e3 {
    public static void main(String[] args) {
         boolean valid = MetodiE7e3.controllaValiditàEspressione(args);
         if(!valid)return;

         int result = MetodiE7e3.valutaEspressione(args);

         System.out.println(result);
    }
}

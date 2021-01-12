import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * MetodiE7e1
 */
public class MetodiE7e1 {
    public static int estraiNumeroCasuale(){
        return (int) Math.floor(Math.random() *100)+1;
    }
    public static int confrontaNumeri(int a, int b){
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
    }
}

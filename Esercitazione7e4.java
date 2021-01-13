import java.util.*;

/**
 * vim: set sts=2 sw=2 et tw=80:
 * @todo: DA FARE
 * @author Alberto Ventafridda
 * @version 13/01/2021
 * Esercitazione7e4
 */
public class Esercitazione7e4 {
    public static void main(String[] args) {
        System.out.println("hello");
        int[][] qwe = test();
        for (int i = 0; i < qwe.length; i++) {
            int[] ints = qwe[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }

        }
    }
    public static int[][] test(){
        int[][] test = {{1,2},{3,5}};
        return test;
    }

}

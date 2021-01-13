import java.util.Scanner;
import java.io.*;

/*
 * Esercizi uni
 * @author Alberto ventafridda
 * Carta oro 2 es 2
 */
public class CartaOro2e2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // scanner.next[Int|Double|String]();

    //get and validate strings
    System.out.println("insert a sequence of llowercase letters");
    String s1 = scanner.next();
    for(int i = 0; i< s1.length(); i++){
      if(s1.charAt(i) < 'a' || s1.charAt(i) > 'z'){
        System.out.println("invalid input");
        System.exit(1);
      }
    }
    System.out.println("insert a sequence of uppercase letters");
    String s2 = scanner.next();
    for(int i = 0; i< s2.length(); i++){
      if(s2.charAt(i) < 'A' || s2.charAt(i) > 'Z'){
        System.out.println("invalid input");
        System.exit(1);
      }
    }

    //print permutations
    System.out.println("{");
    for(int i = 0; i< s1.length(); i++){
      for(int j = 0; j< s2.length(); j++){
        System.out.printf("(%c, %c)  ", s1.charAt(i), s2.charAt(j));
      }
    }
    System.out.printf("%n}%n");

  }
}


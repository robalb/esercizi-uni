import java.util.Scanner;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercizio 3 carta oro 2
 */
public class CartaOro2e3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // scanner.next[Int|Double]();

    //input
    System.out.println("insert a sequence of lowercase letters");
    StringBuilder s = new StringBuilder(scanner.next());
    int k = s.length();
    for(int i = 0; i<k; i++){
      if(s.charAt(i) < 'a' || s.charAt(i) > 'z'){
        System.out.println("invalid input");
        return ;
      }
    }
    System.out.printf("insert an integer between 0 and %d%n",k-1);
    int m = scanner.nextInt();
    if(m<0 || m>k-1){
        System.out.println("invalid input");
        return ;
    }
    System.out.printf("insert another integer between 0 and %d%n",k-1);
    int n = scanner.nextInt();
    if(n<0 || n>k-1){
        System.out.println("invalid input");
        return ;
    }

    //logic
    //lazy variant
    int initialPos = 0;
    int i= 0;
    while(true){
      i++;
      int pos = (m + (i*n)) %k;
      if(i == 1) initialPos = pos;
      else if(pos == initialPos) break;
      char newChar = Character.toUpperCase(s.charAt(pos));
      s.setCharAt(pos, newChar);
      System.out.printf("pos: %d char: %s %n", pos, newChar);
    }
    


    System.out.printf("%s%n", s.toString());
  }
}


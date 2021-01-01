import java.util.Scanner;
import java.io.*;

/*
 * Esercizi uni
 * @author Alberto ventafridda
 * Esercitazione 2
 * contains several exercises, decomment a block to run it
 */
public class mixed_es2{
  public static void main(String[] args){
    //Scanner scanner = new Scanner(System.in);
    //scanner.next[Int|Double|String]();

    //es 5
    /*
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter an integer between 0 and 127");
    int dec = scanner.nextInt();
    if(dec < 0 || dec > 127){
      System.out.println("input must be between 0 and 127");
      return;
    }

    int[] bin = new int[7];
    int i = 6;
    while(dec > 0){
      bin[i] = dec%2;
      dec = dec/2;
      i--;
    }
    System.out.printf("La rappresentazione binaria di %d e': ", dec);
    for(int b: bin) System.out.print(b);
    System.out.printf("%n");
    //*/

    //es5, variazione
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("enter an integer between 0 and 127");
    // byte b = scanner.nextByte();
    // if(b < 0){
    //   System.out.println("input must be between 0 and 127");
    //   return;
    // }

    // System.out.printf("La rappresentazione binaria di %d e': ", b);
    // for(int i=7; i>=0; i--){
    //   if(i == 3) System.out.print(" ");
    //   System.out.print((b>>i) & 1);
    // }
    // System.out.printf("%n");






  }
}


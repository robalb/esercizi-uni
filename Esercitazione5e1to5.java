import java.util.Scanner;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercitazione5 es 1 fino a 5
 */
public class Esercitazione5e1to5{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    //e1
    System.out.println("inserire un numero >0");
    int n = scanner.nextInt();
    if(n <= 0) return;
    //solution using boring math
    double nextExpOf2 = Math.ceil(Math.log(n)/Math.log(2));
    int w = (int)Math.pow(2, nextExpOf2);
    System.out.println(w);
    //solution using cool and cryptic bit manipulation
    int v = n;
    v--;
    //same as v |= v >> 1; v |= v >> 2; v |= v >> 4; v |= v >> 8; v |= v >> 16;
    for(int i=1; i<32; i*=2){
      v |= v >> i;
    }
    v++;
    System.out.println(v);
    //solution using while loop, clear and simple
    //todo


    

  }
}


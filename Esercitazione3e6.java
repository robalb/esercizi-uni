import java.util.*;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercitazione 3 es 6
 */
public class Esercitazione3e6{
  Scanner scanner;

  public static void main(String[] args){
    //scanner.next[Int|Double]();
    try{
      Esercitazione3e6 app = new Esercitazione3e6();
      app.run();
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }

  private void compute(char cmd){
    System.out.println("inserire primo numero");
    int a = scanner.nextInt();
    System.out.println("inserire secondo numero");
    int b = scanner.nextInt();
      switch(cmd){
        case '/': System.out.println(b != 0 ? a/b : "si prega gentilmente di non dividere per zero"); return;
        case '*': System.out.println(a*b); return;
        case '+': System.out.println(a+b); return;
        case '-': System.out.println(a-b); return;
      }
  }
  private void run() throws Exception{
    scanner = new Scanner(System.in);

    System.out.println("inserire un operatore");
    char cmd = scanner.next().charAt(0);
    while(cmd != 'u'){
      if("*/+-".contains(String.valueOf(cmd))) compute(cmd);
      else System.out.println("operatore non riconosciuto");
      System.out.println("inserire un operatore");
      cmd = scanner.next().charAt(0);
    }
  }
}


import java.util.Scanner;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercizi misti, esercitazione 4
 * decommentare un blocco per eseguirlo
 */
public class Mixed_es4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //e1
    // System.out.println("inserisci un intero positivo");
    // int initial = scanner.nextInt();
    // if(initial < 0) return;
    // int tmp = -1;
    // while(tmp != initial){
    //   System.out.println("inserisci lo stesso numero di prima");
    //   tmp = scanner.nextInt();
    // }
    
    //e2
    // System.out.println("inserisci un intero positivo");
    // int n = scanner.nextInt();
    // if(n < 0) return;
    // int i = 0;
    // int result = 1;
    // while(i++<n){
    //   result *= i;
    // }
    // System.out.println(result);

    //e3
    // System.out.println("inserisci una base intera");
    // int b = scanner.nextInt();
    // System.out.println("inserisci un esponente intero >= 0");
    // int e = scanner.nextInt();
    // if(e < 0) return;
    // int result = 1;
    // for(int i=0; i<e; i++){
    //   result *= b;
    // }
    // System.out.println(result);

    //e4
    // System.out.println("inserisci il peso dello zaino kg interi");
    // int kgBackpack = scanner.nextInt();
    // if(kgBackpack < 0) return;
    // int nItems = 0;
    // int kgItems = 0;
    // int heaviestItem = -1;
    // int lightestItem = -1;
    // while(true){
    //   System.out.println("inserisci peso in kg interi di un oggetto, o 0 per terminare");
    //   int kgItem = scanner.nextInt();
    //   if(kgItem <= 0)break;
    //   nItems++;
    //   kgItems += kgItem;
    //   if(kgItem > heaviestItem)heaviestItem = kgItem;
    //   if(nItems==1 || kgItem < lightestItem)lightestItem = kgItem;
    // }
    // float avg = ((float)kgItems/nItems);
    // System.out.printf("capacita zaino: %d%n peso oggetti: %d%n oggetto piu pesante: %d%n oggetto piu leggero: %d%n peso medio oggetti: %f%n", 
    //     kgBackpack, kgItems, heaviestItem, lightestItem, avg);

    //e5
    // System.out.println("inserisci numero >= 0");
    // int n = scanner.nextInt();
    // if(n <= 0) return;
    // System.out.println("inserisci altro numero >= 0");
    // int m = scanner.nextInt();
    // if(m <= 0) return;
    // int r = n;
    // int q = 0;
    // while(r >= m){
    //   q++;
    //   r -= m;
    // }
    // System.out.printf("quoziente: %d resto: %d%n", q, r );

    //e6
    // System.out.println("inserisci sequqnza di 0 e 1");
    // String a = scanner.nextLine();
    // System.out.println("inserisci sequqnza di 0 e 1");
    // String b = scanner.nextLine();
    // if(a.length() != b.length() || !a.matches("(0|1)+") || !b.matches("(0|1)+")){
    //   System.out.println("input non ha solo 0 o 1 oppure la lunghezza non corrisponde");
    //   return;
    // }
    // StringBuilder or = new StringBuilder();
    // StringBuilder and = new StringBuilder();
    // for(int i=0; i< a.length(); i++){
    //   boolean ca = a.charAt(i) == '1';
    //   boolean cb = b.charAt(i) == '1';
    //   or.appendCodePoint( ca || cb ? '1': '0');
    //   and.appendCodePoint( ca && cb ? '1': '0');
    // }
    // System.out.printf("%s %s", or.toString(), and.toString());
    
    //e7


  }
}


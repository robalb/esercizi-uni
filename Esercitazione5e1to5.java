import java.util.*;
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
    //System.out.println("inserire un numero >0");
    //int n = scanner.nextInt();
    //if(n <= 0) return;
    ////solution using boring math
    //double nextExpOf2 = Math.ceil(Math.log(n)/Math.log(2));
    //int w = (int)Math.pow(2, nextExpOf2);
    //System.out.println(w);
    ////solution using cool and cryptic bit manipulation
    //int v = n;
    //v--;
    ////if you hate loops, write as: v |= v >> 1; v |= v >> 2; v |= v >> 4; v |= v >> 8; v |= v >> 16;
    //for(int i=1; i<32; i*=2) v |= v >> i;
    //System.out.println(++v);
    ////solution using loop, clear and simple
    //int y = n;
    //int pow = 2;
    //while((y>>=1) >0) pow <<=1;
    //System.out.println(pow);
    
    //e2
    // System.out.println("inserire una parola");
    // String a = scanner.nextLine();
    // System.out.println("inserire una parola");
    // String b = scanner.nextLine();
    // int i=0;
    // for(;i<a.length(); i++){
    //   if(a.charAt(i) != b.charAt(i))break;
    // }
    // System.out.println(a.substring(0,i));

    //e3
    // System.out.println("inserire un numero >0");
    // int n = scanner.nextInt();
    // if(n <= 0) return;
    // int m = n;
    // Map<Integer, Integer> divisors = new HashMap<Integer, Integer>();
    // int divisor = 2;
    // while(n > 1){
    //   if(n%divisor == 0){
    //     n = n/divisor;
    //     int divCount = divisors.containsKey(divisor) ? divisors.get(divisor)+1 : 1;
    //     divisors.put(divisor, divCount);
    //   }
    //   else{
    //     divisor++;
    //   }
    // }
    // System.out.printf("Numero let: %d%nFattori: ", m);
    // for(Integer key: divisors.keySet()){
    //   int value = divisors.get(key);
    //   String i18times = value > 1 ? "volte" : "volta";
    //   System.out.printf("%d (%d %s) ", key, value, i18times);
    // }
    
    //e3 senza salvare in strutture
    // System.out.println("inserire un numero >0");
    // int n = scanner.nextInt();
    // if(n <= 0) return;
    // System.out.printf("Numero letto: %d%nFattori: ", n);
    // int divisor = 2;
    // int divisorCount = 0;
    // while(n > 1){
    //   if(n%divisor == 0){
    //     n = n/divisor;
    //     divisorCount ++;
    //   }
    //   else{
    //     if(divisorCount > 0){
    //       String i18times = divisorCount > 1 ? "volte" : "volta";
    //       System.out.printf("%d (%d %s), ", divisor, divisorCount, i18times);
    //       divisorCount = 0;
    //     }
    //     divisor++;
    //   }
    // }
    // String i18times = divisorCount > 1 ? "volte" : "volta";
    // System.out.printf("%d (%d %s) ", divisor, divisorCount, i18times);

    //e4
    // System.out.println("inserire un numero >0");
    // int m = scanner.nextInt();
    // if(m <= 0) return;
    // System.out.println("inserire un altro numero >0");
    // int n = scanner.nextInt();
    // if(n <= 0) return;
    // while(m-- >0) n++;
    // System.out.println(n);
    

    

  }
}


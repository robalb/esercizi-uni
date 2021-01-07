import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.*;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercitazione5 tutti
 */
public class Esercitazione5_tutti {
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
//     System.out.println("inserire un numero >0");
//     int m = scanner.nextInt();
//     if(m <= 0) return;
//     System.out.println("inserire un altro numero >0");
//     int n = scanner.nextInt();
//     if(n <= 0) return;
//     while(m-- >0) n++;
//     System.out.println(n);

    //e5
//     System.out.println("inserire un numero >0");
//     int n = scanner.nextInt();
//     if(n <= 0) return;
     //variante recursiva
//     collatz(n);
      //variante iterativa
//      while(n != 1){
//          System.out.println(n);
//          if(n%2 == 0) n/=2;
//          else n = 3*n +1;
//      }
//      System.out.println(n);

      //e5 variante esrcitazione
//      System.out.println("inserire un numero massimo >0");
//      double m = scanner.nextDouble();
//      if(m <= 0) return;
//      long startTime = System.currentTimeMillis();
//      for(double i=1;i<m;i++){
//          System.out.printf("Provo la congettura per n=%f..", i);
//          int iterations = 0;
//          double n = i;
//          while(n != 1 && iterations < Integer.MAX_VALUE){
//              iterations ++;
//              if(n%2 == 0) n/=2;
//              else n = 3*n +1;
//          }
//          if(n == 1){
//              System.out.println("Ok, vale.");
//          }else{
//              System.out.println("Non converge. Raggiunto Integer.MAX_VALUE");
//          }
//      }
//      long endTime = System.currentTimeMillis();
//      System.out.println("That took " + (endTime - startTime) + " milliseconds");

      //e inventato: dato intero n, stampare se è pot. di 2
//      System.out.println("inserire un numero massimo >0");
//      int m = scanner.nextInt();
//      if(m <= 0) return;
//      boolean isPowOf2 = x!= 0 && ( (m -1) & m ) == 0;
//      System.out.println(isPowOf2);

      //e6
//      String m;
//      String n;
//      int matchesCount = 0;
//      //read input for m
//      do{
//          System.out.println("inserire genoma");
//          m = scanner.next();
//          if(m.matches("[ACGT]+"))
//              break;
//          else
//              System.out.println("what is this genoma lol");
//      }while(true);
//      //read input for n
//      do{
//          System.out.println("inserire proteina");
//          n = scanner.next();
//          if(n.matches("[ACGT]+"))
//              break;
//          else
//              System.out.println("what is this lol");
//      }while(true);
//      //logic
//      System.out.printf("La sequenza %s compare in %s nelle seguenti posizioni: ",m,n);
//      for(int mHead= 0; mHead< m.length(); mHead ++){
//          //if the substring of m we are analyzing is shorter than n, leave the loop
//          if (m.length() - mHead < n.length()) break;
//          //check if the substring of n length starting from mHead position matches n
//          boolean match = true;
//          for(int i=0; i<n.length(); i++){
//              if(m.charAt(mHead + i) != n.charAt(i)){
//                  match = false;
//                  break;
//              }
//          }
//          if(match){
//              matchesCount ++;
//              //print ',' but only if this is not the first element
//              if(matchesCount > 1)
//                  System.out.print(", ");
//              System.out.print(mHead+1);
//          }
//      }
//
      //e7
//      String m;
//      String n;
//      final int MARGIN_WIDTH = 5;
//      do{
//          System.out.println("inserire stringa rappresentante numero intero");
//          m = scanner.next();
//          if(m.matches("[0-9]+"))
//              break;
//          System.out.println("input errato");
//      }while(true);
//      do{
//          System.out.println("inserire stringa rappresentante numero intero");
//          n = scanner.next();
//          if(n.matches("[0-9]+"))
//              break;
//          System.out.println("input errato");
//      }while(true);
//      //the max width the equation block can take
//      int equationBlockWidth = m.length() + n.length();
//      int totalWidth = equationBlockWidth + MARGIN_WIDTH;
//      int result = 0;
//      int passage = 0;
//      //print the initial part of the eq
//      System.out.printf("%"+ totalWidth +"s *%n", m);
//      System.out.printf("%"+ totalWidth +"s%n", n);
//      System.out.printf("%"+ totalWidth +"s%n", strRepeat('-', Math.max(m.length(), n.length())));
//      //print the passages
//      for(int i=0; i< n.length(); i++){
//          int offset = n.length()-1-i;
//          passage = Integer.parseInt(m) * Integer.parseInt(n.substring(offset, offset+1));
//          System.out.printf("%"+ ( totalWidth-i ) +"d%s%n",passage, strRepeat(' ', i));
//          result += passage * Math.pow(10, i);
//      }
//      //print separator line and result
//      equationBlockWidth -= Math.ceil(Math.log10(passage)) > m.length() ? 0 : 1;
//      System.out.printf("%"+ totalWidth +"s%n", strRepeat('-', equationBlockWidth));
//      System.out.printf("%"+ totalWidth +"s%n", result);

      //e inventato: implementare substring
      System.out.println(("hello world!").substring(0, 3));
      System.out.println(dumbSubstr("hello world!", 0,3));


  }
  //used by e5 variante recursiva
  static int collatz(int n){
      System.out.println(n);
      if(n == 1) return 1;
      else if(n%2 == 0) return collatz(n/2);
      else return collatz(3*n +1);
  }
  //used by e7
  static String strRepeat(char str, int len){
      char[] c = new char[len];
      Arrays.fill(c, str);
      return String.valueOf(c);
  }
  //used by es inventato substr
  static String dumbSubstr(String str, int start, int end){
      char[] b = new char[end-start+1];
      str.getChars(start, end, b,0);
      return String.valueOf(b);
  }
}


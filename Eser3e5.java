import java.util.*;
import java.io.*;

/*
 * Esercizi uni
 * use as cli application
 * @author Alberto ventafridda
 * Esercizio 5 esercitazione 3
 */
public class Eser3e5{
  private Scanner scanner;

  private class Player{
    public String name;
    public String move;
    public Player(int playerNumber){
      System.out.printf("inerire nome giocatore %d%n", playerNumber);
      name = scanner.next();
    }
    public void readMove(){
      this.move = move;
      System.out.printf("%s inserisci la tua mossa%n", name);
      do{
        move = scanner.next();
      }while(!move.matches("sasso|carta|forbice"));
    }
  }

  public static void main(String[] args){
    try{
      Eser3e5 app = new Eser3e5();
      app.run();
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }

  private void run(){
    scanner = new Scanner(System.in);
    HashMap<String, String> winningMove = new HashMap<String, String>();
    winningMove.put("sasso", "forbice");
    winningMove.put("carta", "sasso");
    winningMove.put("forbice", "carta");

    Player p1 = new Player(1);
    Player p2 = new Player(2);

    String input;
    do{
      p1.readMove();
      p2.readMove();
      
      if(winningMove.get(p1.move).equals(p2.move)){
        System.out.printf("%s ha vinto%n", p1.name);
      }
      else if(winningMove.get(p2.move).equals(p1.move)){
        System.out.printf("%s ha vinto%n", p2.name);
      }
      else{
        System.out.println("pareggio");
      }
      System.out.println("vuoi giocare di nuovo?");
      input = scanner.next();
    }while(input.toLowerCase().matches("(si|yes|certo|volentieri|ok).*"));
  }
}


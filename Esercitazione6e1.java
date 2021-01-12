import java.util.Scanner;

public class Esercitazione6e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int in;
        do {
            System.out.println("inserire numero positivo o zero per terminare");
            in = scanner.nextInt();
            if (in < 0)
                System.out.println("input invalido");
            else if (in != 0)
                str = aggiornaStringa(in, str);
        }
        while(in !=0);
        System.out.println(str);
    }

    //è permesso chiamare questa funzione solo con input di numero pari? non è chiaro, nel dubbio
    //è la funzione ad eseguire questo controllo in maniera costosa
    public static String aggiornaStringa(int n, String str){
//        for(int i=0; i< )
//        str += String.valueOf(n) + " ";
        return str;
    }

}

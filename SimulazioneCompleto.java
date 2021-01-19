
/**
 * start: 16:52
 * end: 17: 59
 */
public class SimulazioneCompleto {

    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("numero di parametri errato, il programma terminerà");
            System.exit(1);
        }
        String espressione = args[0];
        String valori = args[1];

        if(!MetodiSimulazioneCompleto.checkExpr(espressione)){
            System.out.println("espressione errata, il programma terminerà");
            System.exit(1);
        }
        if(!MetodiSimulazioneCompleto.checkValori(valori)){
            System.out.println("valori errati, il programma terminerà");
            System.exit(1);
        }

        int[] tabella = new int[5];

        MetodiSimulazioneCompleto.estraiValori(valori, tabella);

        String daCalc = MetodiSimulazioneCompleto.sostituisci(espressione, tabella);

//        System.out.println(daCalc);
        System.out.println(MetodiSimulazioneCompleto.calcola(daCalc));
    }
}

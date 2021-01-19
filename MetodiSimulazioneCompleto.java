


/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 19/01/2021
 * Metodi
 */
public class MetodiSimulazioneCompleto {
    public static boolean checkExpr(String s){
        boolean expectedOperator = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isLetter = (c >= 'A' && c <= 'E');
            boolean isNumber = (c >= '0' && c <= '9');
            boolean isOperator = (c== '+' || c == '-');
            if(expectedOperator && !isOperator){
                System.out.printf("parse error: at character %d: ", i+1);
                System.out.println("expected operator, got something else instead");
                return false;
            }
            else if(!expectedOperator && !(isLetter || isNumber)){
                System.out.printf("parse error: at character %d: ", i+1);
                System.out.println("expected literal, got something else instead");
                return false;
            }
            expectedOperator = !expectedOperator;
        }
        if(!expectedOperator){
            System.out.printf("parse error: at character %d: ", s.length());
            System.out.println("expected literal, instead got end of file");
            return false;
        }

        return true;
    }
    public static boolean checkValori(String s){
        final int STATE_OPERATOR = 1;
        final int STATE_LETTER = 2;
        final int STATE_NUMBER = 3;
        int expected = STATE_LETTER;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isLetter = (c >= 'A' && c <= 'E');
            boolean isNumber = (c >= '0' && c <= '9');
            boolean isOperator = (c == ':');
            switch (expected) {
                case STATE_LETTER -> {
                    if (!isLetter) {
                        System.out.printf("parse error: at character %d: ", i+1);
                        System.out.println("expected letter, got something else instead");
                        return false;
                    }
                    expected = STATE_OPERATOR;
                }
                case STATE_OPERATOR -> {
                    if (!isOperator) {
                        System.out.printf("parse error: at character %d: ", i+1);
                        System.out.println("expected operator, got something else instead");
                        return false;
                    }
                    expected = STATE_NUMBER;
                }
                case STATE_NUMBER -> {
                    if (!isNumber) {
                        System.out.printf("parse error: at character %d: ", i+1);
                        System.out.println("expected number, got something else instead");
                        return false;
                    }
                    expected = STATE_LETTER;
                }
            }
        }
        //at the end of the parsing, we expect to be in a state of expected letter
        if(expected != STATE_LETTER){
            System.out.printf("parse error: at character %d: ", s.length());
            System.out.println("expected operator, got end of file instead");
            return false;
        }
        return true;
    }

    public static void estraiValori(String s, int[] tabella){
        for (int i = 0; i < s.length(); i+=3) {
            int letter = s.charAt(i) - 'A';
            int number = s.charAt(i+2) - '0';
            tabella[letter] = number;
        }
    }

    public static String sostituisci(String s, int[] tabella){
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'E'){
                newString += tabella[c-'A'];
            }else
                newString += c;
        }
        return newString;
    }

    public static int calcola(String s){
        int result = 0;
        boolean sum = true;
        for (int i = 0; i < s.length(); i+=2) {
            int value = (s.charAt(i) - '0');
            if(sum)
                result += value;
            else
                result -= value;

            if(i < s.length()-1)
                sum = s.charAt(i+1) == '+';
        }


        return result;
    }

}

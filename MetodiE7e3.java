import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * vim: set sts=2 sw=2 et tw=80:
 *
 * @author Alberto Ventafridda
 * @version 12/01/2021
 * MetodiE7e3
 * metodi per esercitazione7e3
 */
public class MetodiE7e3 {
    /**
     * if an error is encountered, it will be printed to the screen
     * @param args
     * @return wether the expression is valid or not
     */
    public static boolean controllaValiditàEspressione(String[] args){
        //the expression is expected to start with an operand
        boolean expectedOperand = true;
        for (String arg : args) {
            boolean isOperator = (arg.equals("+") || arg.equals("-"));
            boolean isOperand = !isOperator && valutaOperando(arg) != -1;
            if(expectedOperand){
                expectedOperand = false;
                if(!isOperand){
                    System.out.println("parse error: Expected operand, got something else instead");
                    return false;
                }
            }
            else{
                expectedOperand = true;
                if(!isOperator) {
                    System.out.println("parse error: Expected operator, got something else instead");
                    return false;
                }
            }
        }
        if(expectedOperand){
            System.out.println("parse error: expression didn't terminate with an operand");
            return false;
        }
        //an error was never encountered during the parse, return true
        else
            return true;
    }

    /**
     * if an error is encountered, it will be printed to the screen
     * @param str
     * @return the integer represented in the string, or -1 in case of error
     */
    public static int valutaOperando(String str){
        if(str.length() != 1) {
            System.out.println("invalid literal length");
            return -1;
        }
        if(str.charAt(0) < '0' || str.charAt(0) > '9'){
            System.out.println("unexpected symbol, expected numeric literal");
            return -1;
        }
        return str.charAt(0) - '0';
    }

    public static int valutaEspressione(String[] args){
        boolean lastOperatorIsSum = true;
        int result = 0;
        for(String arg : args){
            if(arg.equals("+") ){
                lastOperatorIsSum = true;
            }
            else if(arg.equals("-") ){
                lastOperatorIsSum = false;
            }
            //we know this is a valid expression, so it can only be an operand
            else{
                if(lastOperatorIsSum) result += valutaOperando(arg);
                else result -= valutaOperando(arg);
            }

        }
        return result;
    }
}

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
                    System.out.println("parse error: Expected operand, got something else instead");
                    return false;
                }
            }
        }
        //Parse error: the expression terminated with an operator
        if(expectedOperand)
            return false;
        //an error was never encountered during the parse, return true
        else
            return true;
    }

    public static int valutaOperando(String str){
        int result = -1;
        if(str.length() != 1) {
            System.out.println("invalid numeric literal length");
        }
        else if(str.charAt(0) < '0' || str.charAt(0) > '9'){
            System.out.println("unexpected symbol, expected numeric literal");
        }
        else{
            result = str.charAt(0) - '0';
        }
        return result;
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

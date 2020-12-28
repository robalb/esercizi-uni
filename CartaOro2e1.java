import java.util.Scanner;
import java.io.*;

public class CartaOro2e1 {
  //--------------------
  //tokenizer
  //--------------------
  private enum Tokens{
    OP_ADD,
    OP_SUBTRACT,
    LIT_INTEGER,
    EOF
  }
  private class Token{
    public Tokens type;
    public int ivalue;
    public Token(Tokens type, int ivalue){
      this.type = type;
      this.ivalue = ivalue;
    }
    public Token(Tokens type){
      this.type = type;
    }
  }

  private class Tokenizer{
    BufferedReader b;
    public Tokenizer(BufferedReader b){
      this.b = b;
    }

    public Token read() throws Exception{
      int c = b.read();
      if(c == '-') return new Token(Tokens.OP_SUBTRACT);
      else if(c == '+') return new Token(Tokens.OP_ADD);
      else if(c == -1 || c == 0x000A || c == 0x000D) return new Token(Tokens.EOF);
      else if(c >= '0' && c <= '9') return readInteger(c);
      else throw new IllegalStateException("unexpected symbol");
    }

    private Token readInteger(int c) throws Exception{
      StringBuilder strInt = new StringBuilder();
      while(c != -1 && c >= '0' && c <= '9'){
        strInt.appendCodePoint(c);
        b.mark(100);
        c = b.read();
      }
      b.reset();
      int MVInt = new Integer(strInt.toString());
      return new Token(Tokens.LIT_INTEGER, MVInt);
    }

  }
    
  public static void main(String[] args){
    try{
      CartaOro2e1 app = new CartaOro2e1();
      app.run();
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }

  private void run() throws Exception{
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    Tokenizer tokenizer = new Tokenizer(buff);
    //the result well'output at the end of the parse process
    int res = 0;
    //The last token type received
    //0: integer     now expecting an operation
    //1: sum       | now expecting an integer
    //-1: subtract |
    int pendingOp = 1;
    Token t = tokenizer.read();
    //read a token, until the end of the stream is reached
    while(t.type != Tokens.EOF){
      if(t.type == Tokens.LIT_INTEGER){
        if(pendingOp == 1) res += t.ivalue;
        else if(pendingOp == -1) res -= t.ivalue;
        else throw new IllegalStateException("unexpected token");
        pendingOp = 0;
      }
      else{
        if(pendingOp != 0)
          throw new IllegalStateException("unexpected token: expecting integer literal, instead got operator");
        else if(t.type == Tokens.OP_ADD) pendingOp = 1;
        else if(t.type == Tokens.OP_SUBTRACT) pendingOp = -1;
      }
      // System.out.println(t.type);
      t = tokenizer.read();
    }
    if(pendingOp != 0)
        throw new IllegalStateException("unexpected token: expecting integer literal, instead got EOF");
    System.out.println(res);
  }
}

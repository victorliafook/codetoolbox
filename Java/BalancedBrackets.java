import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> auxStack = new Stack<Character >();
        List<Character> open = new ArrayList<Character>();
        open.add('[');
        open.add('{');
        open.add('(');
        List<Character> close = new ArrayList<Character>();
        close.add(']');
        close.add('}');
        close.add(')');
        
        char[] expArr = expression.toCharArray();
        for(char character : expArr){
            if(open.contains(character)){
                auxStack.push(character);
            }
            if(close.contains(character)){
                if(auxStack.isEmpty())
                    return false;
                char popped = auxStack.pop();
                
                if(open.indexOf(popped) != close.indexOf(character))
                    return false;
            }
        }
        
        if(auxStack.size() == 0)
            return true;
        return false;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

//Matthew Reidy
import java.util.*;
public class rpn {
	
	    private final static char ADD = '+';
	    private final static char SUBTRACT = '-';
	    private final static char MULTIPLY = '*';
	    private final static char DIVIDE = '/';
	    private final static char RemainderWhenDividing = '%';
		private final static char Multiplynegative = 'm';
		private final static char ExchangeTop2 = 'r';
		private final static char duplicatetop = 'd';
		private final static char printtopitem = 'p';
		private final static char printanddeletetop = 'n';
		private final static char printallonstack = 'f';
		private final static char clearstack ='c';
		private final static char quit ='q';
		private final static char helpmessage = 'h';
		
		public Stack<Integer> stack;
	    
	    public rpn()
	    {
	        stack = new Stack<Integer>();
	    }
	   
	    public void Operate(String operation)
	    {
	        int result = 0;
	        
	        switch (operation.charAt(0))
	        {
	            case ADD:
	            	int op2 = (stack.pop()).intValue();
	                int op1 = (stack.pop()).intValue();
	            	stack.push( op1 + op2);
	               break;
	            case SUBTRACT:
	            	int a = (stack.pop()).intValue();
	                int b = (stack.pop()).intValue();
	            	stack.push(a - b);
	               break;
	            case MULTIPLY:
	            	int c = (stack.pop()).intValue();
	                int d = (stack.pop()).intValue();
	            	stack.push(c * d);
	                break;
	            case DIVIDE:
	            	int  e= (stack.pop()).intValue();
	                int f= (stack.pop()).intValue();
	            	stack.push(e / f);
	            case RemainderWhenDividing:
	            	op2=stack.pop(); op1=stack.pop();
	            	stack.push(op1 % op2);
	            	break;
	            case Multiplynegative:
	            	op2 = (stack.pop()).intValue();
	    			result = op2 * -1;
	    			System.out.println(result);
	    			stack.push(new Integer(result));
	    			break;
	            case ExchangeTop2:
	            	op1=stack.pop(); op2=stack.pop();
	            	stack.push(op1); stack.push(op2);
	            case duplicatetop:
	            	op2=stack.pop(); stack.push(op2);
	    			break;
	            case printtopitem:
	            stack.peek();
	            break;
	            case printanddeletetop:
	            	op2=stack.pop();
	            	stack.peek(); stack.pop();
	            	break;
	            case quit:
	            	break;
	            case helpmessage:
	            	System.out.println("+ = add \n - = subtract \n * = multiply / = divide \n m = urinary minus p=print top \n ");
	            	System.out.println("n' = print top and remove 'd' = duplicate top \n  'r' = exchange top two items 'f' = print contents of stack");
	            	System.out.println("c = clear stack  h or ? = help \n q = quit");
	        }

	        
	    }
	    public boolean isNumber(String in) {
	        try
	        {
	            int number = Integer.valueOf(in);
	            return true;
	        }
	        catch (NumberFormatException e) {
	            return false;
	        }
	    }
	
	    public boolean isOperator(String token)
	    {
	        return ( token.equals('+') || token.charAt(0) == '-' ||token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%'|| token.charAt(0) == 'm'|| 
	        		 token.charAt(0) == 'r'||token.charAt(0) == 'd'|| token.charAt(0) == 'p'|| token.charAt(0) == 'n'||token.charAt(0) == 'f'|| token.charAt(0) == 'c'||
	        		 token.charAt(0) == 'q' || token.charAt(0) == 'h'||token.charAt(0) == '?');
	    }
	    	
	    
}
		

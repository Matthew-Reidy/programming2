import java.util.*;
public class driver {
	private static String input;
	private static String input2 = ".";
	private static Scanner user= new Scanner (System.in);
	
	public static void main(String[]args){
		
		rpn calc= new rpn();
		
		while(input2.charAt(0) !='q'){
			input= user.nextLine().toLowerCase();
			Scanner scaninput = new Scanner(input);
			while(scaninput.hasNext() && input2.charAt(0) != 'q'){
				input2=scaninput.next();
				if(calc.isNumber(input2)){
					calc.stack.push((Integer.parseInt(input2)));
					
				}else if(calc.isOperator(input2)){
					calc.Operate(input2);
				}else{
					System.out.println("please enter a valid operator or number");
				}
					
					
					}
				}
			}	
		}
	


import java.util.*;
public class Classrecursion {
public static String input="";
public static String reverse =" ";
public static Stack <Character> Staq = new Stack<Character>();
  public static void main(String[]args){
	  Scanner userinput = new Scanner(System.in);
	  System.out.println("please enter some text");
	  input=userinput.nextLine();
	for (int i=0;i<input.length();i++){
		Staq.push(input.charAt(i));
		  
	  }
		reverse(input);
 }
  	
	public static void reverse(String s){
  		 if(reverse.length() < input.length()) {
			reverse += Staq.pop();
             reverse(s);
         } else {
             System.out.print(input + "-" + reverse);
   }
  }
}







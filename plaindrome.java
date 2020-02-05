package project4;
import java.util.*;
import java.io.*;
public class plaindrome {
	public static String queue1 = "";
	public static String stack1=  "";
	public String input= "";
	public static Stack <Character> palstack;
	public static Queue <Character> palqueue;
	
	public plaindrome(){
		palstack=new Stack<Character>(); 
		palqueue=new LinkedList <Character>();
	}
	public static boolean ispalindrome(String lineinput){
	  for(int i=0;i<lineinput.length();i++ ){
		  palstack.push(lineinput.charAt (i));
		  palqueue.add(lineinput.charAt(i));
		  
	  }
		for(int i=0;i<lineinput.length();i++){
			stack1+=palstack.pop();
			queue1+=palqueue.remove();
		}
		if(stack1.equals(queue1)){
			return true;
			
		}
		else{
			return false;
				
			}
		}
	}


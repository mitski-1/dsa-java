import java.util.Scanner;  
import java.util.Stack;
  
public class StackExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        stack.push("skyrim");
        stack.push("minecraft");
        stack.push("dota2");
        stack.push("csgo");

       String myFavGame = stack.peek(); 
System.out.println(stack);
  System.out.println(myFavGame);      
    }
}
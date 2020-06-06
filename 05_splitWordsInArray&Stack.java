import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the sentence");
        String sentence = sc.nextLine() ;
        String [] words = sentence.split(" ") ;
        ArrayList<String> arraylist = new ArrayList<>();
        Stack<String> stack = new Stack<>() ;
        for ( String word : words ) {
            arraylist.add(word) ;
            stack.add(word) ;
        }
        System.out.println(arraylist.get(2));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());





    }
}

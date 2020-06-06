import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine() ;
        String[] words = sentence.split(" ");
        ArrayList<String> strings = new ArrayList<>() ;

        for (String word : words) {
            strings.add(word) ;
        }
        System.out.println(strings.get(0));
        System.out.println(strings.get(strings.size()-1));


    }
}

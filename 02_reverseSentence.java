import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("pelease Enter the sentences :");
        String sentence = sc.nextLine() ;
        String[] words = sentence.split(" ") ;
        ArrayList<String> strings = new ArrayList<String>();

        for (String word : words) {
            strings.add(word) ;
        }
        int i = words.length-1 ;

        while (i != -1 ) {
            System.out.print(words[i]+" ");
            i-- ;
        }

    }
}

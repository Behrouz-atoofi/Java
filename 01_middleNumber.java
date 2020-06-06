import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i ;
        ArrayList<Integer> integers = new ArrayList<Integer>() ;
        while ( true ) {
            Scanner sc = new Scanner(System.in) ;
            i = sc.nextInt() ;
            if ( i== 999 ) {
                break ;
            }
            else {
              integers.add(i);
            }

        }
        System.out.println("finished...");
        integers.sort((o1, o2) -> o1-o2);
        System.out.println(integers);
        System.out.println("Result is : " + integers.get((integers.size()-1)/2));


    }
}

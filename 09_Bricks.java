import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        float [] value = new float[5] ;

        int i = 0 ;
        while (i<5) {
            float pv = scanner.nextFloat() ;
            if ( pv<10.0 && pv>=1.0) {
                value[i] = pv ;
                i++ ;
            } else {
                System.out.println("please enter the number between 1 and 10");
                continue ;

            }

        }

        if ( value[0]<=value [3] && value[0]<=value[4]) {
            if( value[2]<=value[3] && value[2] <=value[4] ) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }

    }


}

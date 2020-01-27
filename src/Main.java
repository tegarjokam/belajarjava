import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List listJava = new ArrayList();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ( ( j == 5 && i == 1 ) ||
                     ( j == 4 && i == 2 ) ||
                     ( j == 3 && i == 3 ) ||
                     ( j == 2 && i == 4 ) ||
                     ( j == 1 && i == 5 )
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("lol");
            System.out.println("");
        }

        for ( int i = 0; i < 10; i++ ) {
            System.out.print("List " + i + " = ");
            if ( !input.hasNextInt() ) {
                System.out.println("Str");
                listJava.add(input.next());
            } else {
                listJava.add(input.nextInt());
            }
        }

        for ( int j = 0; j < listJava.size(); j++) {
            System.out.println("Index " + j + " = " + listJava.get(j));
        }
    }

}

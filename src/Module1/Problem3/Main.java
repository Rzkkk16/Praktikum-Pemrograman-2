package Module1.Problem3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int N = input.nextInt();
        int Number = input.nextInt();
        int count = 1;
        int TempNumber = 0;

        do {
            if ( Number % 2 == 0 ) {
                Number++;
            } else {
                System.out.print(Number + (count == N ? "" : ","));
                Number++;
                count++;
            }
        } while (count <= N);
    }
}

package module1.problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int Number = input.nextInt();
        int n = 0;
        int TempNumber = 0;

        while ( n <= 10 ) {
            if ( Number % 5 == 0) {
                TempNumber = Number / 5 - 1;
                System.out.print(TempNumber + (n == 10 ? "" : ","));
            } else {
                System.out.print(Number + (n == 10 ? "" : ","));
            }

            Number++;
            n++;
        }
    }
}
package Module1.Problem4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Character> Abu = new ArrayList<>();
        ArrayList<Character> Bagas = new ArrayList<>();

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            char c = input.next().charAt(0);
            Abu.add(c);
        }
        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            char c = input.next().charAt(0);
            Bagas.add(c);
        }

        int AbuPoint = 0;
        int BagasPoint = 0;

        for (int i = 0; i < 3; i++) {
            int AbuHand = Abu.get(i);
            int BagasHand = Bagas.get(i);


            if ( AbuHand == 'G' && BagasHand == 'K' || AbuHand == 'K'&& BagasHand == 'B' || AbuHand == 'B' && BagasHand == 'G') {
                AbuPoint++;
            } else if ( AbuHand == 'K' && BagasHand == 'G' || AbuHand == 'B'&& BagasHand == 'K' || AbuHand == 'G' && BagasHand == 'B') {
                BagasPoint++;
            } else {
                AbuPoint++;
                BagasPoint++;
            }
        }

        if ( AbuPoint > BagasPoint ) {
            System.out.println("Abu");
        } else if (AbuPoint < BagasPoint) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
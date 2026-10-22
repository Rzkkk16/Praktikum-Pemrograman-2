package module4.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan : ");

        int choice = scanner.nextInt();
        String buffer = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nama Hewan Peliharaan : ");
            String name = scanner.nextLine();
            System.out.print("Ras : ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu : ");
            String featherColour = scanner.nextLine();

            Cat cat = new Cat(name, breed, featherColour);

            cat.displayCatDetail();
        }
        if (choice == 2) {
            System.out.print("Nama Hewan Peliharaan : ");
            String name = scanner.nextLine();
            System.out.print("Ras : ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu : ");
            String featherColour = scanner.nextLine();
            System.out.print("Kemampuan : ");
            String skill = scanner.nextLine();

            Dog dog = new Dog(name, breed, featherColour, skill);

            dog.displayDogDetail();
        }
    }
}

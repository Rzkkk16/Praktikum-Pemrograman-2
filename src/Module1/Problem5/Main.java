package Module1.Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        float Radius = input.nextFloat();

        System.out.print("Masukkan tinggi: ");
        float Diameter = input.nextFloat();

        double TubeVolume = PHI * Radius * Radius * Diameter;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", Radius, Diameter, TubeVolume);
    }
}
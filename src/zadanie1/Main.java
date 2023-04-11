package zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj długość średnicy okręgu = ");
            float diameter = scan.nextFloat();
            calculateCircuit(diameter);
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }

    public static void calculateCircuit(float diameter) {
        float pi = 3.14F;
        System.out.println("Obwód okręgu wynosi = " + (diameter * pi));
        System.out.println("Obwód okręgu wynosi (z użyciem klasy Math) = " + (diameter * Math.PI));
    }
}

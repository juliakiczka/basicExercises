package zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj współczynnik a = ");
            int a = scan.nextInt();
            System.out.print("Podaj współczynnik b = ");
            int b = scan.nextInt();
            System.out.print("Podaj współczynnik c = ");
            int c = scan.nextInt();
            int delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta ujemna!");
                break;
            } else if (delta == 0) {
                float x0 = -b / (2f * a);
                System.out.println("Delta = " + delta);
                System.out.println("x0 = " + x0);
            } else {
                float x1 = (float) (-b + Math.sqrt(delta) / (2 * a));
                float x2 = (float) (-b - Math.sqrt(delta) / (2 * a));
                System.out.println("Delta = " + delta);
                System.out.printf("x1 = %f, x2 = %f", x1, x2);
                System.out.println();
            }
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }
}

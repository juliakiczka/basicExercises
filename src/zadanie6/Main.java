package zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę = ");
            int n = scan.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + 1.0 / i;
            }
            System.out.println("Suma szeregu harmonicznego wynosi = " + sum);
            System.out.println("Metoda wyliczyła = " + calculateSeries(n));
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }

    public static float calculateSeries(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1f / i;
        }
        return sum;
    }
}

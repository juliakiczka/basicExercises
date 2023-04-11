package zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę = ");
            int number = scan.nextInt();
            System.out.println("Liczby pierwsze: ");
            for (int i = 2; i < number; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(i);
                }
            }
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }

    }
}

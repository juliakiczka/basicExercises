package zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj jakąś liczbę = ");
            int number = scan.nextInt();
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("Pif paf");
                    continue;
                } else if (i % 3 == 0) {
                    System.out.println("Pif");
                    continue;
                } else if (i % 7 == 0) {
                    System.out.println("Paf");
                    continue;
                } else {
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

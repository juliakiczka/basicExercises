package zadanie9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę = ");
            int period = scan.nextInt();
            int height = scan.nextInt();
            for (int i = 0; i < period; i++) {
                for (int j = 0; j < height; j++) {
                    for (int k = 0; k < 2 * height + 1; k++) {
                        if (k == i || k == 2 * height - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
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

package zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę = ");
            int number = scan.nextInt();
            System.out.println("Ciąg Fibonacciego wynosi = " + calculateFibonacci(number));
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }

    public static int calculateFibonacci(int numberOfIndex) {
        int previous = 1;
        int present = 1;
        if (numberOfIndex == 1 || numberOfIndex == 2) {
            return 1;
        } else {
            for (int i = 2; i < numberOfIndex; i++) {
                int next = present + previous;
                previous = present;
                present = next;
            }
            return present;
        }

    }

}

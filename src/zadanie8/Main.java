package zadanie8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj pierwszą liczbę = ");
            int number1 = scan.nextInt();
            System.out.print("Podaj jeden ze znaków ('+' '-' '/' '*') = ");
            char operation = scan.next().charAt(0);
            System.out.print("Podaj drugą liczbę = ");
            int number2 = scan.nextInt();
            switch (operation) {
                case '+':
                    System.out.println("Wynik dodawania = " + (number1 + number2));
                    break;
                case '-':
                    System.out.println("Wynik odejmowania = " + (number1 - number2));
                    break;
                case '/':
                    System.out.println("Wynik dzielenia = " + (number1 / number2));
                case '*':
                    System.out.println("Wynik mnożenia = " + (number1 * number2));
                    break;

            }

            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }
}

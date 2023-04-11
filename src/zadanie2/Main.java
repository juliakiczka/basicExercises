package zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj wagę w kilogramach = ");
            float weight = scan.nextFloat();
            System.out.print("Podaj wzrost w centymetrach = ");
            int height = scan.nextInt();
            calculateBMI(weight, height);
            System.out.println("Zakończyć program? (0 = nie 1 = tak)");
            int answer = scan.nextInt();
            if (answer == 1) {
                break;
            }
        }
    }

    public static void calculateBMI(float weight, int height) {
        float newHeight = height / 100f;
        double BMI = weight / (newHeight * newHeight);
        System.out.println("Twoje BMI wynosi = " + BMI);
        if (BMI <= 24.9 && BMI >= 18.5) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
    }
}

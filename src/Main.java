//Егор, ты прошел 6/21 урок.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        float num1 = scan.nextFloat();

        System.out.println("Введите число 2: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: ");

        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }
}
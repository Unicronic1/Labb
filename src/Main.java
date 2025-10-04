//Егор, ты прошел 6/21 урок.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch(action){
            case "+":
                res = num1 + num2;
                System.out.println(res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println(res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else{
                res = num1 / num2;
                System.out.println(res);}

                break;

        }
    }
}
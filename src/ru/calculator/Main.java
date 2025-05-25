package ru.calculator;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введи первое число");
        BigDecimal a = scanner.nextBigDecimal();

        System.out.println("введи второе число");
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println("выбери действие: +, -, *, /");
        char action = scanner.next().charAt(0);

        BigDecimal result;

        switch(action){
            case '+':
                result = a.add(b);
                System.out.println("результат: " + result);
                break;
            case '-':
                result = a.subtract(b);
                System.out.println("результат: " + result);
                break;
            case '*':
                result = a.multiply(b);
                System.out.println("результат: " + result);
                break;
            case '/':
                if (!b.equals(BigDecimal.valueOf(0)))
                {
                    result = a.divide(b,10, RoundingMode.DOWN);
                    System.out.println("результат: " + result);
                }else
                {
                    System.out.println("ошибка деления на ноль");
                }
                break;
            default:
                System.out.println("ошибка ввода");
                break;
        }





    }
}

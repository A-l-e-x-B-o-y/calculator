package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        int a, b, result = 0;
        String sign = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Для выхода из калькулятора введите: \"exit\".");
        System.out.println("Калькулятор принимает числа от 1 до 10.");
        while (true) {
            String string = reader.readLine();
            if (string.equals("exit")) break;

            String[] numbers = string.split(" ");
            if (numbers.length < 3) {
                System.err.println("Не корректный ввод данных!");
                break;
            }

            try {
                a = Integer.parseInt(numbers[0]);
                sign = numbers[1];
                b = Integer.parseInt(numbers[2]);
                result = Actions.ActionsInt(a, b, sign);
                System.out.println(result);
            } catch (Exception e) {
                a = Conversion.RomanToArabic(numbers[0]);
                sign = numbers[1];
                b = Conversion.RomanToArabic(numbers[2]);

                try {
                    result = Actions.ActionsInt(a, b, sign);
                } catch (Exception Exception) {
                    System.err.println(e.getMessage());
                    break;
                }

                System.out.println(Conversion.ArabicToRoman(result));
            }

        }
    }
}

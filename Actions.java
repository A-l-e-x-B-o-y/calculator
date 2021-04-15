package com.company;

public class Actions {

    public static int ActionsInt(int a, int b, String sign) throws Exception {
        int result = 0;

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Вы ввели не верное значение!");
        }

        if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
            if (sign.equals("+")) result = a + b;
            if (sign.equals("-")) result = a - b;
            if (sign.equals("*")) result = a * b;
            if (sign.equals("/")) result = a / b;
        } else {
            throw new Exception("Не верное арифметическое действие!");
        }

        return result;
    }
}
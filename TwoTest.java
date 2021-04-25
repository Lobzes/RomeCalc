package Test;

import Test.Algebra.*;

public class TwoTest {
    public static void TwoTest(String firstString, String arithmetic, String secondString) {

        int first = 0;
        int second = 0;
        int result = 0;

        boolean flag = false;
        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                first = ThreeTest.toArabic(firstString);
                second = ThreeTest.toArabic(secondString);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");

            }
        }
        if (first < 1 || first > 10 || second < 1 || second > 10) {
            System.out.println("Вы ввели неверные данные");
            System.exit(0);
        }
        Act action;
        if (arithmetic.equals("-")) {
            action = new Subs();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("*")) {
            action = new Multi();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("/")) {
            action = new Divis();
            result = action.invoke(first, second);
        }
        if (arithmetic.equals("+")) {
            action = new Add();
            result = action.invoke(first, second);
        }
        if (flag) {
            String roman = ThreeTest.toRoman(result);
            System.out.println(roman);

        } else System.out.println(result);
    }
}

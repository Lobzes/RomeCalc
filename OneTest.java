package Test;



import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Test.TwoTest;
import Test.ThreeTest;

public class OneTest {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите данные: в формате число действие. Пробелы обязательны");
        System.out.println("Я понимаю как арабские так и римские цифры");
        System.out.println("Числа от 1-10 и I-X");

        List<String>list = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        try {
            for (String retval : input.split(" ", 50)) {
                list.add(retval);
            }
           TwoTest.TwoTest(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Данные не верны, читайте условие");
        }
        System.exit(0);


    }
}


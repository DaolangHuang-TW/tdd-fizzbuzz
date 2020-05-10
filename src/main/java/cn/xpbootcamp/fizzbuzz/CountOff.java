package cn.xpbootcamp.fizzbuzz;

import java.util.ArrayList;

public class CountOff {
    ArrayList<Integer> sortStudentBy(Integer count) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= count; i++) {
            list.add(i);
        }
        return list;
    }

    Boolean multipleOf3(Integer number) {
        return number%3 == 0;
    }

    Boolean multipleOf5(Integer number) {
        return number%5 == 0;
    }

    Boolean multipleOf7(Integer number) {
        return number%7 == 0;
    }

    String countOfByContains(Integer number) {
        Boolean contains3 = number.toString().contains("3");
        Boolean contains5 = number.toString().contains("5");
        Boolean contains7 = number.toString().contains("7");

        if (contains3 && !contains5 && !contains7) {
            // only contains 3
            return countOffWhenContains3(number);
        } else if (contains3 && contains5 && !contains7) {
            // 3 5
            return countOffWhenContains5(number);
        } else if (contains3 && !contains5 && contains7) {
            // 3 7
            return countOffWhenContains3(number);
        } else if (!contains3 && contains5 && !contains7) {
            // 5
            return countOffWhenContains5(number);
        } else if (!contains3 && contains5 && contains7) {
            // 5 7
            return countOffWhenContains7(number);
        } else if (!contains3 && !contains5 && contains7) {
            // 7
            return countOffWhenContains7(number);
        } else if (contains3 && contains5 && contains7) {
            // 3 5 7
            return countOffWhenContains7(number);
        } else {
            // none
            return countOffByMultiple(number, 0);
        }
    }

    String countOffWhenContains3(Integer number) {
        return "Fizz";
    }

    String countOffWhenContains5(Integer number) {
        return countOffByMultiple(number, 3);
    }

    String countOffWhenContains7(Integer number) {
        return countOffByMultiple(number, 5);
    }

    String countOffByMultiple(Integer number, Integer ignoreMultiple) {
        String numberStr = "";


        if (ignoreMultiple != 3 && multipleOf3(number)) {
            numberStr = "Fizz";
        }

        if (ignoreMultiple != 5 && multipleOf5(number)) {
            numberStr += "Buzz";
        }

        if (ignoreMultiple != 7 && multipleOf7(number)) {
            numberStr += "Whizz";
        }

        if (numberStr.isEmpty()) {
            numberStr = number.toString();
        }

        return numberStr;
    }
}

package com.griddynamics.jetbulb.interview;

/*
Реализуйте функцию fizzbusstest, которая байтовый массив.
Массив формируется по следующим правилам:
- функция принимает аргумент в виде целого числа
- если число кратно трем, то в массив заносим слово Fizz
- если число кратно пяти, то в массив заносим слово Buzz
- если число кратно трем, и пяти, то в массив заносим слово FizzBuzz
- если число не кратно ни одному из этим чисел, то необходимо выбросить IllegalArgumentException

 Решение необходимо покрыть тестами

 */
public class FizzBuzzTestInterview {

    public byte[] FizzBuzzTest(int value) {
        String result = "";
//        if (value % 3 == 0 && value % 5 == 0) {
//            return "FizzBuzz".getBytes();
//        } else if (value % 3 == 0) {
//            return "Fizz".getBytes();
//        } else if (value % 5 == 0) {
//            return "Buzz".getBytes();
//        } else {
//            throw new IllegalArgumentException("Not implemented yet");
//        }
        if (value % 3 == 0) {
            result += "Fizz";
        }
        if (value % 5 == 0) {
            result += "Buzz";
        }

        if (result.isEmpty()) {
            throw new IllegalArgumentException("Not implemented yet");
        }
        return result.getBytes();
    }
}

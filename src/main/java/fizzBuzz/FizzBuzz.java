package fizzBuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public String of(int number) {
        if (is(number).multipleOf(15)) return "FizzBuzz";
        if (is(number).multipleOf(3)) return "Fizz";
        if (is(number).multipleOf(5)) return "Buzz";
        return valueOf(number);
    }

    private Calculator is(int number) {
        return (factor -> number % factor == 0);
    }

    private interface Calculator {
        boolean multipleOf(int factor);
    }
}

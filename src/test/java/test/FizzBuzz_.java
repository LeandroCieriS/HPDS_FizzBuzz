package test;

import fizzBuzz.FizzBuzz;
import org.junit.Test;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void should_return_number_when_receives_non_3_or_5_multiple(){
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_receives_3_multiple(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_receives_5_multiple(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_receives_15_multiple(){
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

}

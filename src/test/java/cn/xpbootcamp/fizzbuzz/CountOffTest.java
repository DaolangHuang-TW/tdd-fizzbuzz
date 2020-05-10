package cn.xpbootcamp.fizzbuzz;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOffTest {
    CountOff util = new CountOff();
    /*Before Class*/
    @org.junit.jupiter.api.Test
    void should_return_Fizz_given_number_is_multiple_of_3_when_count_off() {
        assertEquals(util.countOffByMultiple(3, 0), "Fizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_Buzz_given_number_is_multiple_of_5_when_count_off() {
        assertEquals(util.countOffByMultiple(5, 0), "Buzz");
    }

    @org.junit.jupiter.api.Test
    void should_return_Whizz_given_number_is_multiple_of_7_when_count_off() {
        assertEquals(util.countOffByMultiple(7, 0), "Whizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_FizzBuzz_given_number_is_multiple_of_3_and_5_when_count_off() {
        assertEquals(util.countOffByMultiple(15, 0), "FizzBuzz");
    }

    @org.junit.jupiter.api.Test
    void should_return_BuzzWhizz_given_number_is_multiple_of_5_and_7_when_count_off() {
        assertEquals(util.countOffByMultiple(35, 0), "BuzzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_FizzWhizz_given_number_is_multiple_of_3_and_7_when_count_off() {
        assertEquals(util.countOffByMultiple(21, 0), "FizzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_FizzBuzzWhizz_given_number_is_multiple_of_3_5_7_when_count_off() {
        assertEquals(util.countOffByMultiple(105, 0), "FizzBuzzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_self_given_number_is_not_multiple_of_3_5_7_when_count_off() {
        assertEquals(util.countOffByMultiple(2, 0), "2");
    }

    @org.junit.jupiter.api.Test
    void should_return_Fizz_given_number_is_contains_3_when_count_off() {
        assertEquals(util.countOfByContains(13), "Fizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_self_given_number_is_contains_3_and_5_when_count_off() {
        assertEquals(util.countOfByContains(51), "51");
    }

    @org.junit.jupiter.api.Test
    void should_return_Buzz_given_number_is_contains_5_when_count_off() {
        assertEquals(util.countOfByContains(50), "Buzz");
    }

    @org.junit.jupiter.api.Test
    void should_return_Whizz_given_number_is_contains_5_and_is_multiple_of_7_when_count_off() {
        assertEquals(util.countOfByContains(56), "Whizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_BuzzWhizz_given_number_is_contains_3_and_5_and_it_is_multiple_of_5_and_7_when_count_off() {
        assertEquals(util.countOfByContains(35), "BuzzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_self_given_number_is_contains_7_and_ignore_is_a_multiple_of_5_when_count_off() {
        assertEquals(util.countOfByContains(715), "715");
    }

    @org.junit.jupiter.api.Test
    void should_return_Whizz_given_number_is_contains_7_and_is_multiple_of_7_when_count_off() {
        assertEquals(util.countOfByContains(77), "Whizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_Fizz_given_number_is_contains_5_and_7_can_not_ignore_is_a_multiple_of_3_when_count_off() {
        assertEquals(util.countOfByContains(75), "Fizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_Fizz_given_number_is_contains_3_and_7_ignore_is_a_multiple_of_7_and_3_when_count_off() {
        assertEquals(util.countOfByContains(472392), "Fizz");
    }

    @org.junit.jupiter.api.Test
    void should_return_FizzWhizz_given_number_is_contains_3_5_7_ignore_is_a_multiple_of_5_when_count_off() {
        assertEquals(util.countOfByContains(735), "FizzWhizz");
    }
}
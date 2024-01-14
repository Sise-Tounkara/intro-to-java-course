package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "The calculator should")
public class FizzBuzzTest {
    @Test
    @DisplayName("return Fizz when the integer is a multiple of 3")
    public void returnsFizz() {
        String result = FizzBuzz.get(9);

        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("return Buzz when the integer is a multiple of 5")
    public void returnsBuzz() {
        assertEquals("Buzz",FizzBuzz.get(5));
    }

    @Test
    @DisplayName("return FizzBuzz when the integer is a multiple of 15")
    public void returnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("return the integer as a string if it is not a multiple of 3, 5, or 15")
    public void returnsIntegerAsString() {
        assertEquals("2", FizzBuzz.get(2));
    }
}

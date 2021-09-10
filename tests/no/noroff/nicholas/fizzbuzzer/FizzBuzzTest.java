package no.noroff.nicholas.fizzbuzzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void convert_nonFizzBuzzNumber_ShouldReturnNum() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        String expected = "1";
        // Act
        String actual = fizzBuzz.ConvertFizzBuzz(number);
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    void convert_fizzNumber_ShouldReturnFizz(){
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expected = "Fizz";
        // Act
        String actual = fizzBuzz.ConvertFizzBuzz(number);
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    void convert_buzzNumber_ShouldReturnBuzz(){
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expected = "Buzz";
        // Act
        String actual = fizzBuzz.ConvertFizzBuzz(number);
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    void convert_FizzBuzzNumber_ShouldReturnFizzBuzz(){
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expected = "FizzBuzz";
        // Act
        String actual = fizzBuzz.ConvertFizzBuzz(number);
        // Assert
        assertEquals(expected,actual);
    }
}
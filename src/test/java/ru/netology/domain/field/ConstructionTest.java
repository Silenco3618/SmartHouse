package ru.netology.domain.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructionTest {
    @Test
    public void increaseNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentNumber(15);

        radio.increaseNumber();

        int expected = 15;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentNumber(21);

        radio.increaseNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentNumber(20);

        radio.increaseNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSmallerNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentNumber(19);

        radio.increaseNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
}

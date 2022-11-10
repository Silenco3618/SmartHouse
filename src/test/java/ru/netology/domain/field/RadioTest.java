package ru.netology.domain.field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void mustSizeNumber() {
        Radio cond = new Radio(20);

        Assertions.assertEquals(0, cond.getMinNumber());
        Assertions.assertEquals(20, cond.getMaxNumber());
        Assertions.assertEquals(0, cond.getCurrentNumber());
    }

    Radio cond = new Radio();

    @Test
    public void shouldSmallerNumber() {

        cond.setCurrentNumber(-1);
        int expected = 10;
        int actual = cond.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSmallerVolume() {

        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumber() {

        cond.setCurrentNumber(5);
        int expected = 5;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        cond.setCurrentVolume(5);
        int expected = 5;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumber() {

        cond.setCurrentNumber(0);
        cond.increaseNumber();
        int expected = 1;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberMax() {

        cond.setCurrentNumber(10);
        cond.increaseNumber();
        int expected = 0;
        int actual = cond.getMinNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        cond.setCurrentVolume(0);
        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumber() {

        cond.setCurrentNumber(0);
        cond.decreaseNumber();
        int expected = 10;
        int actual = cond.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        cond.setCurrentVolume(0);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberAboveMax() {

        cond.setCurrentNumber(20);
        int expected = 0;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        cond.setCurrentVolume(200);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSmallerMinNumber() {

        cond.setCurrentNumber(2);
        cond.decreaseNumber();
        int expected = 1;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSmallerMinVolume() {

        cond.setCurrentVolume(2);
        cond.decreaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

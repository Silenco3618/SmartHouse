import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSmallerNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-1);
        int expected = 0;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSmallerVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);
        int expected = 5;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        int expected = 5;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);
        cond.increaseNumber();
        int expected = 1;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);
        cond.decreaseNumber();
        int expected = 0;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentNumber(20);
        int expected = 0;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(20);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseSmallerMinNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(2);
        cond.decreaseNumber();
        int expected = 1;
        int actual = cond.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseSmallerMinVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(2);
        cond.decreaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

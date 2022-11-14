import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.field.Radio;

public class RadioTest {

    @Test
    public void shouldNextNumber() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);

        cond.increaseNumber();

        int expected = 6;
        int actual = cond.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentNumber(9);

        cond.increaseNumber();

        int expected = 0;
        int actual = cond.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNumberUnderMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);

        cond.decreaseNumber();

        int expected = 9;
        int actual = cond.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceNumberAboveMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);

        cond.decreaseNumber();

        int expected = 4;
        int actual = cond.getCurrentNumber();

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
    public void setNextNumberAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentNumber(10);

        int expected = 0;
        int actual = cond.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextNumberUnderMin() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-1);

        int expected = 0;
        int actual = cond.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }






    @Test
    public void shouldNextVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);

        cond.increaseVolume();

        int expected = 6;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);

        cond.decreaseVolume();

        int expected = 4;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextVolumeUnderMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolumeAboveMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
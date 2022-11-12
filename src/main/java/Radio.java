public class Radio {

    public int currentNumber;
    public int currentVolume;



    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 9) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > 10) {
            return;
        }
        if (newCurrentNumber < 0) {
            return;
        }
        this.currentNumber = newCurrentNumber;
    }

    public void increaseNumber() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
    }

    public void decreaseNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

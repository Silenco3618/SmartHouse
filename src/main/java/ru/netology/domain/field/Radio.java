package ru.netology.domain.field;
public class Radio {
    private int minNumber;
    private int maxNumber;

    private int currentNumber;
    private int currentVolume;

    public Radio() {
        maxNumber = 10;
    }

    public Radio(int sizeNumber) {
        maxNumber = minNumber + sizeNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
    public int getMinNumber() {
        return minNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > maxNumber) {
            newCurrentNumber = minNumber;
        }
        if (newCurrentNumber < 0) {
            newCurrentNumber = maxNumber;
        }
        this.currentNumber = newCurrentNumber;
    }

    public void increaseNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        }
    }

    public void decreaseNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}

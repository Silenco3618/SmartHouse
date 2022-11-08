package ru.netology.domain.field;
public class Radio {
    public int minNumber = 0;
    public int maxNumber = 10;
    public int currentNumber;
    public int currentVolume;

    public int getMaxNumber() {
        return maxNumber;
    }
    public int getMinNumber() {
        return minNumber;
    }

    public Radio(int maxNumber, int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
        this.currentNumber = minNumber;
    }
    public Radio(int sizeNumber) {
        maxNumber = minNumber + sizeNumber;
    }
    public Radio() {
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
        currentVolume = newCurrentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > maxNumber) {
            newCurrentNumber = minNumber;
        }
        if (newCurrentNumber < 0) {
            newCurrentNumber = maxNumber;
        }
        currentNumber = newCurrentNumber;
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

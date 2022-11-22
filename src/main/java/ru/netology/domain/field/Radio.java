package ru.netology.domain.field;

public class Radio {

    private int currentNumber;
    private int currentVolume;
    private int maxNumber;

    public Radio() {
        maxNumber = 9;

    }
    public Radio(int countNumber) { //количество станций
        maxNumber = countNumber - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        } else {
            currentVolume = 9;
        }
    }
    public void increaseNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber;
        } else  {
            currentNumber = 0;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void decreaseNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }
}
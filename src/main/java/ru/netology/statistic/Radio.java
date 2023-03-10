package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 9;
    }
    public Radio(int stationsCount, int volumeCount) {
        maxStation = stationsCount - 1;
        maxVolume = volumeCount -1;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void nextVol() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void prevVol() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }
}





package ru.netology;

public class Radio {
    int minStation = 0;
    int maxStation = 9;
    public int currentStation;
    int minVolume = 0;
    int maxVolume = 10;
    public int currentVolume;

    public void setmanualInstalationStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < 10) {
            return;
        }
        if (currentStation > maxStation)
            currentStation = minStation;
        {
            return;
        }
    }

    public void buttonNextStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < 10) {
            currentStation = currentStation + 1;
            {
                if (currentStation > maxStation)
                    currentStation = minStation;
                {
                    return;
                }


            }
        }
        if (currentStation >= 10) {
            currentStation = minStation;
        }
        return;
    }


    public void buttonPrevStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < 10) {
            currentStation = currentStation - 1;
            {
                if (currentStation < minStation)
                    currentStation = maxStation;
                {
                    return;
                }
            }
        }
        if (currentStation >= 10) {
            currentStation = maxStation-1;
        }
        return;
    }

    public void buttonIncreaseTheVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            {
                if (currentVolume > maxVolume)
                    currentVolume = maxVolume;
                {
                    return;
                }
            }

        }
        if (currentVolume > maxVolume)
            currentVolume = maxVolume;
        {
            return;
        }

    }

    public void buttonLowerTheVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
            {
                if (currentVolume < minVolume)
                    currentVolume = minVolume;
                {
                    return;
                }
            }

        }
        if (currentVolume > maxVolume)
            currentVolume = maxVolume - 1;
        {
            return;
        }
    }
}

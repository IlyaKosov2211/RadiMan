package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void manualInstalationStation() {
        Radio station = new Radio();
        station.setmanualInstalationStation(8);
        int actual = station.currentStation;
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void buttonNextStation() {
        Radio station = new Radio();
        int currentStation = 9;
        station.buttonNextStation(currentStation);
        int actual = station.currentStation;
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void buttonPrevStation() {
        Radio station = new Radio();
        int currentStation = 9;
        station.buttonPrevStation(currentStation);
        int actual = station.currentStation;
        int expected = 8;
        assertEquals(expected, actual);


    }

    @Test
    void buttonIncreaseTheVolume() {
        Radio volume = new Radio();
        int currentVolume = 7;
        volume.buttonIncreaseTheVolume(currentVolume);
        int actual = volume.currentVolume;
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolume() {
        Radio volume = new Radio();
        int currentVolume = 8;
        volume.buttonLowerTheVolume(currentVolume);
        int actual = volume.currentVolume;
        int expected = 7;
        assertEquals(expected, actual);
    }
}
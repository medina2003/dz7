package com.example.dz7;

public class Music {
    private String personName;
    private String musicName;
    private String numberMusic;
    private String timeMusic;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getNumberMusic() {
        return numberMusic;
    }

    public void setNumberMusic(String numberMusic) {
        this.numberMusic = numberMusic;
    }

    public String getTimeMusic() {
        return timeMusic;
    }

    public void setTimeMusic(String timeMusic) {
        this.timeMusic = timeMusic;
    }

    public Music(String personName, String musicName, String numberMusic, String timeMusic) {
        this.personName = personName;
        this.musicName = musicName;
        this.numberMusic = numberMusic;
        this.timeMusic = timeMusic;
    }
}

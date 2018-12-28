package scores.com.fld.ui.livescores.models;

import android.support.annotation.NonNull;

public class Game {
    private String firstTeam;
    private String secondTeam;
    private String score;
    private String minute;


    public Game(@NonNull String firstTeam, @NonNull String secondTeam, @NonNull String score, @NonNull String minute) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.score = score;
        this.minute = minute;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}

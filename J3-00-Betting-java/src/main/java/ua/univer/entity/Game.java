package ua.univer.entity;

public class Game {
    private String team1;
    private String team2;
    private int scoreTeam1;
    private int scoreTeam2;

    public Game() {
        this("", "");
    }

    public Game(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setGameScore(int scoreTeam1, int scoreTeam2){
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public String getWinner(){
        return "";
    }
}

package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int gamesPlayed;
    private static int totalGoals;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int Otherscore){
        if(myScore > Otherscore){
            this.wins += 1;
            other.losses += 1;
        }
        else if(myScore < Otherscore){
            this.losses += 1;
            other.wins += 1;
        }
        else if(myScore == Otherscore){
            this.ties += 1;
            other.ties += 1;
        }
        gamesPlayed += 1;
        totalGoals += myScore + Otherscore;
    }

    public int getPoints(){
        int a = this.wins * 3;
        int b = this.ties;
        return a+b;
    }

    public void startTournament(){

    }

    public void reset(){
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }
    public static void main(String[] args) {
        SoccerTeam one = new SoccerTeam();
        SoccerTeam two = new SoccerTeam();
        SoccerTeam three = new SoccerTeam();
        SoccerTeam four = new SoccerTeam();
        one.played(two, 5, 4 );
        one.played(three, 1, 1);
        System.out.println(one.wins);
        System.out.println(one.wins);
        System.out.println(one.getPoints());
        System.out.println(two.losses);
    }
}

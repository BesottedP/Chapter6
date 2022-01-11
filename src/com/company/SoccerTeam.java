package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int gamesPlayed = 0;
    private static int totalGoals = 0;

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
        if(myScore < Otherscore){
            this.losses += 1;
            other.wins += 1;
        }
        if(myScore == Otherscore){
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

    public void reset(){
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public static int goalsScored(){
        return totalGoals;
    }

    public static int games(){
        return gamesPlayed;
    }

    public static void startTournament(){
        totalGoals = 0;
        gamesPlayed = 0;
    }

    public static void main(String[] args) {
        SoccerTeam apple = new SoccerTeam();
        SoccerTeam banana = new SoccerTeam();
        SoccerTeam cucumber = new SoccerTeam();
        SoccerTeam dragonFruit = new SoccerTeam();

        System.out.println("Tournament 1");
        apple.played(banana, 5, 2);
        apple.played(cucumber, 1, 3);
        apple.played(dragonFruit,4, 3);
        banana.played(cucumber, 1, 5);
        banana.played(dragonFruit, 3, 3);
        cucumber.played(dragonFruit, 2, 4);

        System.out.println("Team apple scored " + apple.getPoints() + " points");
        System.out.println("Team banana scored " + banana.getPoints() + " points");
        System.out.println("Team cucumber" + " scored " + cucumber.getPoints() + " points");
        System.out.println("Team dragonFruit" + " scored " + dragonFruit.getPoints() + " points");
        System.out.println("Total goals scored: " + goalsScored());
        System.out.println("Total games played: " + games());

        startTournament();
        apple.reset();
        banana.reset();
        cucumber.reset();
        dragonFruit.reset();
        System.out.println();
        System.out.println("Tournament 2");

        apple.played(banana, 5, 3);
        apple.played(cucumber, 6, 1);
        apple.played(dragonFruit,0, 6);
        banana.played(cucumber, 2, 4);
        banana.played(dragonFruit, 5, 6);
        cucumber.played(dragonFruit, 1, 0);

        System.out.println("Team apple scored " + apple.getPoints() + " points");
        System.out.println("Team banana scored " + banana.getPoints() + " points");
        System.out.println("Team cucumber" + " scored " + cucumber.getPoints() + " points");
        System.out.println("Team dragonFruit" + " scored " + dragonFruit.getPoints() + " points");
        System.out.println("Total goals scored: " + goalsScored());
        System.out.println("Total games played: " + games());

    }
}

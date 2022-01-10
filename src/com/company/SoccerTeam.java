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

    public void reset(){
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public static int goalsScored(){
        return totalGoals;
    }

    public static int Games(){
        return gamesPlayed;
    }

    public static void startTournament(){
        totalGoals = 0;
        gamesPlayed = 0;
    }

    public static void main(String[] args) {
        SoccerTeam one = new SoccerTeam();
        SoccerTeam two = new SoccerTeam();
        SoccerTeam three = new SoccerTeam();
        SoccerTeam four = new SoccerTeam();

        System.out.println("Tournament 1");
        one.played(two, 5, 2);
        one.played(three, 1, 3);
        one.played(four,4, 3);
        two.played(three, 1, 5);
        two.played(four, 3, 3);
        three.played(four, 2, 4);

        System.out.println("Team one scored " + one.getPoints() + " points");
        System.out.println("Team two scored " + two.getPoints() + " points");
        System.out.println("Team three scored " + three.getPoints() + " points");
        System.out.println("Team four scored " + four.getPoints() + " points");
        System.out.println("Total goals scored: " + totalGoals);
        System.out.println("Total games played: " + gamesPlayed);

        startTournament();
        one.reset();
        two.reset();
        three.reset();
        four.reset();
        System.out.println();
        System.out.println("Tournament 2");

        one.played(two, 5, 3);
        one.played(three, 6, 1);
        one.played(four,0, 6);
        two.played(three, 2, 4);
        two.played(four, 5, 6);
        three.played(four, 1, 0);

        System.out.println("Team one scored " + one.getPoints() + " points");
        System.out.println("Team two scored " + two.getPoints() + " points");
        System.out.println("Team three scored " + three.getPoints() + " points");
        System.out.println("Team four scored " + four.getPoints() + " points");
        System.out.println("Total goals scored: " + totalGoals);
        System.out.println("Total games played: " + gamesPlayed);

    }
}

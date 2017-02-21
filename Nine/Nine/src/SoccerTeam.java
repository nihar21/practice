/**
22
 */
public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;

    private static int totalGames = 0;
    private static int totalGoals = 0;

    public void played(SoccerTeam other, int myScore, int otherScore) {
        totalGames++;
        if (myScore > otherScore) {
            this.wins++;
            other.losses++;
        } else if (myScore < otherScore) {
            this.losses++;
            other.wins++;
        } else {
            this.ties++;
            other.ties++;
        }
        totalGoals += myScore + otherScore;
    }

    public int getPoints() {
        return wins * 3 + ties;
    }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static void startTournament() {
        totalGames = 0;
        totalGoals = 0;
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public static void setTotalGames(int totalGames) {
        SoccerTeam.totalGames = totalGames;
    }

    public static int getTotalGoals() {
        return totalGoals;
    }

    public static void setTotalGoals(int totalGoals) {
        SoccerTeam.totalGoals = totalGoals;
    }

    public static void main(String[] args) {
        SoccerTeam Barcelona = new SoccerTeam();
        SoccerTeam RedBulls = new SoccerTeam();
        SoccerTeam KittyCats = new SoccerTeam();
        SoccerTeam Chickens = new SoccerTeam();

        Barcelona.played(KittyCats, 3, 6);
        Barcelona.played(RedBulls, 0, 0);
        Barcelona.played(Chickens, 6, 0);

        KittyCats.played(RedBulls, 10, 2);
        KittyCats.played(Chickens, 15, 3);

        RedBulls.played(Chickens, 2, 2);

        System.out.println("Total Games: " + totalGames);
        System.out.println("Total Goals: " + totalGoals);

        System.out.println("Barcelona: " + Barcelona.getPoints() + " points");
        System.out.println("RedBulls: " + RedBulls.getPoints() + " points");
        System.out.println("KittyCats: " + KittyCats.getPoints() + " points");
        System.out.println("Chickens: " + Chickens.getPoints() + " points");
        
        Barcelona.reset();
        RedBulls.reset();
        KittyCats.reset();
        Chickens.reset();
        startTournament();
        System.out.println("Restarting!");





        Barcelona.played(KittyCats, 3, 6);
        Barcelona.played(RedBulls, 0, 0);
        Barcelona.played(Chickens, 6, 0);

        KittyCats.played(RedBulls, 10, 2);
        KittyCats.played(Chickens, 15, 3);

        RedBulls.played(Chickens, 2, 2);

        System.out.println("Total Games: " + totalGames);
        System.out.println("Total Goals: " + totalGoals);

        System.out.println("Barcelona: " + Barcelona.getPoints() + " points");
        System.out.println("RedBulls: " + RedBulls.getPoints() + " points");
        System.out.println("KittyCats: " + KittyCats.getPoints() + " points");
        System.out.println("Chickens: " + Chickens.getPoints() + " points");

        Barcelona.reset();
        RedBulls.reset();
        KittyCats.reset();
        Chickens.reset();
        startTournament();
    }
}

public class charExample {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aaron ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", highScorePosition);


        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Paul ", highScorePosition);


        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Donna ", highScorePosition);

    }



    public static void displayHighScorePosition(String player, int highScore) {
        System.out.println(player + "managed to get into position " + highScore + "    on the high score table");
    }



    public static int calculateHighScorePosition(int player_score) {


        if(player_score >= 1000) {
            return 1;
        } else {
            if(player_score >= 500 && player_score < 1000) {
                return 2;
            } else {
                if(player_score >= 100 && player_score < 500) {
                    return 3;
                } else {
                    return 4;
                }
            }
        }

    }
}
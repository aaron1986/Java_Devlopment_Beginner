//Create a method called displayHighScorePosition.
//public static void displayHighScorePosition(){}

//It should have 'player' as the first parameter, a second parameter as a position in the highScore table.
//public static void displayHighScorePosition(String player, int highScore){}

//You should display the player name along with a message "Managed to get into position" and the position they got with afurther messge "on the high Score table".
//public static void displayHighScorePosition(String player, int highScore) {
        //System.out.println(player + "managed to get into position " + highScore + "    on the high score table");
    //}

//Create a second method called 'calculateHighScorePosition.
//public static int calculateHighScorePosition(int player_score) {}

//It should be sent one parameter (argument) - playerScore.
//public static int calculateHighScorePosition(int player_score) {}

//It should return an int.
//int highScorePosition = calculateHighScorePosition(1500);
//displayHighScorePosition("Aaron ", highScorePosition);

//The return data should be 1 if the score is the same or more than 1000.
//if(player_score >= 1000) {
//return 1;
//} else {

//2 if the score is the same or more than 500 and less than 1000
//if(player_score >= 500 && player_score < 1000) {
//return 2;
//} else {

//3 id the score is the same or more than 100 and less than 500
//if(player_score >= 100 && player_score < 500) {
//return 3;

//return 4 in all oher cases
//} else {
//return 4;



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
            if(player_score >= 500) {
                return 2;
            } else {
                if(player_score >= 100) {
                    return 3;
                } else {
                    return 4;
                }
            }
        }

    }
}
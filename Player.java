import java.util.Scanner;
 
/***
 * Player class
 */
 
public class Player {
    Scanner sc = new Scanner(System.in);
 
    private String name;
    private int points = 0;
    
    // Constructors
    public Player() {
        name = sc.nextLine();
    }
 
    // if there is no second player, assigns the second player as "Bot"
    public Player(String bot) {
        name = "Bot";
    }
 
    // randomizes a number for the bot to grab
    public int randomizeNumber() {
        return (int) (Math.random() * Board.getPieces()/2) + 1;
    }
 
    // adds one point
    public void setPoints() {
        points++;
    }
    
    // chooses the player to go first
    public static int choosePlayer() {
        return (int) (Math.random() * 2 + 1);
    }
 
    /*** Getters */
    public String getName() {
        return name;
    }
 
    // returns the amount of points the player has
    public int getPoints() {
        return points;
    }
 
    // returns the name of the player
    public String toString() {
        return name;
    }
}

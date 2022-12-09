/**
 * Represents the entire board 
 */
public class Board {
    private static int pieces;
 
    // sets total pieces
    public static void populate() {
        pieces = (int) (Math.random() * 41 + 10);
    }
 
    // getters
    public static int getPieces(){
        return pieces;
    }
 
    // updates score
    public static void updateTotal(int num) {
        pieces -= num;
    }
}
    

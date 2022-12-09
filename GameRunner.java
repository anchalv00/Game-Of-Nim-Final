/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  public static void main(String[] args)
  {
    // welcome message
    System.out.println("Welcome to the Game of Nim!");
 
    Board.populate(); // static method call
    
    // begins a new game
    Game nim = new Game(); 
    nim.play();
    
  }
}

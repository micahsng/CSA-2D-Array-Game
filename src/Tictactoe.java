import java.util.Scanner;

public class Tictactoe{
    public String[][] grid = new String[3][3];
    private int choice;
    /**boolean validInput = false;
     while (validInput == false){
     System.out.println("(1) Player or (2) Player?");
     int playerChoice = reader.nextInt();
     if(playerChoice == 1){
     validInput = true;
     }
     else if(playerChoice == 2){
     validInput = true;
     }
     }
     System.out.println("  A   B   C");
     System.out.println("1");**/
    private Tictactoe(){
        
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        reader.close();
    }
}

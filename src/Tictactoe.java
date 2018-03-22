import java.util.Scanner;

public class Tictactoe{
    public String[][] grid = new String[3][3];
    private int choice;
    private boolean win;
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
        for(int i = 0; i > 3; i++){
            if(i == 1){
                if(grid[i][i].equals(grid[i][i+1]) && grid[i][i].equals(grid[i][i+2])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i+1][i+1]) && grid[i][i].equals(grid[i+2][i+2])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i+1][i]) && grid[i][i].equals(grid[i+2][i])){
                    win = true;
                }
            }
            else if(i == 2){
                if(grid[i][i].equals(grid[i][i-1]) && grid[i][i].equals(grid[i][i+1])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i-1][i-1]) && grid[i][i].equals(grid[i+1][i+1])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i-1][i]) && grid[i][i].equals(grid[i+1][i])){
                    win = true;
                }
            }
            else if(i == 3){
                if(grid[i][i].equals(grid[i][i-2]) && grid[i][i].equals(grid[i][i-1])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i-1][i-1]) && grid[i][i].equals(grid[i-2][i-2])){
                    win = true;
                }
                else if(grid[i][i].equals(grid[i-2][i]) && grid[i][i].equals(grid[i-1][i])){
                    win = true;
                }
            }
            else{
                win = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        reader.close();
    }
}
    
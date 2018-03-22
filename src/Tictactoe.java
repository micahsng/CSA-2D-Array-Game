import java.util.Scanner;

public class Tictactoe{
    static String[][] grid = new String[3][3];
    private static int column;
    private static int row;
    public static boolean win;
    private static int player1 = 0;
    private static int player2 = 1;

    private Tictactoe(){
        //checking for any
        for(int i = 0; i > 3; i++){
            if(i == 1){
                if(grid[i][i] == (grid[i][i+1]) && grid[i][i] == (grid[i][i+2])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i+1][i+1]) && grid[i][i] == (grid[i+2][i+2])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i+1][i]) && grid[i][i] == (grid[i+2][i])){
                    win = true;
                }
            }
            else if(i == 2){
                if(grid[i][i] == (grid[i][i-1]) && grid[i][i] == (grid[i][i+1])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i-1][i-1]) && grid[i][i] == (grid[i+1][i+1])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i-1][i]) && grid[i][i] == (grid[i+1][i])){
                    win = true;
                }
            }
            else if(i == 3){
                if(grid[i][i] == (grid[i][i-2]) && grid[i][i] == (grid[i][i-1])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i-1][i-1]) && grid[i][i] == (grid[i-2][i-2])){
                    win = true;
                }
                else if(grid[i][i] == (grid[i-2][i]) && grid[i][i] == (grid[i-1][i])){
                    win = true;
                }
            }
            else{
                win = false;
            }
        }
    }
    public static void main(String[] args) {
        grid[0][0] = "-";
        grid[0][1] = "-";
        grid[0][2] = "-";
        grid[1][0] = "-";
        grid[1][1] = "-";
        grid[1][2] = "-";
        grid[2][0] = "-";
        grid[2][1] = "-";
        grid[2][2] = "-";
        win = false;
        while(win == false){
            System.out.println("What column do want to put the piece in? Select a number from 1-3.");
            Scanner reader = new Scanner(System.in);
            column = reader.nextInt();
            System.out.println("What row do want to put the piece in? Select a number from 1-3.");
            row = reader.nextInt();
            grid[row][column] = "X";
            System.out.println("   0  1  2");
            System.out.println("0  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2]);
            System.out.println("1  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2]);
            System.out.println("2  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2]);
            System.out.println("What column do want to put the piece in? Select a number from 1-3.");
            column = reader.nextInt();
            System.out.println("What row do want to put the piece in? Select a number from 1-3.");
            row = reader.nextInt();
            grid[row][column] = "O";
            System.out.println("   0  1  2");
            System.out.println("0  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2]);
            System.out.println("1  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2]);
            System.out.println("2  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2]);
        }

    }
}
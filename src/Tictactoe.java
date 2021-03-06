import java.util.Scanner;

public class Tictactoe{
    static String[][] grid = new String[3][3];
    private static int column;
    private static int row;
    public static boolean win;
    private static int player1 = 0;
    private static int player2 = 1;
    public static boolean position;

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
        position = true;
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
            Scanner reader = new Scanner(System.in);
            while (position == false){
                System.out.println("What column do want to put the piece in? Select a number from 0-2.");
                column = reader.nextInt();
                System.out.println("What row do want to put the piece in? Select a number from 0-2.");
                row = reader.nextInt();
                if(row > 2 || column > 2){
                    System.out.println("Position invalid, Try again");
                }
                else{position = true;}
            }
            position = false;
            grid[row][column] = "X";
            System.out.println("   0  1  2");
            System.out.println("0  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2]);
            System.out.println("1  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2]);
            System.out.println("2  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2]);
            while (position == false){
                System.out.println("What column do want to put the piece in? Select a number from 0-2.");
                column = reader.nextInt();
                System.out.println("What row do want to put the piece in? Select a number from 0-2.");
                row = reader.nextInt();
                if(row > 2 || column > 2){
                    System.out.println("Position invalid, Try again");
                }
                else{position = true;}
            }
            position = false;
            grid[row][column] = "O";
            System.out.println("   0  1  2");
            System.out.println("0  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2]);
            System.out.println("1  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2]);
            System.out.println("2  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2]);
        }

    }
}
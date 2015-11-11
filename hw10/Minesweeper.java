//George Cooper
//CSE 002
//November 12, 2015



import java.util.Scanner;



public class Minesweeper
{
    public static void main(String[] args)
    {
    int gameSize = 0;
    int mineNumber = 0;
    Scanner myScanner = new Scanner(System.in);
    
    
    while (!(gameSize >= 2 && gameSize <= 30))
    {
    System.out.println("Please select a game size between 2 and 30.?");
    gameSize = myScanner.nextInt();
    }
    while (!(mineNumber > 0 && mineNumber <= (gameSize*gameSize)))
    {
    System.out.println("How many mines would you like to have?");
    mineNumber = myScanner.nextInt();
    }
    String[][] gameBoard = new String[gameSize][gameSize];
    generator(gameSize, mineNumber, gameBoard);
    printer(gameSize, gameBoard);
    }
    
    
    public static void generator(int n, int m, String[][] gameBoard)
    {
        int mines = 0;
        
        
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                gameBoard[i][j] = "0 ";
            }
        }
        
        
        
        while (mines < m)
        {
            int i = (int)(Math.random()*n);
            int j = (int)(Math.random()*n);
            if (gameBoard[i][j] != "M ")
            {
                gameBoard[i][j] = "M ";
                mines++;
            }
        }
        
        
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (gameBoard[i][j] == "M ")
                {
                    try {
                    updater(gameBoard, i-1, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i-1, j);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i-1, j+1);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i, j+1);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i+1, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i+1, j);
                    } catch(Exception e) {}
                    try {
                    updater(gameBoard, i+1, j+1);
                    } catch(Exception e) {}
                }
            }
        }
    }
    
    
    public static void updater(String[][] gameboard, int i, int j)
    {
        switch (gameboard[i][j])
        {
            case "0 ":
                gameboard[i][j] = "1 ";
                break;
            case "1 ":
                gameboard[i][j] = "2 ";
                break;
            case "2 ":
                gameboard[i][j] = "3 ";
                break;
            case "3 ":
                gameboard[i][j] = "4 ";
                break;
            case "4 ":
                gameboard[i][j] = "5 ";
                break;
            case "5 ":
                gameboard[i][j] = "6 ";
                break;
            case "6 ":
                gameboard[i][j] = "7 ";
                break;
            case "7 ":
                gameboard[i][j] = "8 ";
                break;
            default:
                break;
        }
    }
    public static void printer(int n, String[][] gameboard)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(gameboard[i][j]);
            }
            System.out.println();
        }
    }
}
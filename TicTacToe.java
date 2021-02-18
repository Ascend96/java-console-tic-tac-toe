package Ch7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) { // driver
        int location; // stores the integer for where letter needs to go

        // creates player objects for player 1 and 2
        Player player1 = new Player(createPlayer1());
        Player player2 = new Player(createPlayer2());

        System.out.println(player1.getName() + " goes first: ");

        // creates game board using 2D array

        char[][] game = {{'1', '|', '2', '|', '3'},
                {'-', '-', '-', '-', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '-', '-', '-', '-'},
                {'7', '|', '8', '|', '9'}};


        // scanner to get user input for location on board.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number between 1-9: \n");

        // calls reset game method to initiate start of fresh game
            resetGame();

        }



        // method for the game display
    public static void displayGame(char[][] game){
        for(char[] row : game){ // for each row in the game array
            for(char x : row){ // for each character in the row, print character
                System.out.print(x);
            }
            System.out.println(); // moves row down
        }

    }
    // method to set the users position on game based on player and location entered
    public static void setPosition(char[][] game, Player player, int location){

        // decision structure to determine which player is which letter
        char letter = 'X'; // variable to make it easier for switch to know which character to put for which player
        if(player.getName().equals(createPlayer1())){
            letter = 'X';
        } else if (player.getName().equals(createPlayer2())){
            letter = 'O';
        }

        switch(location){ // switch statement that places letter in proper position on game
            case 1:
                game[0][0] = letter;
                break;

            case 2:
                game[0][2] = letter;
                break;

            case 3:
                game[0][4] = letter;
                break;

            case 4:
                game[2][0] = letter;
                break;

            case 5:
                game[2][2] = letter;
                break;

            case 6:
                game[2][4] = letter;
                break;

            case 7:
                game[4][0] = letter;
                break;

            case 8:
                game[4][2] = letter;
                break;

            case 9:
                game[4][4] = letter;
                break;

        }
        displayGame(game); // displays the game

    }

    // decision structure to determine win on game array by checking each array position
    public static void checkWin(char[][] game){

        if(game[0][0] == 'X' && game[0][2] == 'X' && game[0][4] == 'X') {

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[0][0] == 'O' && game[0][2] == 'O' && game[0][4] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[2][0] == 'X' && game[2][2] == 'X' && game[2][4] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[2][0] == 'O' && game[2][2] == 'O' && game[2][4] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[4][0] == 'X' && game[4][2] == 'X' && game[4][4] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[4][0] == 'O' && game[4][2] == 'O' && game[4][4] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[0][0] == 'X' && game[2][0] == 'X' && game[4][0] == 'X') {

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        }  else if(game[0][0] == 'O' && game[2][0] == 'O' && game[4][0] == 'O') {

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[0][2] == 'X' && game[2][2] == 'X' && game[4][2] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[0][2] == 'O' && game[2][2] == 'O' && game[4][2] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[0][4] == 'X' && game[2][4] == 'X' && game[4][4] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[0][4] == 'O' && game[2][4] == 'O' && game[4][4] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[0][0] == 'X' && game[2][2] == 'X' && game[4][4] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[0][0] == 'O' && game[2][2] == 'O' && game[4][4] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        } else if(game[0][4] == 'X' && game[2][2] == 'X' && game[4][0] == 'X'){

            System.out.println("Three in a row!!, Player 1 wins");
            menu();
        } else if(game[0][4] == 'O' && game[2][2] == 'O' && game[4][0] == 'O'){

            System.out.println("Three in a row!!, Player 2 wins");
            menu();
        }


        }


        // returns player 1
    public static String createPlayer1(){

        return "Player 1";


    }
    // returns player 2
    public static String createPlayer2(){

        return "Player 2";

    }
    // resets the game after win and displays clear board
    public static void resetGame(){
        Scanner keyboard = new Scanner(System.in);

        char[][] game = {{'1', '|', '2', '|', '3'},
                {'-', '-', '-', '-', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '-', '-', '-', '-'},
                {'7', '|', '8', '|', '9'}};
        displayGame(game);
        int location;
        int turn = 0; // sets turn to 0 to determine draw with incrementing

        Player player1 = new Player(createPlayer1());
        Player player2 = new Player(createPlayer2());
        for(int i = 0; i < 5; i++) {
            System.out.print(player1.getName() + "'s turn: ");
            location = keyboard.nextInt();
            setPosition(game, player1, location); // sets the users position and displays the board
            checkWin(game); // checks if the user won by using game as argument
            turn++;

            if(turn >= 9){ // if statement to determine draw
                System.out.println("Results in a Draw: ");
                menu();
            }
            for(int j = 0; j < 1; j++){ // nested loop for player 2 turn
                System.out.print(player2.getName() + "'s turn: ");
                location = keyboard.nextInt();
                setPosition(game, player2, location);
                checkWin(game); // checks win after each turn
                turn++;
                System.out.println(turn);


            }

        }
    }
    // after win asks user if they want to play again by entering 1 or 0 to exit
    public static void menu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Game over, press 1 to play again or 0 to exit.");
        int input = keyboard.nextInt();

        if(input == 1){
            resetGame();
        } else {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
    }

}

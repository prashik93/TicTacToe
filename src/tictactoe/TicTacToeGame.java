package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    Scanner scnr = new Scanner(System.in);
    public static char[] board = new char[10];
    char playerSymbol;
    char computerSymbol;
    public void creatingBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public void choiceToChooseSymbol() {
        int count = 0;
        while(count != 1) {
            System.out.println("\nChoose your symbol");
            System.out.println("""
                    1.For X
                    2.For O
                    3.Exit""");
            System.out.print("Enter your choice : ");
            int usrChoice = scnr.nextInt();
            switch (usrChoice) {
                case TicTacToeConstants.FOR_X -> {
                    playerSymbol = 'X';
                    computerSymbol = 'O';
                }
                case TicTacToeConstants.FOR_O -> {
                    playerSymbol = 'O';
                    computerSymbol = 'X';
                }
                case TicTacToeConstants.EXIT -> {
                    count++;
                }
                default -> System.out.println("Invalid input, please try again");
            }
        }
    }
}

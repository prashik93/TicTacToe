package tictactoe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.creatingBoard();
        ticTacToeGame.choiceToChooseSymbol();
    }
}
package tictactoe;

public class TicTacToeGame {
    public static char[] board = new char[10];
    public void creatingBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Tharindu Kalubowila
 */
// Introduced in Chapter 10  
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * The game of Tic Tac Toe.
 */
public class Machine {

    /**
     * Squares on the board, each of which is '.', 'X', or 'O'.
     */
    //private char[][] squares;
    String squares[][];
    Interface Gameface;

    /**
     * The board is initially empty.
     */
    public Machine(Interface GameInterface){
        Gameface = GameInterface;
        squares = new String[3][3];
        ArrayAssignment();
    }

    /**
     * Return true if the game is over.
     */
    public boolean gameOver() {
        if (score() != 0) {
            return true;
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (squares[row][column] == "") {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Return the value of the current position if it is O's turn.
     */
    protected int minimaxForO() {
        int score = score();
        if (gameOver()) {
            return score;
        }
        int bestScore = 2;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (squares[row][column] == "") {
                    squares[row][column] = "O";
                    score = minimaxForX();
                    if (score < bestScore) {
                        bestScore = score;
                    }
                    squares[row][column] = "";
                }
            }
        }

        return bestScore;
    }

    /**
     * Return the value of the current position if it is X's turn.
     */
    protected int minimaxForX() {
        int score = score();
        if (gameOver()) {
            return score;
        }
        int bestScore = -2;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (squares[row][column] == "") {
                    squares[row][column] = "X";
                    score = minimaxForO();
                    if (score > bestScore) {
                        bestScore = score;
                    }
                    squares[row][column] = "";
                }
            }
        }

        return bestScore;
    }

    /**
     * Play one game.
     */
    public void play(String Player) {
        String player = Player;
        for (int move = 0; move < 9; move++) {
            if (gameOver()) {
                return;
            }
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    squares[row][column] = Gameface.button[column + (3 * row)].getText();
                }
            }
            playBestMove();

        }
    }

    /**
     * Find the best move for Player and play it on the panel.
     */
    protected void playBestMove() {
        int score;
        int bestScore = -2;
        int bestRow = -1;
        int bestColumn = -1;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (squares[row][column] == "") {
                    squares[row][column] = "X";
                    score = minimaxForO();
                    if (score > bestScore) {
                        bestScore = score;
                        bestRow = row;
                        bestColumn = column;
                    }
                    squares[row][column] = "";
                }
            }
        }
        squares[bestRow][bestColumn] = "X";
    }

    /**
     * Return 1 if X has won, -1 if O has won, and 0 otherwise.
     */
    public int score() {
        int lineScore;
        for (int i = 0; i < 3; i++) {
            lineScore = scoreLine(squares[i][0], squares[i][1], squares[i][2]);
            if (lineScore != 0) {
                return lineScore;
            }
            lineScore = scoreLine(squares[0][i], squares[1][i], squares[2][i]);
            if (lineScore != 0) {
                return lineScore;
            }
        }
        lineScore = scoreLine(squares[0][0], squares[1][1], squares[2][2]);
        if (lineScore != 0) {
            return lineScore;
        }
        return scoreLine(squares[0][2], squares[1][1], squares[2][0]);
    }

    /**
     * Return 1 if all three characters are 'X', -1 if they are all 'O', and 0
     * otherwise.
     */
    protected int scoreLine(String a, String b, String c) {
        if ((a == "X") && (b == "X") && (c == "X")) {
            return 1;
        }
        if ((a == "O") && (b == "O") && (c == "O")) {
            return -1;
        }
        return 0;
    }

    /**
     * Set X for relevant positions in panel  *
     */
    public void setInterface() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (squares[row][column] == "X") {
                    Gameface.set(column + (3 * row));
                }
            }
        }
    }

    /**
     * Assign current values of panel to the square array*
     */
    protected void ArrayAssignment() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                squares[row][column] = Gameface.button[column + (3 * row)].getText();

            }
        }
    }

}

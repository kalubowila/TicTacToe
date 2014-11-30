/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author Tharindu Kalubowila
 *
 *
 * /**
 * Tic-Tac-Toe: Two-player console, non-graphics, non-OO version. All
 * variables/methods are declared as static (belong to the class) in the non-OO
 * version.
 */
public class Human {

    Interface gameface;
    String B1, B2, B3, B4, B5, B6, B7, B8, B9;

    Human(Interface aThis) {
        gameface = aThis;
    }

    public String checkCondition() {
        
        B1 = gameface.button[0].getText();
        B2 = gameface.button[1].getText();
        B3 = gameface.button[2].getText();
        B4 = gameface.button[3].getText();
        B5 = gameface.button[4].getText();
        B6 = gameface.button[5].getText();
        B7 = gameface.button[6].getText();
        B8 = gameface.button[7].getText();
        B9 = gameface.button[8].getText();
        
        if (B1 == B2 && B2 == B3 && B1 != "" && B2 != "" && B3 != "") {
            if (B1 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B4 == B5 && B5 == B6 && B4 != "" && B5 != "" && B6 != "") {
            if (B4 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B7 == B8 && B8 == B9 && B7 != "" && B8 != "" && B9 != "") {
            if (B7 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B1 == B4 && B4 == B7 && B1 != "" && B4 != "" && B7 != "") {
            if (B1 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B2 == B5 && B5 == B8 && B2 != "" && B5 != "" && B8 != "") {
            if (B2 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B3 == B6 && B6 == B9 && B3 != "" && B6 != "" && B9 != "") {
            if (B3 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B1 == B5 && B5 == B9 && B1 != "" && B5 != "" && B9 != "") {
            if (B1 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        } else if (B3 == B5 && B5 == B7 && B3 != "" && B5 != "" && B7 != "") {
            if (B3 == "X") {
                gameface.incrementPlayer1();
                JOptionPane.showMessageDialog(null, "Player 1 WON..!", "Game Condition", 1);
                gameface.printPlayer1();
            } else {
                gameface.incrementPlayer2();
                JOptionPane.showMessageDialog(null, "Player 2 WON..!", "Game Condition", 1);
                gameface.printPlayer2();
            }
            return "reset";
        }
        return null;
    }

}

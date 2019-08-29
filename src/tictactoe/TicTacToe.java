/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Michał Stachowski
 */
public class TicTacToe {
    private JButton crossButton;
    private JButton noughtButton;
    private JButton playButton;
    private ImageIcon crossImageIcon = new ImageIcon("img/cross.png");
    private ImageIcon greenCrossImageIcon = new ImageIcon("img/crossWin.png");
    private ImageIcon noughtImageIcon = new ImageIcon("img/nought.png");
    private ImageIcon greenNoughtImageIcon = new ImageIcon("img/noughtWin.png");
    private ImageIcon playImageIcon = new ImageIcon("img/play_210x82.png");
    private ImageIcon whoStartImageIcon = new ImageIcon("img/whoStart_210x52.png");
    private JLabel label;
    private boolean isChoosed = false;
    private boolean crossTurn = false;
    private boolean noughtTurn = false;
    

    TicTacToe() {
        JFrame menuFrame = new JFrame();
        menuFrame.setTitle("Menu");
        menuFrame.setSize(250, 320);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setResizable(false);
        menuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label = new JLabel(whoStartImageIcon);
        label.setBounds(10, 10, 210, 52);
        
        crossButton = new JButton(crossImageIcon);
        crossButton.setBounds(10, 70, 100, 100);
        crossButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                crossButton.setIcon(greenCrossImageIcon);
                noughtButton.setIcon(noughtImageIcon);
                isChoosed = true;
                crossTurn = true;
                noughtTurn = false;
            }
        });
        
        noughtButton = new JButton(noughtImageIcon);
        noughtButton.setBounds(120, 70, 100, 100);
        noughtButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                crossButton.setIcon(crossImageIcon);
                noughtButton.setIcon(greenNoughtImageIcon);
                isChoosed = true;
                noughtTurn = true;
                crossTurn = false;
            }
        });
        
        playButton = new JButton(playImageIcon);
        playButton.setBounds(10, 180, 210, 82);
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(isChoosed){
                    TwoPlayer newGame = new TwoPlayer();
                    newGame.crossTurn = crossTurn;
                    newGame.noughtTurn = noughtTurn;  
                    newGame.setVisible(true);
                    menuFrame.setVisible(false);
                }                
            }
        });
        
        JPanel panel = new JPanel(null);
        panel.setBounds(0, 0, 800, 800);
        panel.add(label);
        panel.add(crossButton);
        panel.add(noughtButton);
        panel.add(playButton);
        
        Container container = menuFrame.getContentPane();
        container.add(panel);
        
        
        menuFrame.setVisible(true);
    }

    

    public static void main(String[] args) {
        //TicTacToe game = new TicTacToe();
        new TicTacToe();
    }   
}
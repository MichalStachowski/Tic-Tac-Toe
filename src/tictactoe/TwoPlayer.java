/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Michał Stachowski
 */
public class TwoPlayer extends JFrame{
    
    public int response;
    private JButton buttons[];
    private ImageIcon board;
    private ImageIcon nought;
    private ImageIcon cross;
    private ImageIcon crossWinImageIcon;
    private ImageIcon noughtWinImageIcon;
    private boolean crossWin = false;
    private boolean noughtWin = false;
    boolean crossTurn = false;
    boolean noughtTurn = false;
    boolean[] isButtonClicked = new boolean[9];
    boolean allButtonsClicked = false;
    int[][] tabWhatClicked = new int[3][3];                 //1 is cross, 2 is nought
                                                        //[X][O][X]     =       [1][2][1]
                                                        //[O][X][O]     =       [2][1][2]
                                                        //[O][X][O]     =       [2][1][2]
    
    private class OperateButtons implements ActionListener{

        private OperateButtons(TwoPlayer aThis) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton operation = (JButton)e.getSource();
            
            
            if(operation==buttons[0]){
                if(isButtonClicked[0]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[0].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[0][0] = 1;
                    }
                    else{
                        buttons[0].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[0][0] = 2;
                    }
                }   
                isButtonClicked[0]=true;
                isEnd();
            }
            
            else if(operation==buttons[1]){
                if(isButtonClicked[1]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[1].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[0][1] = 1;

                    }
                    else{
                        buttons[1].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[0][1] = 2;
                    }
                }   
                isButtonClicked[1]=true;
                isEnd();
            }
            
            else if(operation==buttons[2]){
                if(isButtonClicked[2]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[2].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[0][2] = 1;
                    }
                    else{
                        buttons[2].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[0][2] = 2;
                    }
                }   
                isButtonClicked[2]=true;
                isEnd();
            }
            
            else if(operation==buttons[3]){
                if(isButtonClicked[3]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[3].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[1][0] = 1;
                    }
                    else{
                        buttons[3].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[1][0] = 2;
                    }
                }   
                isButtonClicked[3]=true;
                isEnd();
            }
            
            else if(operation==buttons[4]){
                if(isButtonClicked[4]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[4].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[1][1] = 1;
                    }
                    else{
                        buttons[4].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[1][1] = 2;
                    }
                }   
                isButtonClicked[4]=true;
                isEnd();
            }
            
            else if(operation==buttons[5]){
                if(isButtonClicked[5]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[5].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[1][2] = 1;
                    }
                    else{
                        buttons[5].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[1][2] = 2;
                    }
                }   
                isButtonClicked[5]=true;
                isEnd();
            }
            
            else if(operation==buttons[6]){
                if(isButtonClicked[6]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[6].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[2][0] = 1;
                    }
                    else{
                        buttons[6].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[2][0] = 2;
                    }
                }   
                isButtonClicked[6]=true;
                isEnd();
            }
            
            else if(operation==buttons[7]){
                if(isButtonClicked[7]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[7].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[2][1] = 1;
                    }
                    else{
                        buttons[7].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[2][1] = 2;
                    }
                }   
                isButtonClicked[7]=true;
                isEnd();
            }
            
            else if(operation==buttons[8]){
                if(isButtonClicked[8]==true);                                   //to click only once    
                else{
                    if(crossTurn){
                    buttons[8].setIcon(cross);
                    crossTurn = false;
                    noughtTurn = true;
                    tabWhatClicked[2][2] = 1;
                    }
                    else{
                        buttons[8].setIcon(nought);
                        crossTurn = true;
                        noughtTurn = false;
                        tabWhatClicked[2][2] = 2;
                    }
                }   
                isButtonClicked[8]=true;
                isEnd();
            }
            for(int i=0; i<9; i++){
                if(isButtonClicked[i]==true) allButtonsClicked = true;
                else{
                    allButtonsClicked = false;
                    break;
                }
            }
                        

            if(allButtonsClicked==true && crossWin==false && noughtWin==false) {           //Here is choiceMethod() only for draw. Other options (cross/nought) are in isEnd() method.
                choiceMethod();
            }
        }
        
    }
    
    public TwoPlayer(){
        super("Tic-Tac-Toe 2 Players");
        setSize(350, 400);     
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
   
        board = new ImageIcon("img/board.png");
        nought = new ImageIcon("img/nought.png");
        cross = new ImageIcon("img/cross.png");
        noughtWinImageIcon = new ImageIcon("img/noughtWin.png");
        crossWinImageIcon = new ImageIcon("img/crossWin.png");
        
        for(int i=0; i<9; i++) isButtonClicked[i] = false;
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++) tabWhatClicked[i][j] = 0;
        }
        
        buttons = new JButton[20];
        
        buttons[0] = new JButton(board);
        buttons[0].addActionListener(new OperateButtons(this));
        buttons[0].setBounds(10, 50, 100, 100);
        
        buttons[1] = new JButton(board);
        buttons[1].addActionListener(new OperateButtons(this));
        buttons[1].setBounds(110, 50, 100, 100);
        
        buttons[2] = new JButton(board);
        buttons[2].addActionListener(new OperateButtons(this));
        buttons[2].setBounds(210, 50, 100, 100);
        
        buttons[3] = new JButton(board);
        buttons[3].addActionListener(new OperateButtons(this));
        buttons[3].setBounds(10, 150, 100, 100);
        
        buttons[4] = new JButton(board);
        buttons[4].addActionListener(new OperateButtons(this));
        buttons[4].setBounds(110, 150, 100, 100);
        
        buttons[5] = new JButton(board);
        buttons[5].addActionListener(new OperateButtons(this));
        buttons[5].setBounds(210, 150, 100, 100);
        
        buttons[6] = new JButton(board);
        buttons[6].addActionListener(new OperateButtons(this));
        buttons[6].setBounds(10, 250, 100, 100);
        
        buttons[7] = new JButton(board);
        buttons[7].addActionListener(new OperateButtons(this));
        buttons[7].setBounds(110, 250, 100, 100);
        
        buttons[8] = new JButton(board);
        buttons[8].addActionListener(new OperateButtons(this));
        buttons[8].setBounds(210, 250, 100, 100);
        
        
        
        
        JPanel panel = new JPanel(null);
        panel.setBounds(0, 0, 400, 400);
        panel.add(buttons[0]);
        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        panel.add(buttons[4]);
        panel.add(buttons[5]);
        panel.add(buttons[6]);
        panel.add(buttons[7]);
        panel.add(buttons[8]);
        
        
        Container content = getContentPane();
        content.add(panel);
    }
    
    public void choiceMethod(){                                                                         //after game to choose - new game or menu
        if(crossWin)    JOptionPane.showMessageDialog(rootPane, "Cross Wins. Congratulation!");
        else if(noughtWin)  JOptionPane.showMessageDialog(rootPane, "Nought Wins. Congratulation!");       
        else if(allButtonsClicked==true && crossWin==false && noughtWin==false) JOptionPane.showMessageDialog(rootPane, "Draw"); 
        
        Object[] options = { "New Game", "Back To Menu" };
        response = JOptionPane.showOptionDialog(null, "Do You want start a new game or maybe back to menu?", "What to do?",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(response==JOptionPane.OK_OPTION) startNewGame();
        if(response==JOptionPane.NO_OPTION) {                                             //Here I should back to menu
            backMenu();                                                                                          
        }
    }
    
    public void backMenu(){
        dispose();
        new TicTacToe();
    }
    
    public void startNewGame(){                                                                         //when player want to start new game
        setVisible(false);       
        for(int i=0; i<9; i++) isButtonClicked[i] = false;
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++) tabWhatClicked[i][j] = 0;
        }
        for(int i=0; i<9; i++)  buttons[i].setIcon(board);       
        crossWin = false;
        noughtWin = false;
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(TwoPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setVisible(true);
        if(crossTurn) JOptionPane.showMessageDialog(rootPane, "Cross Starts");
        else if(noughtTurn) JOptionPane.showMessageDialog(rootPane, "Nought Starts");
    }

    public void isEnd(){                                                                                //check and then ask what to do next
        //Rows
        if(tabWhatClicked[0][0]==1 && tabWhatClicked[0][1]==1 && tabWhatClicked[0][2]==1) {                       
            crossWin = true;
            buttons[0].setIcon(crossWinImageIcon);                                                          //green sign for winner
            buttons[1].setIcon(crossWinImageIcon);
            buttons[2].setIcon(crossWinImageIcon);
            choiceMethod();            
        }          
        else if(tabWhatClicked[0][0]==2 && tabWhatClicked[0][1]==2 && tabWhatClicked[0][2]==2) {
            noughtWin = true;
            buttons[0].setIcon(noughtWinImageIcon);
            buttons[1].setIcon(noughtWinImageIcon);
            buttons[2].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[1][0]==1 && tabWhatClicked[1][1]==1 && tabWhatClicked[1][2]==1)  {
            crossWin = true;
            buttons[3].setIcon(crossWinImageIcon);                                                          
            buttons[4].setIcon(crossWinImageIcon);
            buttons[5].setIcon(crossWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[1][0]==2 && tabWhatClicked[1][1]==2 && tabWhatClicked[1][2]==2)  {
            noughtWin = true;
            buttons[3].setIcon(noughtWinImageIcon);                                                          
            buttons[4].setIcon(noughtWinImageIcon);
            buttons[5].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[2][0]==1 && tabWhatClicked[2][1]==1 && tabWhatClicked[2][2]==1)  {
            crossWin = true;
            buttons[6].setIcon(crossWinImageIcon);                                                          
            buttons[7].setIcon(crossWinImageIcon);
            buttons[8].setIcon(crossWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[2][0]==2 && tabWhatClicked[2][1]==2 && tabWhatClicked[2][2]==2)  {
            noughtWin = true;
            buttons[6].setIcon(noughtWinImageIcon);                                                          
            buttons[7].setIcon(noughtWinImageIcon);
            buttons[8].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        
        //Columns
        else if(tabWhatClicked[0][0]==1 && tabWhatClicked[1][0]==1 && tabWhatClicked[2][0]==1)  {
            crossWin = true;
            buttons[0].setIcon(crossWinImageIcon);                                                          
            buttons[3].setIcon(crossWinImageIcon);
            buttons[6].setIcon(crossWinImageIcon);
            choiceMethod();
        }    
        else if(tabWhatClicked[0][0]==2 && tabWhatClicked[1][0]==2 && tabWhatClicked[2][0]==2)  {
            noughtWin = true;
            buttons[0].setIcon(noughtWinImageIcon);                                                          
            buttons[3].setIcon(noughtWinImageIcon);
            buttons[6].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[0][1]==1 && tabWhatClicked[1][1]==1 && tabWhatClicked[2][1]==1)  {
            crossWin = true;
            buttons[1].setIcon(crossWinImageIcon);                                                          
            buttons[4].setIcon(crossWinImageIcon);
            buttons[7].setIcon(crossWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[0][1]==2 && tabWhatClicked[1][1]==2 && tabWhatClicked[2][1]==2)  {
            noughtWin = true;
            buttons[1].setIcon(noughtWinImageIcon);                                                          
            buttons[4].setIcon(noughtWinImageIcon);
            buttons[7].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[0][2]==1 && tabWhatClicked[1][2]==1 && tabWhatClicked[2][2]==1)  {
            crossWin = true;
            buttons[2].setIcon(crossWinImageIcon);                                                          
            buttons[5].setIcon(crossWinImageIcon);
            buttons[8].setIcon(crossWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[0][2]==2 && tabWhatClicked[1][2]==2 && tabWhatClicked[2][2]==2)  {
            noughtWin = true;
            buttons[2].setIcon(noughtWinImageIcon);                                                          
            buttons[5].setIcon(noughtWinImageIcon);
            buttons[8].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        
        //Diagonal
        else if(tabWhatClicked[0][0]==1 && tabWhatClicked[1][1]==1 && tabWhatClicked[2][2]==1)  {
            crossWin = true;
            buttons[0].setIcon(crossWinImageIcon);                                                          
            buttons[4].setIcon(crossWinImageIcon);
            buttons[8].setIcon(crossWinImageIcon);
            choiceMethod();            
        }    
        else if(tabWhatClicked[0][0]==2 && tabWhatClicked[1][1]==2 && tabWhatClicked[2][2]==2)  {
            noughtWin = true;
            buttons[0].setIcon(noughtWinImageIcon);                                                          
            buttons[4].setIcon(noughtWinImageIcon);
            buttons[8].setIcon(noughtWinImageIcon);
            choiceMethod();
        }
        else if(tabWhatClicked[2][0]==1 && tabWhatClicked[1][1]==1 && tabWhatClicked[0][2]==1)  {
            crossWin = true;
            buttons[6].setIcon(crossWinImageIcon);                                                          
            buttons[4].setIcon(crossWinImageIcon);
            buttons[2].setIcon(crossWinImageIcon);  
            choiceMethod();
        }
        else if(tabWhatClicked[2][0]==2 && tabWhatClicked[1][1]==2 && tabWhatClicked[0][2]==2)  {
            noughtWin = true;
            buttons[6].setIcon(noughtWinImageIcon);                                                          
            buttons[4].setIcon(noughtWinImageIcon);
            buttons[2].setIcon(noughtWinImageIcon);
            choiceMethod();
        }       
    }
        

    
}
    


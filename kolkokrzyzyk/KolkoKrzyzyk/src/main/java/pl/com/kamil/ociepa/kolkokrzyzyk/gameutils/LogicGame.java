
package pl.com.kamil.ociepa.kolkokrzyzyk.gameutils;

import pl.com.kamil.ociepa.kolkokrzyzyk.Player;


public class LogicGame {
   
   private boolean player = false;
   private Player p1, p2;
   
   private int[][]board = new int [3][3];
   
   public boolean addPlayerMoveBoard(int x, int y, int sign){
      board[x][y]=sign; 
       return isWinner();
      
   } 
   
   
   private boolean isWinner(){
        boolean winner = false;
        if(board[0][0] == board[1][1] && board[0][0] == board[2][0] && board[0][0]>0){
        winner = true;
   }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] >0){
        winner = true;
        }
        return winner; 
   }
   @Override
   public String toString(){
       return"|"+board[0][2]+"|"+board[1][2]+"|"+board[2][2]+"|"+"in"+
               "|"+board[0][1]+"|"+board[1][1]+"|"+board[2][1]+"|"+"in"+
               "|"+board[0][0]+"|"+board[1][0]+"|"+board[2][0]+"|";
        }
    }
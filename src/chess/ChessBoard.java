/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Cheryl
 */
public class ChessBoard {
    
    private Square board[][];
    private ChessColour activeColour;
    private int fullMove;
    
    public ChessBoard() {
        board = new Square[8][8];
        for (int c=0; c<8; c++)
            for (int r=0; r<8; r++)
                board[c][r] = new Square( new Coordinate(c,r));
        reset();
        activeColour = ChessColour.WHITE;
        fullMove = 1;
    }
    
      /*
     *
    */
    public ChessBoard( Coordinate positions[], Piece pieces[])throws IllegalArgumentException
    {   
        if (positions.length != pieces.length) 
            throw new IllegalArgumentException ("The list of positions must correspond to the list of pieces");
        
        board = new Square[8][8];
        for (int r=0; r<8; r++)
            for (int c=0; c<8; c++)
                board[r][c] = new Square( new Coordinate(r,c));
        for (int i=0; i<positions.length;i++) {
            board[positions[i].getColumnNumber()][positions[i].getRowNumber()].addPiece(pieces[i]);
        }
        activeColour = ChessColour.WHITE;
        fullMove = 1;
    }
    private void reset()
    {
       // TBD
    
        
    }
    
    private Square getSquare (Coordinate c)
    {
	return null;  // Remove once you have implemented the method.
        // TBD
    }
    public boolean move(Coordinate src, Coordinate dest) {
     
	return false;  // Remove once you have implemented the method
       // TBD
    }   
    
    public String toString() {
        
      return null; 	// Remove once you have implemented the method.
    }
    
       public String toFEN() {
        
       return null;  	// Remove once you have implemented the method.
    }
    
    
}

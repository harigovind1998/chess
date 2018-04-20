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
        for (int c=0; c<8; c++)
            for (int r=0; r<8; r++)
                board[c][r] = new Square( new Coordinate(c,r));
        for (int i=0; i<positions.length;i++) {
            board[positions[i].getColumnNumber()][positions[i].getRowNumber()].addPiece(pieces[i]);
        }
        activeColour = ChessColour.WHITE;
        fullMove = 1;
        int len = positions.length;
        for (int i = 0; i< len ; i++){
            Coordinate tempC = positions[i];
            Square tempSquare = board[tempC.getColumnNumber()][tempC.getRowNumber()];
            if (tempSquare.isOccupied() == false){
                tempSquare.addPiece(pieces[i]);
            }
        
        
        }
    }
    private void reset()
    {
        board[0][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.ROOK));
        board[1][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.KNIGHT));
        board[2][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.BISHOP));
        board[3][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.QUEEN));
        board[4][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.KING));
        board[5][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.BISHOP));
        board[6][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.KNIGHT));
        board[7][0].addPiece(new Piece(ChessColour.WHITE, ChessPieces.ROOK));
        for(int i = 0; i<=7;i++){
            board[i][2].addPiece(new Piece(ChessColour.WHITE, ChessPieces.PAWN));
        }
        
        for(int i = 0; i<=7;i++){
            board[i][6].addPiece(new Piece(ChessColour.BLACK, ChessPieces.PAWN));
        }
        
         board[0][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.ROOK));
        board[1][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.KNIGHT));
        board[2][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.BISHOP));
        board[3][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.QUEEN));
        board[4][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.KING));
        board[5][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.BISHOP));
        board[6][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.KNIGHT));
        board[7][7].addPiece(new Piece(ChessColour.BLACK, ChessPieces.ROOK));
        
        
       // TBD
    
        
    }
    
    private Square getSquare (Coordinate c)
    {
        
	return board[c.getColumnNumber()][c.getRowNumber()];  // Remove once you have implemented the method.
        // TBD
    }
    public boolean move(Coordinate src, Coordinate dest) {
        Square source = board[src.getColumnNumber()][src.getRowNumber()];
        Square destination = board[dest.getColumnNumber()][dest.getRowNumber()];
        if(source.isOccupied() && (!destination.isOccupied() || destination.getPiece().getColour() != source.getPiece().getColour())){
            
        }
     
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

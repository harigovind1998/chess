/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
/**
 *
 * @author grhar
 */
public class Square {
    Coordinate coordinate;
    Piece piece;
    
    public Square(Coordinate c){
        this.coordinate = c;
        piece = null;
    }
    
    public Square(Coordinate c, Piece p){
        coordinate = c;
        piece = p;
    }
    
    public char getColumn(){return coordinate.getColumn();}
    public char getRow(){return coordinate.getRow();}
    public int getColumnNumber(){return coordinate.getColumnNumber();}
    public int getRowNumber(){return coordinate.getRowNumber();}
    public Coordinate getCoordinate(){return coordinate;}
    public Piece getPiece(){return piece;}
    
    public Piece addPiece(Piece p){
        Piece p1 = piece;
        
            this.piece = p; return p1;
    
    }
    public Piece deletePiece(){
        Piece p = piece;
        piece = null; return p;}
    
    public boolean isOccupied(){
        return piece != null;
    }
    
    @Override
    public String toString(){
    String temp= "Square("+String.valueOf(getColumnNumber())+","+String.valueOf(getRowNumber())+"):";
    if (piece!=null)
        temp+= piece.toString();
    
    return temp;
    }
    
}

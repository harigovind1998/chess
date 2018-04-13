/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import chess.ChessColour;
import chess.ChessPieces;
/**
 *
 * @author grhar
 */
public class Piece {
    private ChessColour colour;
    private ChessPieces name;
    private char shortName;
    
    public Piece(ChessColour colour, ChessPieces name) throws IllegalArgumentException{
        try{
        this.colour = colour;
        this.name = name;
        this.shortName = name.getShortName();
        if(colour == ChessColour.BLACK){
            this.shortName = Character.toLowerCase((this.shortName));   
        }} catch (IllegalArgumentException e){}
        
    }
    
    public Piece(char shortName) throws IllegalArgumentException {
        
        this.shortName = shortName;
        
        if(Character.isUpperCase(shortName)){
            this.colour = ChessColour.WHITE;
        }else{
            this.colour = ChessColour.BLACK;
        }
        char temp = Character.toUpperCase(shortName);
        switch(temp){
            case 'P': this.name = ChessPieces.PAWN;
                break;
            case 'N': this.name = ChessPieces.KNIGHT;
                break;
            case 'B': this.name =  ChessPieces.BISHOP;
                break;
            case 'R': this.name = ChessPieces.ROOK;
                break;
            case 'Q': this.name = ChessPieces.QUEEN;
                break;
            case 'K': this.name = ChessPieces.KING;
                break;
            default: throw new IllegalArgumentException("Unknown piece");
        }
    }
    
    public ChessColour getColour(){
        return this.colour;       
    }
    
    public ChessPieces getName(){return this.name;}
    
    public char getShortName(){return this.shortName;}
    
    public String toString(){
        String temp = "";
        switch (colour){
            case WHITE: temp = "WHITE ";
            break;
            case BLACK: temp = "BLACK ";
        }
        
        switch (name){
            case PAWN: temp += "PAWN";
                break;
            case KNIGHT: temp += "KNIGHT";
                break;
            case BISHOP: temp += "BISHOP";
                break;
            case ROOK: temp += "ROOK";
                break;
            case QUEEN: temp += "QUEEN";
                break;
            case KING: temp += "KING";
            break;
        }
        return temp;
    }
}

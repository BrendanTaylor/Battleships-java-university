package Battleships;

import java.util.ArrayList;

public class gameEngine {
	private static gameBoard player1Board, player2Board;

	gameEngine(){
		
	}
	
	private static gameBoard generateGameBoard(){
		ArrayList<ship> ships = new ArrayList<ship>();
		//redifine for new ships here
		ships.add(new aircraft());
		ships.add(new battleship());
		ships.add(new cruiser());
		ships.add(new Destroyer());
		ships.add(new Enterprise());
		
		ArrayList<Integer> rows = new ArrayList<Integer>();
		//redefine for new map
		rows.add(6);
		rows.add(6);
		rows.add(6);
		rows.add(6);
		rows.add(6);
		rows.add(6);
		rows.add(12);
		rows.add(12);
		rows.add(12);
		rows.add(12);
		rows.add(12);
		rows.add(12);
		return new gameBoard(ships,rows,12,5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gameBoard player1Board = generateGameBoard();
		gameBoard player2Board = generateGameBoard();

	}

}

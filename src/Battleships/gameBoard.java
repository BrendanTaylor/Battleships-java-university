
package Battleships;
import java.util.ArrayList;

import com.sun.rowset.internal.Row;

public class gameBoard {
	private static ArrayList<row> rows;
	private static ArrayList<ship> ships;
	private static int RowNumber, shipcount;
	
	gameBoard(ArrayList<ship> ships, ArrayList<Integer> rowlength, int RowNumber, int shipcount) {
		gameBoard.rows= new ArrayList<row>();
		gameBoard.RowNumber=RowNumber;
		gameBoard.shipcount=shipcount;
		for (int i0=0; i0 < RowNumber; i0++){
			gameBoard.rows.add(new row(rowlength.get(i0)));		
		}
		gameBoard.ships= ships;
	}
	
	public char currentmove(relativecoordinates coordinates){
		char move=rows.get(coordinates.returnycoordinates()).currentMove(coordinates.returnxcoordinates());
		if (move=='0'){
			System.out.println("The element you selected does not exist");
			return '0';
		}
		else if (move=='1'){
			System.out.println("You have already hit this space");
			return '0';
		}
		else if (move!='Z'){
			for (int i0=0; i0<shipcount; i0++){
				if (move==ships.get(i0).returnidentifier()){
					if (ships.get(i0).hit()==false){
						gameBoard.shipcount=gameBoard.shipcount-1;
						if (gameBoard.shipcount==0){
							return 'W';
						}
						return 'S';
					}
					return 'H';
				}
			}
		}
		return 'M';
	}

	public void PrintBoard(boolean owner){
		for (int i0=0; i0 < RowNumber; i0++){
			rows.get(i0).currentRow(owner);
		}
	}

}

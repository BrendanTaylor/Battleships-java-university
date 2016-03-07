package Battleships;
import java.util.ArrayList;

public abstract class ship {
	protected static ArrayList<relativecoordinates> coordinates ;
	protected static int size, hitsleft;
	private static char identifier;

	ship(int size){
		ship.size=size;
		ship.hitsleft=size;
	}
	
	public relativecoordinates get(int index){
		return coordinates.get(index);
	}
	
	public boolean hit(){
		ship.hitsleft=ship.hitsleft-1;
		if (ship.hitsleft == 0){
			return true;
		}
		return false;
		
	}
	
	public char returnidentifier(){
		return identifier;
	}
	
	public int returnsize(){
		return ship.size;
	}

}

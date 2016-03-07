package Battleships;
import java.util.ArrayList;

public class battleship extends ship{
	
	battleship(){
		super(4);
		coordinates.add(new relativecoordinates(0,0));
		coordinates.add(new relativecoordinates(0,1));
		coordinates.add(new relativecoordinates(0,2));
		coordinates.add(new relativecoordinates(0,3));
	}
	
}

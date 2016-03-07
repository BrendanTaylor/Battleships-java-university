package Battleships;
import java.util.ArrayList;

public class aircraft extends ship{

	
	aircraft(){
		super(6);
		aircraft.coordinates.add(new relativecoordinates(0,0));
		aircraft.coordinates.add(new relativecoordinates(1,0));
		aircraft.coordinates.add(new relativecoordinates(2,0));
		aircraft.coordinates.add(new relativecoordinates(1,1));
		aircraft.coordinates.add(new relativecoordinates(1,2));
		aircraft.coordinates.add(new relativecoordinates(1,3));
	}
}

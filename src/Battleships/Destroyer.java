package Battleships;

import java.util.ArrayList;

public class Destroyer extends ship {

	Destroyer(){
		super(2);
		coordinates.add(new relativecoordinates(0,0));
		coordinates.add(new relativecoordinates(0,1));
	}

}

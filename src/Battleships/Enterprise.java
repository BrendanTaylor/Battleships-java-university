package Battleships;

import java.util.ArrayList;

public class Enterprise extends ship{

	Enterprise(){
		super(6);
		coordinates.add(new relativecoordinates(0,0));
		coordinates.add(new relativecoordinates(2,0));
		coordinates.add(new relativecoordinates(0,1));
		coordinates.add(new relativecoordinates(1,1));
		coordinates.add(new relativecoordinates(2,1));
		coordinates.add(new relativecoordinates(1,2));		
	}
	
}

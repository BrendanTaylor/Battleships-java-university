package Battleships;

import java.util.ArrayList;

public class cruiser extends ship{

	cruiser(){
		super(3);
		coordinates.add(new relativecoordinates(0,0));
		coordinates.add(new relativecoordinates(0,1));
		coordinates.add(new relativecoordinates(0,2));
	}
}

package Battleships;

public class relativecoordinates {
	private static int x;
	private static int y;
	public relativecoordinates(int x, int y){
		relativecoordinates.x=x;
		relativecoordinates.y=y;
	}
	public int returnxcoordinates(){
		return relativecoordinates.x;
	}
	public int returnycoordinates(){
		return relativecoordinates.y;
	}
}

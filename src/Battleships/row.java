package Battleships;
import java.util.ArrayList;

public class row {
	
	private static int length;
	private static ArrayList<Character> contents;
	private static ArrayList<Boolean> hit;

	row(int size) {
		row.length=size;
		row.contents=new ArrayList<Character>();
		row.hit=new ArrayList<Boolean>();
		for (int i0=0; i0<row.length; i0++){
			row.contents.add('Z'); //no ship has identifier Z
			row.hit.add(false);
		}
	}

	
	public int getrowlegnth(){
		return row.length;
	}
	
	public char currentMove (int element){
		try {
			row.contents.get(element);
		}
		catch(Exception e){
			return '0'; //element doesn't exist
		}
		if (row.hit.get(element))
		{
			return '1'; //element already hit
		}
		row.hit.set(element,true);
		return row.contents.get(element);
	}
	
	public boolean printtemprow(ArrayList<Integer> positions){ //only used when initialising, no hits possible
		int nextpos=0;
		for (int i0=0; i0<row.length; i0++){
			if (row.contents.get(i0)!=null){
				if(positions.get(nextpos)==i0){
					return false;
				}
				else{
					System.out.print(row.contents.get(i0));
				}
			}
			else if(nextpos==i0){
				System.out.print("X");
				nextpos=nextpos+1;
			}
			else {
				System.out.print("O");
			}
		}
		return true;
		
	}
	
	public void currentRow(boolean Owner){
		int i0=0;
		if(Owner){
			for (i0=0; i0<row.length; i0++){
				if(row.contents.get(i0)!=null){
					if (row.hit.get(i0)){
						System.out.print("X");
					}
					else
					{
						System.out.print(row.contents.get(i0));
					}
				}
				else
				{
					if (row.hit.get(i0)){
						System.out.print("�");
					}
					else
					{
						System.out.print("O");
					}
				}
			}
			
		} else{
			for (i0=0; i0<length; i0++){
				if(contents.get(i0)!=null){
					if (row.hit.get(i0)){
						System.out.println("X");
					}
					else
					{
						System.out.println("O");
					}
				}
				else
				{

					if (hit.get(i0)){
						System.out.println("�");
					}
					else
					{
						System.out.println("O");
					}
				}
			}
		}
	}

}

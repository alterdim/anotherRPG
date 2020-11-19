package system;

import java.util.ArrayList;

public class ArrayMaker 
{
	public ArrayList<String> make(String[] strings) 
	{
		ArrayList<String> bakedArray = new ArrayList<String>();
		for (String s:strings) 
		{
			bakedArray.add(0, s);
		}
		return bakedArray;
	}

}

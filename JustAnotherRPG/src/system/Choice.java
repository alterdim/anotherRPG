package system;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice {
	
	
	public static String getChoice(String choiceList[]) {
		int choice;
		Scanner i = new Scanner(System.in);
		for (int s = 0; s < choiceList.length; s++) 
			{
				System.out.println("[" + s + "] " + choiceList[s]);
			}
		if (i.hasNextInt()) 
		{
			choice = i.nextInt();
			if (choice >= 0 && choice < choiceList.length) 
			{
				i.close();
				return choiceList[choice];
			}
			else
			{
				System.out.println("Réponse invalide.");
				i.close();
				return getChoice(choiceList);
				
			}
		}
		else 
		{
			System.out.println("Réponse invalide.");
			i.nextLine();
			i.close();
			return getChoice(choiceList);
		}
		
				
	}

}

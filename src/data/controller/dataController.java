package data.controller;

import data.view.dataOutput;

import java.util.Scanner;

public class dataController 
{
     
	private dataOutput myOutput;
	private Scanner dataScanner;
	private String info;
	
	public void start()
	{
	  
		this.makeUserData();
	}

	public dataController()
	{
		dataScanner = new Scanner(System.in);
		
	}
	public void makeUserData()
    {
		int myAge = 33;
		double myDnD = 5.0;
		String myName = "tim";
		
		
		String userName; 
		int userAge;
		double userDnD;
		String ageData;
		String DndData;
		String nameData;
		
		System.out.println("type in your name");
		userName = dataScanner.nextLine();
		System.out.println("Type in your age");
		userAge = dataScanner.nextInt();
		System.out.println("type in the version of DnD your play (X.X)");
		userDnD = dataScanner.nextDouble();
		System.out.println("Your are " + userAge + ". Your name is " + userName + ". You play DnD " + userDnD);
		System.out.println("I am " + myAge + ". My name is " + myName + ", and I play DnD " + myDnD);
		
		if(myAge >= userAge)
		{
			ageData = "older";
		}
		else
		{
			ageData = "younger";
		}
		
		if(myDnD >= userDnD)
		{
			DndData = "superior";
		}
		else
		{
			DndData = "inferior";
		}
		
		if(myName != userName)
		{
			nameData = "different";
		}
		else
		{
			nameData = "The same";
		}
		
		info = "I am " + ageData + " than you, and my DnD is " + DndData + " to yours, and our names are " + nameData;
		
		System.out.println(info);
    }


		


	
}

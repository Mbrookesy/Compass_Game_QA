package main;

import java.util.Scanner;

public class Game {
	
	Map swamp = new Map();
	
	public Scanner getScanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
	public String askName(Scanner sc) {
		
		
		System.out.println("Please enter your name:");
		
		String name = sc.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Welcome to the game, your adventure starts here.");
		System.out.println("Press enter to begin.");
		String temp = sc.nextLine();
		gameText(name);
		return name;
	}
	
	public void gameText(String name) {
		System.out.println("The world around you feels unreal and unusual. A strong feeling of unease can be felt constantly.");
		System.out.println("The rustles of trees can be heard in the distance, they sound very familliar yet also distant to you.");
		System.out.println("You currently lack a sense of sight, simply being able to hear the bleak sounds of the trees, you guess you're in some sort of forest maybe?");
		System.out.println("As the rest of your senses slowly start to reveal themselves, you feel a wet sensation on your back and hands, goosebumps form as the sensation increases");
		System.out.println("As you slowly open your dark ridden eyes, you look around to see the answer to your questions of where, you see yourself in a grey foggy swamp");
		System.out.println("You can barely see your surroundings, only able to see about a meter in front of you.");
		System.out.println("As you stand the sounds of rustling get stronger, a possible indication of life.");
		System.out.println("You try to remember how you got here, the only words you can think of is Compass and " + name);
		System.out.println("What's a " + name + " is that your name? is that the name of this place? maybe the compass?");
		System.out.println("You feel around in your pockets as you feel a lump within your right pocket, you feel a metallic device within your pocket and take it out.");
		System.out.println("Its a compass.. it glows lightly as you hold it, it feels warm in the hand as you look at it, a reassuring sensation.");
		System.out.println("Though as you look at the compass you see the arrows are broken off yet there is a number seen on it, as you move the compass around, the number changes.");
		System.out.println("Maybe the compass can help you still, the number may be useful... and so you trot off...");
		
	}
	
	public String gameDirection(String name, int[][] map, Scanner sc, int charY, int charX) {
		System.out.println();
		System.out.println("Which direction should you go? (N/E/S/W)");
		String choice = sc.nextLine();
		return choice;
		
	}

}

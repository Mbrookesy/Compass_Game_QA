package main;

public class App {

	public static void main(String[] args) {
		boolean finished = false;
		Map swamp = new Map();
		Game adventure = new Game();
		
		int[][] updatedMap = new int[10][10];
		
		updatedMap = swamp.getMap(updatedMap);
		updatedMap = swamp.spawnPlacements(updatedMap);
		swamp.getMap(updatedMap);
		
		String name = adventure.askName(adventure.getScanner());
		
		
		do {
		//System.out.println(swamp.closest(updatedMap));
		System.out.println("The compass currently states " + swamp.compass(updatedMap) + "m");
		String choice = adventure.gameDirection(name, updatedMap, adventure.getScanner(), swamp.getCharY(), swamp.getCharX());
		updatedMap = swamp.setNewCharCord(choice, updatedMap);
		} while (finished = true);
		
	}

}

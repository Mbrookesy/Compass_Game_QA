package main;

import java.util.Random;

public class Map {
	
	int CharY = 5;
	int CharX = 5;

	public int[][] setNewCharCord(String choice, int[][] map) {
		
		if (choice.equals("N") || choice.equals("n")){
			map[getCharY()][getCharX()] = 0;
			setCharY(getCharY() - 1);
			setCharX(getCharX());
			map[getCharY()][getCharX()] = 1;
			getMap(map);
			return map;
		}	else if (choice.equals("E") || choice.equals("e")){
			map[getCharY()][getCharX()] = 0;
			setCharY(getCharY());
			setCharX(getCharX() + 1);
			map[getCharY()][getCharX()] = 1;
			getMap(map);
			return map;
		}	else if (choice.equals("S") || choice.equals("s")){
			map[getCharY()][getCharX()] = 0;
			setCharY(getCharY() + 1);
			setCharX(getCharX());
			map[getCharY()][getCharX()] = 1;
			getMap(map);
			return map;
		}	else if (choice.equals("W") || choice.equals("w")){
			map[getCharY()][getCharX()] = 0;
			setCharY(getCharY());
			setCharX(getCharX() - 1);
			map[getCharY()][getCharX()] = 1;
			getMap(map);
			return map;
		}	else {
			return map;
		}
	}

	public int[][] getMap(int[][] map) {
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}	
		System.out.println();
		return map;
	}
	
	public int getCharY() {
		return CharY;
	}

	public void setCharY(int charY) {
		CharY = charY;
	}

	public int getCharX() {
		return CharX;
	}

	public void setCharX(int charX) {
		CharX = charX;
	}

	public int[][] spawnPlacements(int[][] map) {
		
		Random ranGen = new Random();
		
		int ranTreasureY = ranGen.nextInt(map.length);
		int ranTreasureX = ranGen.nextInt(map.length);
		int ranTreeAY = ranGen.nextInt(map.length);
		int ranTreeAX = ranGen.nextInt(map.length);
		int ranTreeBY = ranGen.nextInt(map.length);
		int ranTreeBX = ranGen.nextInt(map.length);
		int ranTreeCY = ranGen.nextInt(map.length);
		int ranTreeCX = ranGen.nextInt(map.length);
		
		map[getCharY()][getCharX()] = 1;
		map[ranTreasureY][ranTreasureX] = 2;
		map[ranTreeAY][ranTreeAX] = 3;
		map[ranTreeBY][ranTreeBX] = 3;
		map[ranTreeCY][ranTreeCX] = 3;
		
		return map;
		
	}
	
	/* Unfinished Potato Code
	 * 
	 * public String closest(int[][] map) {
		int y = getCharY();
		int x = getCharX();
		boolean found = false;
		
		int stayNumber = 1;
		int counter = 0;
		int counter2 = 1;
		
		String close = "";
		int close1 = 0;
		int close2 = 0;
		
		do {
			for(int i = 0; i < stayNumber; i++) {
					if (map[y-counter][x-counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y - counter;
						close2 = x - counter2;
						return "" + close1 + close2;
						
					}
					if (map[y+counter][x+counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y + counter;
						close2 = x + counter2;
						return "" + close1 + close2;
						
					}
					if (map[y-counter2][x+counter] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y + counter2;
						close2 = x + counter;
						return "" + close1 + close2;
					}
					if (map[y+counter2][x-counter] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y + counter2;
						close2 = x - counter;
						return "" + close1 + close2;
					}
					if (map[y-counter2][x-counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y - counter2;
						close2 = x - counter2;
						return "" + close1 + close2;
					}
					if (map[y+counter2][x+counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y + counter2;
						close2 = x + counter2;
						return "" + close1 + close2;
					}
					if (map[y-counter2][x+counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y - counter2;
						close2 = x + counter2;
						return "" + close1 + close2;
					}
					if (map[y+counter2][x-counter2] != 0 && map[y-counter][x-counter2] != 1) {
						found = true;
						close1 = y + counter2;
						close2 = x - counter2;
						return "" + close1 + close2;
					}
					counter++;
			}
			counter2++;
			stayNumber = stayNumber * 2;
			counter = 0;
		} while(found = true);
		return "";
		
	}*/
	
	public int compass(int[][] map) {
		int y = getCharY();
		int x = getCharX();
		
		return 1;
		
	}
	
	

}

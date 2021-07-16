import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class MonsterGame {
	
	public static void main (String[] args) {
		Monster.buildBattleBoard();
		
		char[][] tempBattleBoard = new char [10][10];
		
		//array with monster objects
		Monster [] monsters = new Monster[4]; 
		monsters[0] = new Monster (1000, 20, 1, "Frank");
		monsters[1] = new Monster (500, 40, 2, "Drac");
		monsters[2] = new Monster (1000, 20, 1, "Paul");
		monsters[3] = new Monster (1000, 20, 1, "George");
		
		Monster.redrawBoard();
		
		//make monsters move
		for (Monster m : monsters) {
			if (m.getAlive()) {
				int itemIndex  = ArrayUtils.indexOf(monsters, m);
				m.move(monsters, itemIndex);
			}
		}
		
		Monster.redrawBoard();
	}
}
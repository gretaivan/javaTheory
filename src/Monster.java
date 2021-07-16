import java.util.Arrays;

public class Monster {
	
	static char [][] battleBoard = new char [10][10];
	
	public static void buildBattleBoard () {
		//populate array rows
		for(char [] row : battleBoard ) {
			Arrays.fill(row, '*'); 
		}
	}
	
	public static void redrawBoard () {
		int k = 1;
		
		while(k <= 30) {
			System.out.print('-'); 
			k++;
		}
		System.out.println(); 
		
		for(int i = 0; i < battleBoard.length; i++) {
			for(int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" +  battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		
		while(k <= 30) {
			System.out.print('-'); 
			k++;
		}
		System.out.println(); 
	}
	
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2; 
	private boolean alive = true; 
	
	public String name = "Big Monster"; 
	public char alias = 'B';
	public int x = 0; 
	public int y = 0; 
	public static int monsterCount = 0;	
	
	public Monster () {
		monsterCount++;
	}
	
	public Monster (int health, int attack, int movement, String name) {
		this.health = health;
		this.attack = attack;
		this.movement = movement; 
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length - 1; 
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randomNumX, randomNumY; 
		
		do {
			randomNumX = (int)(Math.random() * maxXBoardSpace); 
			randomNumY = (int)(Math.random() * maxYBoardSpace);
		} while (battleBoard[randomNumX][randomNumY] != '*');
		
		this.x = randomNumX; 
		this.y = randomNumY;
		
		this.alias = this.name.charAt(0);
		
		battleBoard[this.y][this.x] = this.alias; 
		
		monsterCount++;
		
	}
	
	//setters getters
	public boolean getAlive() {
		return alive;
	}
	
	public int getMovement() {
		return movement;
	}

	public void move(Monster[] monsters, int itemIndex) {
		//is the space open for move? 
		boolean isOpen = true; 
		
	    int maxXBoardSpace = battleBoard.length - 1;
	    int maxYBoardSpace = battleBoard[0].length - 1;

		//check that it does not fall of the board and does not move into the occupied place
		while (isOpen) {
			//move direction and distance
			int randMoveDir = (int)(Math.random() * 4);
			int randomDistance = (int)(Math.random() * (this.getMovement() + 1));
			
			System.out.println("Direction: " + randMoveDir + " and distance " + randomDistance);
			
			//reset board
			battleBoard[this.y][this.x] = '*'; 
			
			//move north
			if (randMoveDir == 0) {
				if ((this.y - randomDistance) < 0  ) {
					this.y = 0; 
				} else {
					this.y = this.y - randomDistance; 
				}
			} else if (randMoveDir == 1 ) {
				if ((this.x - randomDistance) > maxXBoardSpace  ) {
					this.x = maxXBoardSpace; 
				} else {
					this.x = x - randomDistance; 
				}
			} else if (randMoveDir == 2 ) {
				if ((this.y - randomDistance) > maxYBoardSpace  ) {
					this.y = maxYBoardSpace; 
				} else {
					this.y = y - randomDistance; 
				}
			} else {
				if ((this.x - randomDistance) <  0) {
					this.x = 0; 
				} else {
					this.x = x - randomDistance;
				}
			}
			
			for (int i = 0; i < monsters.length; i++) {
				if (i == itemIndex) {
					continue; 
				}
				if (spaceTaken(monsters, i, itemIndex)) {
					isOpen = true; 
					break; 
				} else {
					isOpen = false;
				}
			}
		} // end of while loop
		
		battleBoard[this.y][this.x] = this.alias; 

	} // end of move method

	private boolean spaceTaken(Monster[] monsters, int indexToCheck, int itemIndex) {
		if ((monsters[indexToCheck] == monsters[itemIndex])) {
			return true; 
		} else {
			return false;
		}
	}
	
}
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
	
}
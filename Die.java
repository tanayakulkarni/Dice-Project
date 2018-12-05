import java.util.Scanner;
public class Die{

	private int side;
	private int value;
	Scanner reader = new Scanner(System.in);

	public Die(){
		side = 6;
		value = (int)(Math.random()*side)+1;
	}

	public Die(int side, int value){
		this.side = side;
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public void roll(){
		value = (int)(Math.random()*side)+1;
	}

	public String toString(){
		return "Number of side: " + side + ", Value: " + value;
	}

}
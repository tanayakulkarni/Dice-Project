import java.util.Scanner;
public class Die{

	private int side;
	private int value;
	Scanner reader = new Scanner(System.in);

	public Die(){
		side = 6;
		value = (int)(Math.random()*side)+1;
	}

	public Die(int side){
		this.side = side;
		value = (int)(Math.random()*side)+1;
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
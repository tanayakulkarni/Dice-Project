import java.util.ArrayList;
public class DiceRunner{
	public static void main(String args[]){
	//Test 1
	System.out.println("Test 1: ");
	Die die1= new Die();
	Die die2= new Die();
	int number =0;
	int count=0;
	while(number==0){
	die1.roll();
	die2.roll();
	if(die1.getValue()==1 && die2.getValue()==1)
	number++;
	System.out.println("Die 1: "+die1);
	System.out.println("Die 2: "+die2);
	count++;
	}
		System.out.println("Number of times rolled until snake eyes: "+count+"\n");

	//Test2
	System.out.println("Test 2: ");
	int side;
	DiceHolder holder= new DiceHolder();
	for(int i=0; i<10; i++){
		side= (int)(Math.random()*20+1);
		holder.addDie(new Die(side));
		}
		System.out.println(holder);

		holder.shake();
	System.out.println(holder);
	}
}
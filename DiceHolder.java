import java.util.ArrayList;
public class DiceHolder{


	public DiceHolder(){
		private ArrayList<Die> holder = new ArrayList<>();
	}

	public int addDie(Die die){
	holder.add(Die);
	if(holder.size()<=6)
	return 1;
	else return -1;
	}

	public void shake(){
		holder.roll();
	}
	public String toString(){
		int count=0;
		return "Dice #1: "+holder.get(count)+"\n";
	}
}
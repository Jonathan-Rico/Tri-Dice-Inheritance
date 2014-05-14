public class Dice {	
	public int Throw(int dices) {	
		int total = 0;
		for (int k = dices; k >0; k--){
			int die = (int) (1 + (Math.random() * 6));
			System.out.printf("Dice %d is % d\n", k , die);
			total = total + die;
		}
			System.out.printf("%s\n", total);
			return total;
	}
}
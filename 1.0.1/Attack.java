package Game_ver2;

import java.util.Random;

public class Attack extends Chara{


	public static int attack(int a) {

		int attack = 0;

		Random rand = new Random();
		return attack = rand.nextInt(10) * (a);
	}
}

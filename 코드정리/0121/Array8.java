import java.util.Random;

public class Array8 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*45)+1);

		Random rand = new Random();
		System.out.println(rand.nextInt(45)+1);
	}

}

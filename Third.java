public class Third {
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		if (amount <= 0) {
			System.out.println("Error");
		}
		else {
			double answer = 1d;
			for (int i = 1; i <= amount; i++) {
				answer = answer * i * i * 2 * 2 / ((2 * i - 1) * (2 * i + 1)); 
			}
			answer *= 2;
			System.out.println(answer);
		}
	}
}

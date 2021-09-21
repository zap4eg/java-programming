public class First {
	public static void main(String[] args) {
		final double g = 9.81d;
		double time = Double.parseDouble(args[0]);
		if (time <= 0) {
			System.out.println("Error");
		}
		else {
			double answer = g * time * time / 2;
			System.out.println(answer);
		}
	}
}

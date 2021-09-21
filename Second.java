public class Second {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		if (radius <= 0) {
			System.out.println("Error");
		}
		else {
			double length = 2 * 3.14d * radius, square = 3.14d * radius * radius;
			System.out.print("Length is ");
			System.out.println(length);
			System.out.print("Square is ");
			System.out.println(square);
		}
	}
}

public class Ninth {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]), y = Double.parseDouble(args[1]), 
		radius = Double.parseDouble(args[2]),  x0 = Double.parseDouble(args[3]), y0 = Double.parseDouble(args[4]);
		if ((x - x0) * (x - x0) + (y - y0) * (y - y0) == radius * radius) {
			System.out.println("Point is on circle");
		}
		else {
			System.out.println("Point isn't on circle");	
		}
	}
}

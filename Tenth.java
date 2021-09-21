public class Tenth {
	public static void main(String[] args) {
		int side = Integer.parseInt(args[0]);
		if (side <= 0) {
			System.out.println("Error");
		}
		else {
			for (int i = 0; i < side; i++) {
				for (int j = 0; j < side; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}
}

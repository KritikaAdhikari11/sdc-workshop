public class pattern {
	public static void main(String[] args) {
		int[] counts = {5, 4, 3, 4, 5};
		for (int count : counts) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
				if (i < count - 1) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
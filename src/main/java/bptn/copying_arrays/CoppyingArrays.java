package bptn.copying_arrays;

/**
 * Hello world!
 *
 */
public class CoppyingArrays {
	public static void main(String[] args) {
		int[] shoes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		int[] shoeRack = new int[7];

		int shoeRackIndex = 0; // Index for the destination array

		for (int i = 0; i < shoes.length; i++) {
			// If the shoeRack array is full, create a larger array
			if (shoeRackIndex == shoeRack.length) {
				shoeRack = createBigShoeRack(shoeRack);
			}
			// Copy the element from the source shoes to the shoeRack array
			shoeRack[shoeRackIndex] = shoes[i];
			shoeRackIndex++;
		}

		// Print the elements of the shoeRack array to verify
		for (int i = 0; i < shoeRackIndex; i++) {
			System.out.print("   " + shoeRack[i]);

		}
	}

	// Method to create a larger array (shoeRack) and copy the existing elements
	// into it
	private static int[] createBigShoeRack(int[] smallerShoeRack) {
		int newSize = smallerShoeRack.length * 2; // Double the size of the smaller ShoeRack
		int[] newShoeRack = new int[newSize];
		for (int i = 0; i < smallerShoeRack.length; i++) {
			newShoeRack[i] = smallerShoeRack[i];
		}
		return newShoeRack;
	}
}

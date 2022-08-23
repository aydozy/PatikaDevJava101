package Arrays;

public class DiziHarmonaikHesap {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		double sum = 0.0;

		// Harmonic sum
		for (int i = 0; i < numbers.length; i++) {
			sum += (1 / numbers[i]);
		}

		double averageHarmonic = numbers.length / sum;
		System.out.println(averageHarmonic);

	}

}

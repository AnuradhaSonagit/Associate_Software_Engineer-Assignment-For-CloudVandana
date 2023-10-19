import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array using the Fisher-Yates shuffle algorithm
        shuffleArray(originalArray);

        // Print the shuffled array
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap the elements at index i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}

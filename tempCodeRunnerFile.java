public class tempCodeRunnerFile{
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4}; // Sample array

        // Find the maximum subarray sum
        int maxSubArraySum = findMaxSubArraySum(array);

        // Print the maximum subarray sum
        System.out.println("Maximum subarray sum: " + maxSubArraySum);
    }

    // Function to find the maximum subarray sum
    public static int findMaxSubArraySum(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

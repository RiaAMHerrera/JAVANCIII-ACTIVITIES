// Write a program featuring an integer variable arguments method. //
// The method should return the sum of all parameters and, for each parameter, //
// the cumulative sum up to that point. For instance, given parameters (4, 5, 10), //
// the program should compute the total for the first parameter, such as 4 = (1+2+3+4), //
// and repeat this process for subsequent parameters.

public class CumulativeSum {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        int[] sums = calculateCumulativeSum(numbers);

        System.out.println("Cumulative Sums:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " = " + sums[i]);
        }
    }

    public static int[] calculateCumulativeSum(int... nums) {
        int[] cumulativeSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 1; j <= nums[i]; j++) {
                sum += j;
            }
            cumulativeSums[i] = sum;
        }

        return cumulativeSums;
    }
}
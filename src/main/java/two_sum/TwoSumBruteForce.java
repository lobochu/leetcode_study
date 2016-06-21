package two_sum;

/**
 * Created by Lobo on 2016/05/15 19:00.
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * Given: array of integers
 * When: define the target
 * Then: return index of two numbers add up the target
 */
public class TwoSumBruteForce implements TwoSum {


    @Override
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }
        return null;
    }
}

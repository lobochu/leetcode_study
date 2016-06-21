package two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lobo on 2016/05/18 12:17.
 */
public class TwoSumHash implements TwoSum {
    @Override
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numbersMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int expected = target - numbers[i];
            if (numbersMap.containsKey(expected)) {
                int indexOfExpected = numbersMap.get(expected);
                if (i != indexOfExpected) {
                    return new int[]{i, indexOfExpected};
                }
            }
        }
        throw new IllegalArgumentException("No solution for given target");
    }
}

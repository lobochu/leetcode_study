package two_sum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Lobo on 2016/05/15 19:00.
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * Given: array of integers
 * When: define the target
 * Then: return index of two numbers add up the target
 */

public class TwoSumTest {

    private TwoSum twoSumBruteForce = new TwoSumBruteForce();

    @Test
    public void first_two_numbers_meet_target() {
        //Arrange extract to common inputNumbers
        int[] inputNumbers = new int[]{2, 7, 11, 15};

        //Act
        int target = 9;

        //Assert
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSumBruteForce.twoSum(inputNumbers, target));
    }

    @Test
    public void middle_two_numbers_meet_target() {
        //Arrange extract to common inputNumbers
        int[] inputNumbers = new int[]{2, 7, 11, 15};

        //Act
        int target = 18;

        //Assert
        int[] expected = new int[]{1, 2};
        int[] result = twoSumBruteForce.twoSum(inputNumbers, target);
        assertArrayEquals(expected,result);
    }

    @Test
    public void no_numbers_meet_target_then_thow_exception() {
        //Arrange extract to common inputNumbers
        int[] inputNumbers = new int[]{2, 7, 11, 15};


        //Act
        int target = 0;
        int[] result = twoSumBruteForce.twoSum(inputNumbers, target);

        //Assert expect throw exceptions
        assertArrayEquals(null,result);
    }

    @Test
    public void two_zero_should_return_both_index() {
        //Arrange
        int[] inputNumbers = new int[]{0, 4, 3, 0};

        //Act
        int target = 0;
        int[] expected = new int[] {0, 3};
        int[] result = twoSumBruteForce.twoSum(inputNumbers, target);

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void first_two_numbers_meet_target_hash_version() {
        //Arrange extract to common inputNumbers
        int[] inputNumbers = new int[]{2, 7, 11, 15};
        TwoSum twoSumHash = new TwoSumHash();

        //Act
        int target = 9;

        //Assert
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSumHash.twoSum(inputNumbers, target));
    }

    @Test
    public void last_two_numbers_meet_target_hash_version() {
        //Arrange
        int[] inputNumbers = new int[]{3, 2, 4};
        TwoSum twoSumHash = new TwoSumHash();

        //Act
        int target = 6;

        //Assert
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, twoSumHash.twoSum(inputNumbers, target));
    }

    @Test
    public void nagative_numbers_meet_target_hash_version() {
        //Arrange
        int[] inputNumbers = new int[]{-1,-2,-3,-4,-5};
        TwoSum twoSumHash = new TwoSumHash();

        //Act
        int target = -8;

        //Assert
        int[] expected = new int[]{2, 4};
        assertArrayEquals(expected, twoSumHash.twoSum(inputNumbers, target));
    }
}

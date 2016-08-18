package projecteuler;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class problem_1 {
    /**
     * Get the sum of all multiples of 3 and 5 that are between 1 and the upper-bound.
     * <p>
     *     This method uses {@code .filter()} and {@code .sum()} to derive the end result.
     * </p>
     *
     * @param upperBound The exclusive upper-bound of the Integer range
     * @return The sum of all multiples of 3 and 5 below the upper-bound
     */
    public static Integer getMultiplesOf3and5UsingFilter(Integer upperBound) {
        return IntStream.range(3, upperBound)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    /**
     * Get the sum of all multiples of 3 and 5 that are between 1 and the upper-bound.
     * <p>
     *     This method uses {@code .reduce()} to derive the end result.
     * </p>
     *
     * @param upperBound The exclusive upper-bound of the Integer range
     * @return The sum of all multiples of 3 and 5 below the upper-bound
     */
    public static Integer getMultiplesOf3And5UsingReduce(Integer upperBound) {
        return IntStream.range(4, upperBound)
                .reduce(3, (acc, i) -> i % 3 == 0 || i % 5 == 0 ? acc += i : acc);
    }
}

import org.junit.Test;
import projecteuler.problem_1;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for problem 1
 */
public class problem_1test {
    @Test
    public void should_Return_23_for_Range_Between_1_and_10_Using_Filter_and_Sum() {
        int result = problem_1.getMultiplesOf3and5UsingFilter(10);
        assertThat(result).isEqualTo(23);
    }

    @Test
    public void should_Return_233168_for_Range_Between_1_and_1000_Using_Filter_and_Sum() {
        int result = problem_1.getMultiplesOf3and5UsingFilter(1000);
        assertThat(result).isEqualTo(233168);
    }

    @Test
    public void should_Return_23_for_Range_Between_1_and_10_Using_Reduce() {
        int result = problem_1.getMultiplesOf3And5UsingReduce(10);
        assertThat(result).isEqualTo(23);
    }

    @Test
    public void should_Return_233168_for_Range_Between_1_and_1000_Using_Reduce() {
        int result = problem_1.getMultiplesOf3And5UsingReduce(1000);
        assertThat(result).isEqualTo(233168);
    }
}


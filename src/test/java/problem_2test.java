import org.junit.Test;
import projecteuler.problem_2;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for problem 2
 */
public class problem_2test {

    @Test
    public void should_Return_4613732() {
        Long result = problem_2.getSumOfEvenFibonacciNumbers(10L);
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(4613732);

    }
}

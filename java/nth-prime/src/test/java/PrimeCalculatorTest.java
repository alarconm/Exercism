import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PrimeCalculatorTest {
    private PrimeCalculator primeCalculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        primeCalculator = new PrimeCalculator();
    }

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculator.nth(1), is(2));
    }

<<<<<<< HEAD
    @Ignore("Remove to run test")
=======
>>>>>>> c7fe0893c0060329c3aa6fd8ffc6ef2bf62c5e3e
    @Test
    public void testSecondPrime() {
        assertThat(primeCalculator.nth(2), is(3));
    }

<<<<<<< HEAD
    @Ignore("Remove to run test")
=======
>>>>>>> c7fe0893c0060329c3aa6fd8ffc6ef2bf62c5e3e
    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.nth(6), is(13));
    }

<<<<<<< HEAD
    @Ignore("Remove to run test")
=======
>>>>>>> c7fe0893c0060329c3aa6fd8ffc6ef2bf62c5e3e
    @Test
    public void testBigPrime() {
        assertThat(primeCalculator.nth(10001), is(104743));
    }

<<<<<<< HEAD
    @Ignore("Remove to run test")
=======
>>>>>>> c7fe0893c0060329c3aa6fd8ffc6ef2bf62c5e3e
    @Test
    public void testUndefinedPrime() {
        expectedException.expect(IllegalArgumentException.class);
        primeCalculator.nth(0);
    }

}

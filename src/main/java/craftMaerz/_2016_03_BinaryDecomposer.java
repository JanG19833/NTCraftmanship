package craftMaerz;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class _2016_03_BinaryDecomposer {

    private String determineResult(int valueToConvert) {
        return "";
    }

    @Test
    public void numbersAreDeterminedCorrectly() {
        assertThat(determineResult(0), is("0"));
        assertThat(determineResult(1), is("1"));
        assertThat(determineResult(2), is("2"));
        assertThat(determineResult(3), is("1 1"));
        assertThat(determineResult(4), is("2 0"));
        assertThat(determineResult(5), is("5"));
        assertThat(determineResult(6), is("1 2"));
        assertThat(determineResult(7), is("1 1 1"));
        assertThat(determineResult(8), is("2 0 0"));
        assertThat(determineResult(9), is("2 1"));
        assertThat(determineResult(10), is("10"));
        assertThat(determineResult(50), is("1 2 2"));
        assertThat(determineResult(100), is("1 2 2 0"));
        assertThat(determineResult(1000), is("1 1 1 1 10 0 0"));
        assertThat(determineResult(10000), is("2 1 1 2 0 2 0 0 0"));
        assertThat(determineResult(12566), is("1 2 0 2 0 5 2"));
        assertThat(determineResult(432879), is("1 10 1 21 1 5 1 1 1"));
        assertThat(determineResult(5625647), is("85 1 21 1 2 5 1 1 1"));
        assertThat(determineResult(76254865), is("2 2 0 5 1 2 0 1 1 10 2 0 1"));
        assertThat(determineResult(126769454), is("1 1 1 2 0 1 1 2 5 2 2 5 1 2"));
        assertThat(determineResult(2005944311), is("1 1 5 1 1 2 2 0 0 0 2 0 1 1 1 1 1 1 5 1 1"));
    }
}
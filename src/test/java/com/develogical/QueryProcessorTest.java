package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void isPlus() throws Exception {
        assertThat(queryProcessor.process("64cf6090: what is 8 plus 7"), containsString("15"));
    }

    @Test
    public void isLargest() throws Exception {
        assertThat(queryProcessor.process("69e793c0: which of the following numbers is the largest: 579, 933, 84, 67"),
                containsString("933"));
    }

    @Test
    public void isTheresa() throws Exception {
        assertThat(queryProcessor.process("69e793c0: Theresa May"),
                containsString("2016"));
    }

    @Test
    public void isCubeSquare() throws Exception {
        assertThat(queryProcessor.process("69e793c0: which of the following numbers is both a square and a cube: 107, 841, 169, 117649"),
                containsString("117649"));
    }

    @Test
    public void isFibonacci() throws Exception {
        assertThat(queryProcessor.process("69e793c0: what is the 19th number in the fibonacci seq"),
                containsString("4181"));
    }

    @Test
    public void isPrimes() throws Exception {
        assertThat(queryProcessor.process("69e793c0: which of the following numbers are primes: " +
                        "2, 3, 5, 11, 13, 25, 124"),
                containsString("2, 3, 5, 11, 13"));
    }

    @Test
    public void isPower() throws Exception {
        assertThat(queryProcessor.process("69e793c0: what is 2 to the power of 3"),
                containsString("8"));
    }

}

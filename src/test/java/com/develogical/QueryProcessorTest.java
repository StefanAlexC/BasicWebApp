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
}

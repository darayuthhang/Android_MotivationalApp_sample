package com.darayuth.motivationapp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JackMaQuoteTest {


    private JackMaQuote jackMaQuote;
    private int TestInt;

    @Before
    public void setup(){
        jackMaQuote = new JackMaQuote(10, "Jackma");
    }

    @Test
    public void testForPositivegetImageAndQuote() {
        assertEquals("Jackma", jackMaQuote.getQuote());
        assertEquals(10, jackMaQuote.getImage());
    }
    @Test
    public void testForNegativeImageAndQupte(){
        assertFalse("jackmas".equals(jackMaQuote.getQuote()));
        assertFalse(3 == jackMaQuote.getImage());
    }
}
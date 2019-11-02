package com.darayuth.motivationapp.model;

/**** The concrete implementation of Quote ****/
public class JackMaQuote implements Quote {
    /***private field of this class ***/
    private int image;
    private String quote;
    /*****
     * Construct JackMaQuote instance
     * @param image image of the Author
     * @param quote Quote of the Author
     */
    public JackMaQuote(int image, String quote){
        this.image = image;
        this.quote = quote;

    }
    /*** return the image of the Author ****/
    @Override
    public int getImage() {
        return this.image;
    }
    /**** return the quote of the Author ****/
    @Override
    public String getQuote() {
        return this.quote;
    }
}

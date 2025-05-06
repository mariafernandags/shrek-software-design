package br.edu.unifei.ecot12a;

public class Wizard extends Human {
    private boolean beard;
    private String magicHat;
    private boolean book;
    public boolean isBeard() {
        return beard;
    }
    public void setBeard(boolean beard) {
        this.beard = beard;
    }
    public String getMagicHat() {
        return magicHat;
    }
    public void setMagicHat(String magicHat) {
        this.magicHat = magicHat;
    }
    public boolean isBook() {
        return book;
    }
    public void setBook(boolean book) {
        this.book = book;
    }
}

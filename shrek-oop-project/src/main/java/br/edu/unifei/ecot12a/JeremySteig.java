package br.edu.unifei.ecot12a;

public class JeremySteig extends Human{
    private String musicalPrecision;
    private Flute flute = new Flute();
    public String getMusicalPrecision() {
        return musicalPrecision;
    }
    public void setMusicalPrecision(String musicalPrecision) {
        this.musicalPrecision = musicalPrecision;
    }
    public Flute getFlute() {
        return flute;
    }
    public void setFlute(Flute flute) {
        this.flute = flute;
    }
}

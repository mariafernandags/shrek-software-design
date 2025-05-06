package br.edu.unifei.ecot12a;

public class Flute extends EnchantedObject {
    private float range;
    private String musicalStile;
    private Melody melody = new Silence();
    public void executeMelody(){
        melody.execute(this);
    }
    public float getRange() {
        return range;
    }
    public void setRange(float range) {
        this.range = range;
    }
    public String getMusicalStile() {
        return musicalStile;
    }
    public void setMusicalStile(String musicalStile) {
        this.musicalStile = musicalStile;
    }
    public Melody getMelody() {
        return melody;
    }
    public void setMelody(Melody melody) {
        this.melody = melody;
    }

}

package br.edu.unifei.ecot12a;

public abstract class Potion {
    private int duration;
    private String effect;
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
}

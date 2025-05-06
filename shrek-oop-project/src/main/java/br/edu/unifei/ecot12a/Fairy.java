package br.edu.unifei.ecot12a;

import java.util.ArrayList;
import java.util.List;

public class Fairy extends Human {
    private boolean wings;
    private String wingColor;
    private String brightness;
    private List <Potion> potions = new ArrayList<Potion>();
    private List <Curse> curses = new ArrayList<Curse>();
    private EnchantedObject magic_wand = new EnchantedObject();
    public boolean isWings() {
        return wings;
    }
    public void setWings(boolean wings) {
        this.wings = wings;
    }
    public String getWingColor() {
        return wingColor;
    }
    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }
    public String getBrightness() {
        return brightness;
    }
    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }
    public List<Potion> getPotions() {
        return potions;
    }
    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }
    public List<Curse> getCurses() {
        return curses;
    }
    public void setCurses(List<Curse> curses) {
        this.curses = curses;
    }
    public EnchantedObject getMagic_wand() {
        return magic_wand;
    }
    public void setMagic_wand(EnchantedObject magic_wand) {
        this.magic_wand = magic_wand;
    }
}

package br.edu.unifei.ecot12a;

import java.util.ArrayList;
import java.util.List;

public class Being {
    private String name;
    private int age;
    private float height;
    private boolean evil;
    private String gender;
    private Curse curse;
    private Kingdom kingdom;
    private Being partner;
    private Being child;   
    private List <EnchantedObject> objects = new ArrayList<EnchantedObject>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public boolean isEvil() {
        return evil;
    }
    public void setEvil(boolean evil) {
        this.evil = evil;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Curse getCurse() {
        return curse;
    }
    public void setCurse(Curse curse) {
        this.curse = curse;
    }
    public Kingdom getKingdom() {
        return kingdom;
    }
    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }
    public Being getPartner() {
        return partner;
    }
    public void setPartner(Being partner) {
        this.partner = partner;
    }
    public Being getChild() {
        return child;
    }
    public void setChild(Being child) {
        this.child = child;
    }
    public List<EnchantedObject> getObjects() {
        return objects;
    }
    public void setObjects(List<EnchantedObject> objects) {
        this.objects = objects;
    }
    
}

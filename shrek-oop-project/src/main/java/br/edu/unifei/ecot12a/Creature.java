package br.edu.unifei.ecot12a;

public class Creature extends Being{
    private String type;
    private String magicAbility;
    private boolean friendly;   
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMagicAbility() {
        return magicAbility;
    }
    public void setMagicAbility(String magicAbility) {
        this.magicAbility = magicAbility;
    }
    public boolean isFriendly() {
        return friendly;
    }
    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }
}

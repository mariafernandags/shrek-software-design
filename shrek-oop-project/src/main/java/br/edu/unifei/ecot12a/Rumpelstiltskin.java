package br.edu.unifei.ecot12a;

import java.util.ArrayList;
import java.util.List;

public class Rumpelstiltskin extends Creature{
    private String currentPersonality;
    private String negociationHability;
    private boolean transformationHability;
    private List <Contract> contracts = new ArrayList <Contract>();
    private static Rumpelstiltskin instance = new Rumpelstiltskin();
    private Rumpelstiltskin(){}
    public String getCurrentPersonality() {
        return currentPersonality;
    }
    public void setCurrentPersonality(String currentPersonality) {
        this.currentPersonality = currentPersonality;
    }
    public String getNegociationHability() {
        return negociationHability;
    }
    public void setNegociationHability(String negociationHability) {
        this.negociationHability = negociationHability;
    }
    public boolean isTransformationHability() {
        return transformationHability;
    }
    public void setTransformationHability(boolean transformationHability) {
        this.transformationHability = transformationHability;
    }
    public List<Contract> getContracts() {
        return contracts;
    }
    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
    public static Rumpelstiltskin getInstance() {
        return instance;
    }
    public static void setInstance(Rumpelstiltskin instance) {
        Rumpelstiltskin.instance = instance;
    }
}

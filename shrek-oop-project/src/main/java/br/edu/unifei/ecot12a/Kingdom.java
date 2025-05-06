package br.edu.unifei.ecot12a;

public class Kingdom {
    private String name;
    private int population;
    private Biome biome;
    private Castle castle;
    private Being king;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public Biome getBiome() {
        return biome;
    }
    public void setBiome(Biome biome) {
        this.biome = biome;
    }
    public Castle getCastle() {
        return castle;
    }
    public void setCastle(Castle castle) {
        this.castle = castle;
    }
    public Being getKing() {
        return king;
    }
    public void setKing(Being king) {
        this.king = king;
    }
}

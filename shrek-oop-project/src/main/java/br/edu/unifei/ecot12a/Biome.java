package br.edu.unifei.ecot12a;

public class Biome {
    private String name;
    private float area;
    private String climate;
    private String humidity;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public String getClimate() {
        return climate;
    }
    public void setClimate(String climate) {
        this.climate = climate;
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}

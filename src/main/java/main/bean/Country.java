package main.bean;

public class Country {
    private String name;
    private int population;
    private String capital;
    private String continent;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }
}



package model;
import model.Season;

import java.util.Arrays;

public class Series extends Product{

    private String censoreMotive;
    private String[] mainCharacters;
    public Season[] seasons;
    private Date realeaseDate;
    private Censored isCensored;

    //Constructor
    public Series(String name, String sinopsis, String director, String trailer,String censoreMotive, Date realeaseDate, Censored isCensored)  {
        super(name, sinopsis, director, trailer);
        this.censoreMotive = censoreMotive;
        this.mainCharacters = mainCharacters;
        this.realeaseDate = realeaseDate;
		seasons = new Season[6];
		this.isCensored = isCensored;
    
	}
    //Getters & Setters

    public Censored getIsCensored() {
        return isCensored;
    }

    public void setIsCensored(Censored isCensored) {
        this.isCensored = isCensored;
    }

    public Season[] getSeasons() {
        return seasons;
    }

    public void setSeasons(Season[] seasons) {
        this.seasons = seasons;
    }

    public Date getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(Date realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public String getCensoreMotive() {
        return censoreMotive;
    }

    public void setCensoreMotive(String censoreMotive) {
        this.censoreMotive = censoreMotive;
    }

    public String[] getMainCharacters() {
        return mainCharacters;
    }

    public void setMainCharacters(String[] mainCharacters) {
        this.mainCharacters = mainCharacters;
    }


}

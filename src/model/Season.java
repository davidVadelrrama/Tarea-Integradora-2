package model;

public class Season {

    private int seasonNum;
    private int programmedEpisodes;
    private int releasedEpisodes;

    public Season(int seasonNum, int programmedEpisodes, int releasedEpisodes) {
        this.seasonNum = seasonNum;
        this.programmedEpisodes = programmedEpisodes;
        this.releasedEpisodes = releasedEpisodes;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public void setSeasonNum(int seasonNum) {
        this.seasonNum = seasonNum;
    }

    public int getProgrammedEpisodes() {
        return programmedEpisodes;
    }

    public void setProgrammedEpisodes(int programmedEpisodes) {
        this.programmedEpisodes = programmedEpisodes;
    }

    public int getReleasedEpisodes() {
        return releasedEpisodes;
    }

    public void setReleasedEpisodes(int releasedEpisodes) {
        this.releasedEpisodes = releasedEpisodes;
    }
}

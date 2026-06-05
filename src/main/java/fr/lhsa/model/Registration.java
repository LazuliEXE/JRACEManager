package fr.lhsa.model;

public class Registration {

    private int id;

    private Team team;

    private Coureur coureur;

    private Race race;

    private int bibNumber;

    private Long chronoMs;

    public Registration() {
    }

    public Registration(
            int id,
            Team team,
            Coureur coureur,
            Race race,
            int bibNumber,
            Long chronoMs
    ) {

        this.id = id;
        this.team = team;
        this.coureur = coureur;
        this.race = race;
        this.bibNumber = bibNumber;
        this.chronoMs = chronoMs;
    }

    public int getId() {
        return id;
    }

    public Coureur getCoureur() {
        return coureur;
    }

    public Team getTeam() {
        return team;
    }

    public Race getRace() {
        return race;
    }

    public int getBibNumber() {
        return bibNumber;
    }

    public Long getChronoMs() {
        return chronoMs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoureur(Coureur coureur) {
        this.coureur = coureur;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setBibNumber(int bibNumber) {
        this.bibNumber = bibNumber;
    }

    public void setChronoMs(Long chronoMs) {
        this.chronoMs = chronoMs;
    }
}
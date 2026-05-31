package fr.lhsa.model;

public class Registration {

    private int id;

    private Coureur coureur;

    private Race race;

    private int bibNumber;

    private Double chrono;

    public Registration() {
    }

    public Registration(
            int id,
            Coureur coureur,
            Race race,
            int bibNumber,
            Double chrono
    ) {

        this.id = id;
        this.coureur = coureur;
        this.race = race;
        this.bibNumber = bibNumber;
        this.chrono = chrono;
    }

    public int getId() {
        return id;
    }

    public Coureur getCoureur() {
        return coureur;
    }

    public Race getRace() {
        return race;
    }

    public int getBibNumber() {
        return bibNumber;
    }

    public Double getChrono() {
        return chrono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoureur(Coureur coureur) {
        this.coureur = coureur;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setBibNumber(int bibNumber) {
        this.bibNumber = bibNumber;
    }

    public void setChrono(Double chrono) {
        this.chrono = chrono;
    }
}
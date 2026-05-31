package fr.lhsa.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private int id;

    private String name;

    private String location;

    private Integer codePostal;

    private LocalDate date;

    private LocalDate dateFin;

    private List<Race> races = new ArrayList<>();

    public Event() {
    }

    public Event(int id, String name, String location, Integer codePostal, LocalDate date, LocalDate dateFin) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.codePostal = codePostal;
        this.date = date;
        this.dateFin = dateFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public List<Race> getRaces() {
        return races;
    }
}
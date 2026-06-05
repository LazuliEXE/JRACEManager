package fr.lhsa.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Race {

    private int id;

    private String name;

    private double distance;

    private LocalDate date;

    private LocalTime heureLancement;

    private int dossardStart;

    private int dossardEnd;

    private int dossardLitigeStart;

    private int dossardLitigeEnd;

    private Category categoryMin;

    private int nbCoureurParInscription;

    private Event event;

    private List<Registration> registrations = new ArrayList<>();

    public Race() {
    }

    public Race(int id,
                String name,
                double distance,
                LocalDate date,
                LocalTime heureLancement ,
                int dossardStart,
                int dossardEnd,
                int dossardLitigeStart,
                int dossardLitigeEnd,
                Category categoryMin,
                int nbCoureurParInscription,
                Event event) {
        this.date = date;
        this.heureLancement = heureLancement;
        this.dossardStart = dossardStart;
        this.dossardEnd = dossardEnd;
        this.dossardLitigeStart = dossardLitigeStart;
        this.dossardLitigeEnd = dossardLitigeEnd;
        this.categoryMin = categoryMin;
        this.nbCoureurParInscription = nbCoureurParInscription;
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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureLancement() {
        return heureLancement;
    }

    public void setHeureLancement(LocalTime heureLancement) {
        this.heureLancement = heureLancement;
    }

    public int getDossardStart() {
        return dossardStart;
    }

    public void setDossardStart(int dossardStart) {
        this.dossardStart = dossardStart;
    }

    public int getDossardEnd() {
        return dossardEnd;
    }

    public void setDossardEnd(int dossardEnd) {
        this.dossardEnd = dossardEnd;
    }

    public int getDossardLitigeStart() {
        return dossardLitigeStart;
    }

    public void setDossardLitigeStart(int dossardLitigeStart) {
        this.dossardLitigeStart = dossardLitigeStart;
    }

    public int getDossardLitigeEnd() {
        return dossardLitigeEnd;
    }

    public void setDossardLitigeEnd(int dossardLitigeEnd) {
        this.dossardLitigeEnd = dossardLitigeEnd;
    }

    public Category getCategoryMin() {
        return categoryMin;
    }

    public void setCategoryMin(Category categoryMin) {
        this.categoryMin = categoryMin;
    }

    public int getNbCoureurParInscription() {
        return nbCoureurParInscription;
    }

    public void setNbCoureurParInscription(int nbCoureurParInscription) {
        this.nbCoureurParInscription = nbCoureurParInscription;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }
}
package fr.lhsa.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Coureur {

    private int id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private Gender gender;

    private String club;

    private int numeroLicence;

    private int numeroPps;

    private String adresse;

    private String email;

    private String numeroTel;

    private String etat;

    private LocalTime perf;

    private Category category;

    public Coureur() {
    }

    public Coureur(
            int id,
            String firstName,
            String lastName,
            LocalDate birthDate,
            Gender gender,
            String club,
            int numeroLicence,
            int numeroPps,
            String adresse,
            String email,
            String numeroTel,
            String etat,
            LocalTime perf,
            Category category
    ) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.club = club;
        this.numeroLicence = numeroLicence;
        this.numeroPps = numeroPps;
        this.adresse = adresse;
        this.email = email;
        this.numeroTel = numeroTel;
        this.etat = etat;
        this.perf = perf;
        this.category = category;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public Gender getGender() {

        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public String getClub() {

        return club;
    }

    public void setClub(String club) {

        this.club = club;
    }

    public int getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(int numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public int getNumeroPps() {
        return numeroPps;
    }

    public void setNumeroPps(int numeroPps) {
        this.numeroPps = numeroPps;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public LocalTime getPerf() {
        return perf;
    }

    public void setPerf(LocalTime perf) {
        this.perf = perf;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
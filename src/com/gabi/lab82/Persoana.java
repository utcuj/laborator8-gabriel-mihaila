package com.gabi.lab82;

public class Persoana implements Comparable {

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    public int compareTo(Object o) {
        return this.nume.compareTo(((Persoana)o).nume);
    }

    public String toString(){
        return "Nume: " + nume + "\nPrenume: " + prenume + "\nVarsta: " + varsta + "\n";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

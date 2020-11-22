package com.gabi.tema;

public class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public String toString(){
        return "Student\n" + "Nume: " + nume + "\nPrenume: " + prenume + "\nMasina: " + masina;
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

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

/* Shallow copy
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }*/

//deep copy
    @Override
    protected Object clone() {
        return new Student(nume,prenume,(Masina)masina.clone());
    }
}

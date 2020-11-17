package com.gabi.lab81;

public class NumarComplex implements Numeric {
    private double parte_reala;
    private double parte_imaginara;

    public NumarComplex(double parte_reala, double parte_imaginara) {
        this.parte_reala = parte_reala;
        this.parte_imaginara = parte_imaginara;
    }

    @Override
    public Numeric adunare(Numeric x) {
        if(x instanceof NumarComplex){
            this.parte_reala += ((NumarComplex) x).parte_reala;
            this.parte_imaginara += ((NumarComplex) x).parte_imaginara;
        }
        else{
            this.parte_reala += ((NumarFractionar)x).getFractie();
        }
        return this;

    }

    @Override
    public Numeric scadere(Numeric x) {
        if(x instanceof NumarComplex){
            this.parte_reala -= ((NumarComplex) x).parte_reala;
            this.parte_imaginara -= ((NumarComplex) x).parte_imaginara;
        }
        else{
            this.parte_reala -= ((NumarFractionar)x).getFractie();
        }
        return this;
    }

    public String toString(){
        if(this.parte_imaginara > 0)
            return this.parte_reala + " + " + this.parte_imaginara + " i";
        else
            return this.parte_imaginara + this.parte_reala + " i";
    }

    public double getParte_reala() {
        return parte_reala;
    }

    public void setParte_reala(double parte_reala) {
        this.parte_reala = parte_reala;
    }

    public double getParte_imaginara() {
        return parte_imaginara;
    }

    public void setParte_imaginara(double parte_imaginara) {
        this.parte_imaginara = parte_imaginara;
    }
}

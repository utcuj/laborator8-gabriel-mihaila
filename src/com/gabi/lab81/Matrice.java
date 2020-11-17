package com.gabi.lab81;

public class Matrice {
    Numeric elemente[][] = new Numeric[10][10];

    public Matrice(Numeric[][] x){
        this.elemente=x;
    }

    public void adunare(Matrice matrice){
        for(int i=0; i<elemente.length; i++){
            for(int j=0; j<elemente.length; j++){
                this.elemente[i][j].adunare(matrice.getElement(i,j));
            }
        }
    }

    public void scadere(Matrice matrice){
        for(int i=0; i<elemente.length; i++){
            for(int j=0; j<elemente.length; j++){
                this.elemente[i][j].scadere(matrice.getElement(i,j));
            }
        }
    }

    public Numeric getElement(int i, int j){
        return elemente[i][j];
    }

    public void afisareMatrice(){
        for(int i=0;i<elemente.length;i++){
            for(int j=0;j<elemente.length;j++){
                System.out.print(this.elemente[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package com.gabi.lab82;

import java.sql.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Mihaila","Gabriel", 20);
        Persoana p2= new Persoana("Rus","Andrei",21);

        Persoana[] p= new Persoana[4];

        p[0]=p1;
        p[1]=p2;
        p[2]=new Persoana("Darius","Tibi",24);
        p[3]=new Persoana("Pavel","Andrei",30);

        for(int i=0;i<p.length;i++){
            if(p[i]!=null)
                System.out.println(p[i].toString());
            else
                break;
        }

        System.out.println("Array-ul sortat dupa nume:");
        Arrays.sort(p);
        for(int i=0;i<p.length;i++){
            if(p[i]!=null)
                System.out.println(p[i].toString());
            else
                break;
        }

    }
}

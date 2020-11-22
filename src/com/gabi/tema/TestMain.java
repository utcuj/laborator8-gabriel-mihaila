package com.gabi.tema;

public class TestMain {
    public static void main(String[] args) {
        Masina masina1= new Masina("Audi","rosu");
        Student student1= new Student("Mihaila","Gabriel",masina1);

        //shallow copy
        /*Student clona1= (Student) student1.clone();
        clona1.getMasina().setCuloare("negru"); */

        //deep copy
        Student clona1= (Student) student1.clone();
        clona1.getMasina().setCuloare("negru");

        System.out.println(student1.toString());
        System.out.println();
        System.out.print("Clona ");
        System.out.println(clona1.toString());
    }
}

package org.example.week4.lab4.People;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment (List<Person> people){

        for (int i=0; i<=people.size()-1;i++){
            System.out.println(people.get(i));
        }

        /*for ( Object p : people){
            System.out.println(p);
        }*/
    }



    public static void main(String[] args) {
        /*Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);*/

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 21, "UK", 1234);
        System.out.println(olli);
        System.out.println("credits " + olli.getCredits());
        olli.study();
        System.out.println("credits "+ olli.getCredits());
        olli.addGrades(78);
        olli.addGrades(34);
        olli.showGrades();

        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli ); */


        /*List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200, 45, "USA") );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 21, "UK", 123) );



        printDepartment(people);*/



    }
}

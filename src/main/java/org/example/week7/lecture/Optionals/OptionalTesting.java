package org.example.week7.lecture.Optionals;

import com.sun.source.tree.NewArrayTree;

import java.util.Optional;

public class OptionalTesting {

    public static void main(String[] args ) throws ClassNotFoundException {
        Optional<Elephant> mojSlon = getElephant();

        if (mojSlon.isPresent())
            System.out.println(mojSlon.get().name());
        else
            System.out.println("No elephant.");

        Elephant elephant = getElephant()
                .orElse(new Elephant("New elephant", 24));

        System.out.println(elephant.name());

        Elephant elephant1 = getElephant().orElseThrow(ClassNotFoundException::new);
    }

    private static Optional<Elephant> getElephant(){
        return Optional.ofNullable(null);
    }
}

record Elephant(String name, int age){};


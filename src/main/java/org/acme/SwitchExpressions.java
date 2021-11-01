package org.acme;

import org.acme.sealed.Animal;
import org.acme.sealed.Bird;
import org.acme.sealed.Cat;
import org.acme.sealed.Dog;

public class SwitchExpressions {
    enum Plastic {
        CUP, STRAW, BOTTLE
    }

    public int getDamageToPlanet(final Plastic plastic) {
        return switch (plastic) {
            case CUP -> 100;
            case BOTTLE -> 200;
            case STRAW -> 300;
        };
    }

    public String getAnimal(final Animal animal) {
        // Old version
        var phrase = "";
        if (animal instanceof Dog) {
            phrase = "I'm a Dog!";
        } else if (animal instanceof Cat) {
            phrase = "I'm a Cat!";
        } else if (animal instanceof Bird) {
            phrase = "I'm a Bird!";
        } else {
            phrase = "Not a valid Animal!";
        }

        // Using Pattern Matching
        return switch (animal) {
            case Dog dog -> "I'm a Dog and my name is " + dog.getName();
            case Cat cat -> "I'm a Cat and my name is " + cat.getName();
            case Bird bird -> "I'm a Bird and my name is " + bird.getName();
            // Null values can now be handled like this:
            case null -> throw new IllegalStateException("Null is not a valid animal");
            default -> throw new IllegalStateException("Not a valid animal: " + animal);
        };
    }
}

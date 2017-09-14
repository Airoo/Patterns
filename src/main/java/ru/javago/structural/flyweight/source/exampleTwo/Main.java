package ru.javago.structural.flyweight.source.exampleTwo;

import ru.javago.structural.flyweight.source.exampleTwo.characters.EnglishCharacter;
import ru.javago.structural.flyweight.source.exampleTwo.flyweightFactory.FlyweightFactory;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        int [] characterCodes = {1,2,3};
        for (int nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }
}

package ru.javago.structural.flyweight.source.exampleTwo.characters;

public abstract class EnglishCharacter {
    protected char symbol;
    protected int width;
    protected int height;

    public void printCharacter(){
        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}

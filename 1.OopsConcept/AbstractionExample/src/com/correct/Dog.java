package com.correct;

abstract class Dog {

    String breed;

    public void bark(){
        System.out.println("Bark!");
    }

    public abstract void poop(); // this will make sure every method which implement Dog has this method
}

interface DogInterface{
    void bark();
}
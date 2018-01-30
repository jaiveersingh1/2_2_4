package org.pltw.examples.animalapp;

/**
 * Created by jsboygenius on 1/30/18.
 */

public class Seal extends Animal implements Fun {
    public String say()
    {
        return "bark";
    }
    public String play()
    {
        return "The seal bounces a ball off its nose.";
    }
}

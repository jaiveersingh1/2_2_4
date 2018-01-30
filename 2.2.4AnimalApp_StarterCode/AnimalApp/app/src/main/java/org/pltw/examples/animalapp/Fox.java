package org.pltw.examples.animalapp;

/**
 * Created by jsboygenius on 1/30/18.
 */

public class Fox extends Animal implements Fun{
    public Fox() {
    }
    public String say()
    {
        return "Ring-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\n";
    }
    public String play()
    {
        return "The fox chases mice and digs holes";
    }
}

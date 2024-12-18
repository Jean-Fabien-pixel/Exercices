package org.calma.poo.semaine7;

public class Sandstorm {
    private static boolean stormActive;

    public Sandstorm() {}

    public static boolean isStormActive(){
        return stormActive;
    }

    public static void setStormActive(boolean stormActive){
        Sandstorm.stormActive = stormActive;
    }
}

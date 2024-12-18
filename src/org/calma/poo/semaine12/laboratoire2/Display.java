package org.calma.poo.semaine12.laboratoire2;

public class Display {
    private String STOPPED_MESSAGE;
    private String PLAYING_MESSAGE;
    private String PAUSED_MESSAGE;

    public void showStatusForState(State state) {
        if(state instanceof StoppedState){
            STOPPED_MESSAGE = "Lecteur arrêté";
        } else if (state instanceof PlayingState) {
            PLAYING_MESSAGE = "Lecture en cours";
        } else if (state instanceof PausedState) {
            PAUSED_MESSAGE = "Lecture en pause";
        }
    }
}

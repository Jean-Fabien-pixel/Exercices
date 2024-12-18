package org.calma.poo.semaine12.laboratoire2;

public class PlayingState implements State {
    private Display display;

    public PlayingState(Display display) {
        this.display = display;
    }

    @Override
    public void pressPlay(MusicPlayerContext context) {
        context.setState(new PausedState(display));
    }
}

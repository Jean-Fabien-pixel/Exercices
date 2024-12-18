package org.calma.poo.semaine12.laboratoire2;

public class PausedState implements State {
    private Display display;

    public PausedState(Display display) {
        this.display = display;
    }

    @Override
    public void pressPlay(MusicPlayerContext context) {
        context.setState(new StoppedState(display));
    }
}

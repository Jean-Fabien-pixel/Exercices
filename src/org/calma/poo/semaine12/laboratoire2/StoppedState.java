package org.calma.poo.semaine12.laboratoire2;

public class StoppedState implements State{
    private Display display;

    public StoppedState(Display display) {
        this.display = display;
    }

    @Override
    public void pressPlay(MusicPlayerContext context) {
        context.setState(new PlayingState(display));
    }
}

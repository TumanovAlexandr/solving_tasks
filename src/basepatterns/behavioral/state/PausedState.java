package basepatterns.behavioral.state;

public class PausedState implements State {
    @Override
    public void pressPlay(Player player) {
        player.setState(new PlayingState());
        System.out.println("Playing...");
    }
}

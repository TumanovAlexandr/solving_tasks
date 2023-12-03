package basepatterns.behavioral.state;

public class PlayingState implements State {
    @Override
    public void pressPlay(Player player) {
        player.setState(new ReadyState());
        System.out.println("Ready...");
    }
}

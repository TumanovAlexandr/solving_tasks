package basepatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new ReadyState());
        player.play(); // Output: Playing music

        player.play(); // Output: Paused music

        player.play(); // Output: Playing music
    }
}

package basepatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play(); // Output: Cricket Game Initialized! Start playing. Cricket Game Started. Enjoy the game! Cricket Game Finished!

        game = new Football();
        game.play(); // Output: Football Game Initialized! Start playing. Football Game Started. Enjoy the game! Football Game Finished!
    }
}

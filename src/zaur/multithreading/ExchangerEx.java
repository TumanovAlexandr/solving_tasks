package zaur.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> actions1 = new ArrayList<>();
        actions1.add(Action.SCISSORS);
        actions1.add(Action.PAPER);
        actions1.add(Action.SCISSORS);
        List<Action> actions2 = new ArrayList<>();
        actions2.add(Action.PAPER);
        actions2.add(Action.ROCK);
        actions2.add(Action.ROCK);

        new BestFriend("Alex", actions1, exchanger);
        new BestFriend("Anton", actions2, exchanger);
    }
}

enum Action {
    ROCK,
    SCISSORS,
    PAPER
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.ROCK && friendsAction == Action.SCISSORS)
        || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
        || (myAction == Action.PAPER && friendsAction == Action.ROCK)) {
            System.out.println(name + " wins!!!");
        }
    }

    @Override
    public void run() {
        Action reply;

        for (Action action : myActions
                ) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

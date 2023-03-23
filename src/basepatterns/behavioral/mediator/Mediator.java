package basepatterns.behavioral.mediator;

public interface Mediator {
    void sendMessage(String message, Colleague sender);
}

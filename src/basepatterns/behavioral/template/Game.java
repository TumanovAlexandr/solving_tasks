package basepatterns.behavioral.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Шаблонный метод
    public final void play() {
        // Инициализация игры
        initialize();

        // Начало игры
        startPlay();

        // Конец игры
        endPlay();
    }
}

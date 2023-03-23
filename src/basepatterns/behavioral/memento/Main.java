package basepatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        // Первый этап
        editor.type("This is the first sentence.");
        editor.type("This is the second sentence.");
        history.push(editor.save());

        // Второй этап
        editor.type("This is the third sentence.");
        history.push(editor.save());

        // Третий этап
        editor.type("This is the fourth sentence.");
        System.out.println(editor.getContent()); // Output: This is the first sentence. This is the second sentence. This is the third sentence. This is the fourth sentence.

        // Отменить изменения и вернуться к второму этапу
        editor.restore(history.pop());
        System.out.println(editor.getContent()); // Output: This is the first sentence. This is the second sentence. This is the third sentence.

        // Отменить изменения и вернуться к первому этапу
        editor.restore(history.pop());
        System.out.println(editor.getContent()); // Output: This is the first sentence. This is the second sentence.
    }
}

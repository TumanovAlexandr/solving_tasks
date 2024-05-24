package test_task;

public interface App20 {
    /**
     * Метод, который определяет, есть ли цикл в односвязном списке.
     */
    public static boolean hasCycle(Node first) {

        return false; // если дошли до конца списка, значит цикла нет
    }

    public static void main(String[] args) {
        // Пример использования
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Создание цикла
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // замыкаем цикл

        System.out.println(hasCycle(node1)); // Выведет: true
    }
}

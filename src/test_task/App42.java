package test_task;

import java.util.ArrayList;
import java.util.List;

public class App42 {
    public List<String> queueSequence;

    public static void main(String[] args) {
        App42 processor = new App42();
        processor.setUp();
        System.out.println("Processing complete");
    }

    public void setUp() {
        try {
            establishQueueSequence();
        } finally {
            cleanupQueueSequence();
            System.out.println("Queue sequence successfully cleaned up");
        }
    }

    private void cleanupQueueSequence() {
        if (queueSequence.size() > 0) {
            System.out.println("Queue size > 0");
        }
    }

    private void establishQueueSequence() {
        if (true) {
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<String>();
    }
}
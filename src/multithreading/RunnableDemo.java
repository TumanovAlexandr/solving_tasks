package multithreading;

public class RunnableDemo implements Runnable {
    int counter;
    ManagerToken managerToken = new ManagerToken();

    public void run() {
        counter++;

        if(managerToken.getToken() != null) {
            managerToken.setToken(managerToken.getToken() + 1);
        } else {
            managerToken.setToken(0);
        }
        System.out.println("Counter: " + counter);
        System.out.println("ManagerToken: " + managerToken.getToken());
    }
}

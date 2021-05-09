package golovach.core;

class SingletonEarly {
    public static final SingletonEarly instance = new SingletonEarly();

    private SingletonEarly() {}
}

class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class Demo {
    public static void main(String[] args) {
        SingletonEarly ref = SingletonEarly.instance;
    }
}

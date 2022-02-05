package zaur.annotation;

public class Test1 {
    public static void main(String[] args) {
        Parent alex = new Child("Alex");
        alex.showInfo();
    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Parent{" +
                "name='" + name + '\'' +
                '}');
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Child{" +
                "name='" + name + '\'' +
                '}');
    }

}
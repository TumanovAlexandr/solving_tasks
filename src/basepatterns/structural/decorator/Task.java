package basepatterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        developer = new SeniorJavaDeveloper(developer);
        developer = new TeamLeadJavaDeveloper(developer);
        System.out.println(developer.makeJob());
    }
}

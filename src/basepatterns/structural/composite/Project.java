package basepatterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();
        Developer phpDeveloper = new PhpDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(cppDeveloper);
        team.addDeveloper(phpDeveloper);

        team.createProject();
    }
}

package basepatterns.structural.flyweight;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        Developer javaDeveloper = developerFactory.getDeveloperBySpecialty("java");
        Developer cppDeveloper = developerFactory.getDeveloperBySpecialty("cpp");
        Developer javaDeveloper2 = developerFactory.getDeveloperBySpecialty("java");
        Developer cppDeveloper2 = developerFactory.getDeveloperBySpecialty("cpp");

        javaDeveloper.writeCode();
        cppDeveloper.writeCode();
        javaDeveloper2.writeCode();
        cppDeveloper2.writeCode();
    }
}

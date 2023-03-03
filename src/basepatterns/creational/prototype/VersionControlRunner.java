package basepatterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();

        System.out.println("\n=====================\n");

        System.out.println(masterClone);
    }
}

package basepatterns.creational.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        setProject(project);
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}

package zaur.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolboy schoolboy1 = new Schoolboy("Ivan", 13);
        Schoolboy schoolboy2 = new Schoolboy("Mariya", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Nikolay", 21);

        Employee employee1 = new Employee("Alex", 33);
        Employee employee2 = new Employee("Anton", 28);

        Team<Schoolboy> schoolboyTeam = new Team<>("Apple");
        Team<Student> studentTeam = new Team<>("Orange");
        Team<Employee> employeeTeam = new Team<>("Pineapple");

        schoolboyTeam.addNewParticipant(schoolboy1);
        schoolboyTeam.addNewParticipant(schoolboy2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolboy> schoolboyTeam2 = new Team<>("Time");
        Schoolboy schoolboy3 = new Schoolboy("Sergey", 12);
        Schoolboy schoolboy4 = new Schoolboy("Olya", 14);
        schoolboyTeam2.addNewParticipant(schoolboy3);
        schoolboyTeam2.addNewParticipant(schoolboy4);

        schoolboyTeam.playWith(schoolboyTeam2);

    }
}

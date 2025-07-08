package hw_38;

public class Main {
    public static void main(String[] args) {
        Manager<QAEngineer> qaManager = new Manager<>("Ирина");
        qaManager.addTeamMember(new QAEngineer("Оля"));
        qaManager.addTeamMember(new QAEngineer("Иван"));

        Manager<Programmer> progManager = new Manager<>("Андрей");
        progManager.addTeamMember(new BackEndProgrammer("Павло"));
        progManager.addTeamMember(new FrontEndProgrammer("Мария"));

        qaManager.showTeam();
        progManager.showTeam();

    }
}
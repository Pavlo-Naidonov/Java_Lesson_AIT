package hw_38;

import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee> {
    private String name;
    private List<T> team;

    public Manager(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addTeamMember(T member){
        team.add(member);
    }

    public void showTeam(){
        System.out.println("Менеджер: " + name + " управляет командой:");
        for (T member : team){
            System.out.println("- " + member.getName() + " (" + member.getClass().getSimpleName() +  ")");

        }
    }
}

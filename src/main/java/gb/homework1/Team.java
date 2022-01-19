package gb.homework1;

import java.util.Random;

public class Team {

    private final String name;
    private TeamMember[] teamMembers = new TeamMember[4];

    public Team(String name, TeamMember m1, TeamMember m2, TeamMember m3, TeamMember m4) {
        this.name = name;
        this.teamMembers[0] = m1;
        this.teamMembers[1] = m2;
        this.teamMembers[2] = m3;
        this.teamMembers[3] = m4;
    }

    public void printTeamInfo() {
        System.out.println("Сводная информация по команде " + name + ":");
        for (int i = 0; i < this.teamMembers.length; i++){
            System.out.println("Участник №" + (i+1) + " - " + teamMembers[i]);
        }
    }

    public void printResults(){
        System.out.println("Победители забега: ");
        for (int i = 0; i < this.teamMembers.length; i++){
            System.out.println("Участник №" + (i+1) + " - " + teamMembers[i]);
        }
    }

}

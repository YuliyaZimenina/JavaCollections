package com.zimenina.yuliya.work_with_collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yuliya Zimenina
 */

/*
Create a Team class that contains collections
of instances of the Developer class.
 */

public class Team {
    //class variables
    String teamName;
    String teamWork;

    //Developer class collection
    Developer[] developer;

    //Class constructors
    public Team(Developer[] developer) {
        this.developer = developer;
    }

    public Team() {
    }

    public Team(String teamName, Developer[] developer, String teamWork) {
        this.teamName = teamWork;
        this.developer = developer;
        this.teamWork = teamWork;
    }

    //Class getters and setters

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamWork() {
        return teamWork;
    }

    public void setTeamWork(String teamWork) {
        this.teamWork = teamWork;
    }

    public Developer[] getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer[] developer) {
        this.developer = developer;
    }

    //Outputting information to the console
    @Override
    public String toString() {
        return "Team: " + teamName +
                "\n Team project: " + teamWork +
                "\n Team Developers: " + Arrays.toString(developer) +
                "\n Qualification: " + showDeveloperSkill();
    }

    //A method that prints developer skills to the console
    public ArrayList showDeveloperSkill() {
        ArrayList<String> teamSkill = new ArrayList<>();
        //Using a loop foreach
        for (Developer dev : developer) {
            teamSkill.add(Arrays.toString(dev.getSkill()));
        }
        return teamSkill;
    }

    //Method that displays the composition of the development team
    public void showDeveloperInTeam() {
        System.out.println("Team members: ");
        //Using a loop foreach
        for (Developer dev : developer) {
            System.out.print(dev + "; ");
        }
    }
}

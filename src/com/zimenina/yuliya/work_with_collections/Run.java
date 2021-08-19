package com.zimenina.yuliya.work_with_collections;

/**
 * @author Yuliya Zimenina
 */

/*
The task:
Create a Team class that contains collections
of instances of the Developer class.
The Developer class contains a collection of Skill classes
Create a Project class that contains an instance of the Team class.
It is necessary to implement methods for displaying all developers in the team and displaying their skills.
 */

public class Run {
    public static void main(String[] args) {
        //Creating objects of the class Project
        Project project1 = new Project("Project 1");
        Project project2 = new Project("Project 2");
        Project project3 = new Project("Project 3");

        //Create object of class Team
        Team mobileTeam = new Team();
        System.out.println(mobileTeam.teamWork = "Development of mobile applications");
        mobileTeam.teamName = "Team 1";
        mobileTeam.developer = new Developer[]{
                Developer.DEVELOPER_4,
                Developer.DEVELOPER_6,
                Developer.DEVELOPER_8
        };

        project1.team = new Team[]{mobileTeam};
        System.out.println(mobileTeam.teamName);
        mobileTeam.showDeveloperInTeam();
        System.out.println("Team skills:\n " + mobileTeam + ":\n " + mobileTeam.showDeveloperSkill());

        Team webTeam = new Team();
        System.out.println(webTeam.teamWork + "Web application development");
        webTeam.teamName = "Team 2";
        webTeam.developer = new Developer[]{
          Developer.DEVELOPER_1,
          Developer.DEVELOPER_7,
          Developer.DEVELOPER_9
        };

        project2.team = new Team[]{webTeam};
        System.out.println(webTeam.teamName);
        webTeam.showDeveloperInTeam();
        System.out.println("Team skills: " + webTeam + ": " + webTeam.showDeveloperSkill());

        Team dbTeam = new Team();
        System.out.println(dbTeam.teamWork + "Database development");
        dbTeam.teamName = "Team 3";
        dbTeam.developer = new Developer[]{
                Developer.DEVELOPER_2,
                Developer.DEVELOPER_3,
                Developer.DEVELOPER_5
        };
    }
}

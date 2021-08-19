package com.zimenina.yuliya.work_with_collections;

/**
 * @author Yuliya Zimenina
 */

/*
Create a Project class that contains an instance of the Team class.
 */

public class Project {
    //Class variable
    String teamProject;

    //Team class collection
    Team [] team;

    //Class constructors
    public Project(Team [] team, String teamProject){
        this.team = team;
        this.teamProject = teamProject;
    }

    public Project(String teamProject){
        this.teamProject = teamProject;
    }

    //Class getters and setters

    public String getTeamProject() {
        return teamProject;
    }

    public void setTeamProject(String teamProject) {
        this.teamProject = teamProject;
    }

    public Team[] getTeam() {
        return team;
    }

    public void setTeam(Team[] team) {
        this.team = team;
    }

    //Method for displaying the list of participants to the console
    public void developmentTeam(){
        //Using a loop "foreach"
        for (Team team1 : team) {
            System.out.println("Team: " + team1.teamName);
            team1.showDeveloperInTeam();
        }
    }

    //Skill inference method for team members
    public void teamMemberSkills(){
        //Using a loop "foreach"
        for (Team team1 : team) {
            System.out.println(team1.teamName + ": " + team1.showDeveloperSkill());
        }
    }
}

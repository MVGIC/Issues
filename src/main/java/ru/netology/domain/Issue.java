package ru.netology.domain;

public class Issue {

    private String Author;
    private String Label;
    private String Projects;
    private int Milestones;
    private String Assignee;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getProjects() {
        return Projects;
    }

    public void setProjects(String projects) {
        Projects = projects;
    }

    public int getMilestones() {
        return Milestones;
    }

    public void setMilestones(int milestones) {
        Milestones = milestones;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String assignee) {
        Assignee = assignee;
    }
}

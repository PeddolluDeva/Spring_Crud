package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")  // Corrected table name
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Student_Name")
    private String name;

    @Column(name = "Student_Group")  // Renamed to avoid SQL conflict
    private String studentGroup;

    @Column(name = "Student_Rank")
    private float rank;

    @Column(name = "Student_Branch")
    private String branch;

    public student() {
    	
    }

    public student(String name, String studentGroup, float rank, String branch) {
        this.name = name;
        this.studentGroup = studentGroup;
        this.rank = rank;
        this.branch = branch;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStudentGroup() { return studentGroup; }
    public void setStudentGroup(String studentGroup) { this.studentGroup = studentGroup; }

    public float getRank() { return rank; }
    public void setRank(float rank) { this.rank = rank; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", studentGroup=" + studentGroup + ", rank=" + rank + ", branch=" + branch + "]";
    }
}

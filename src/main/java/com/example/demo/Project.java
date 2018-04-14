package com.example.demo;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Project {
    String name;
    String idea;
    String director;
    String specification;
    String status;
    List<Task> tasks;
    Integer score;
}

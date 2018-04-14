package com.example.demo;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Task {
    Project id;
    String description;
    String performer;
    Date start_date;
    Date end_date;
    String report;

}

package com.impirobotics.ImpiRobotics_ScoutingUtil.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Team {
    @Id
    private String teamNumber;
}

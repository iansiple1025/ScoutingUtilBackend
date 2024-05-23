package com.impirobotics.ImpiRobotics_ScoutingUtil.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Match {
    @Id
    private Integer matchNumber;
    Integer red1;
    Integer red2;
    Integer red3;
    Integer blue1;
    Integer blue2;
    Integer blue3;
}

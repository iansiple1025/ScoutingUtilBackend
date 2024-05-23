package com.impirobotics.ImpiRobotics_ScoutingUtil.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ImpiData_2024")
public class ImpiData_2024{
    @Id
    private int id;
    private Integer matchNumber;
    private Integer teamNumber;
    private String scouterName;
    private Integer startingPosition;
    private int passedStartingLine;
    private int scoredFirstShot;
    private Integer autoCloseNotesScored;
    private Integer autoFarNotesScored;
    private Integer teleopSpeakerNotes;
    private Integer teleopAmpNotes;
    private Integer teleopNotesFed;
    private Integer defenseRating;
    private int mechanicalFailure;
    private Integer endLocation;
    private int scoredTrapNote;
    private String comments;

    public ImpiData_2024(Integer matchNumber, Integer teamNumber, String scouterName, Integer startingPosition,
                         int passedStartingLine, int scoredFirstShot, Integer autoCloseNotesScored, Integer autoFarNotesScored,
                         Integer teleopSpeakerNotes, Integer teleopAmpNotes, Integer teleopNotesFed,
                         Integer defenseRating, int mechanicalFailure, Integer endLocation, int scoredTrapNote,
                         String comments){
        this.matchNumber = matchNumber;
        this.teamNumber = teamNumber;
        this.scouterName = scouterName;
        this.startingPosition = startingPosition;
        this.passedStartingLine = passedStartingLine;
        this.scoredFirstShot = scoredFirstShot;
        this.autoCloseNotesScored = autoCloseNotesScored;
        this.autoFarNotesScored = autoFarNotesScored;
        this.teleopSpeakerNotes = teleopSpeakerNotes;
        this.teleopAmpNotes = teleopAmpNotes;
        this.teleopNotesFed = teleopNotesFed;
        this.defenseRating = defenseRating;
        this.mechanicalFailure = mechanicalFailure;
        this.endLocation = endLocation;
        this.scoredTrapNote = scoredTrapNote;
        this.comments = comments;
    }
}


package com.example.DataProcessing.Leagues;

import javax.persistence.*;

@Entity
@Table(name = "leagues")
public class Leagues {
    private int leagueID;
    private String name;
    private String understatNotation;

    public Leagues() {
    }

    public Leagues(int leagueID, String name, String understatNotation) {
        this.leagueID = leagueID;
        this.name = name;
        this.understatNotation = understatNotation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(int leagueID) {
        this.leagueID = leagueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnderstatNotation() {
        return understatNotation;
    }

    public void setUnderstatNotation(String understatNotation) {
        this.understatNotation = understatNotation;
    }
}

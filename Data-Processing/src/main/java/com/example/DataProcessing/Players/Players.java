package com.example.DataProcessing.Players;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;

@Entity
@Table (name = "players")
public class Players {
    private int playerID;
    private String name;

    public Players() {
    }

    public Players(int playerID, String name) {
        this.playerID = playerID;
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.DataProcessing.Appearances;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "appearances")
public class Appearances {
    private int appearanceID;
    private int gameID;
    private int playerID;
    private int goals;
    private int ownGoals;
    private int shots;
    private double xGoals;
    private double xGoalsChain;
    private double xGoalsBuildup;
    private int assists;
    private int keyPasses;
    private double xPasses;
    private double xAssists;
    private String position;
    private int positionOrder;
    private int yellowCard;
    private int redCard;
    private int time;
    private int substituteIn;
    private int substituteOut;
    private int leagueID;

    public Appearances() {
    }

    public Appearances(int appearanceID, int gameID, int playerID, int goals, int ownGoals, int shots, double xGoals, double xGoalsChain, double xGoalsBuildup, int assists, int keyPasses, double xPasses, double xAssists, String position, int positionOrder, int yellowCard, int redCard, int time, int substituteIn, int substituteOut, int leagueID) {
        this.appearanceID= appearanceID;
        this.gameID = gameID;
        this.playerID = playerID;
        this.goals = goals;
        this.ownGoals = ownGoals;
        this.shots = shots;
        this.xGoals = xGoals;
        this.xGoalsChain = xGoalsChain;
        this.xGoalsBuildup = xGoalsBuildup;
        this.assists = assists;
        this.keyPasses = keyPasses;
        this.xPasses = xPasses;
        this.xAssists = xAssists;
        this.position = position;
        this.positionOrder = positionOrder;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
        this.time = time;
        this.substituteIn = substituteIn;
        this.substituteOut = substituteOut;
        this.leagueID = leagueID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAppearanceID() {
        return appearanceID;
    }

    public void setAppearanceID(int appearanceID) {
        this.appearanceID = appearanceID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(int ownGoals) {
        this.ownGoals = ownGoals;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public double getxGoals() {
        return xGoals;
    }

    public void setxGoals(double xGoals) {
        this.xGoals = xGoals;
    }

    public double getxGoalsChain() {
        return xGoalsChain;
    }

    public void setxGoalsChain(double xGoalsChain) {
        this.xGoalsChain = xGoalsChain;
    }

    public double getxGoalsBuildup() {
        return xGoalsBuildup;
    }

    public void setxGoalsBuildup(double xGoalsBuildup) {
        this.xGoalsBuildup = xGoalsBuildup;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getKeyPasses() {
        return keyPasses;
    }

    public void setKeyPasses(int keyPasses) {
        this.keyPasses = keyPasses;
    }

    public double getxPasses() {
        return xPasses;
    }

    public void setxPasses(double xPasses) {
        this.xPasses = xPasses;
    }

    public double getxAssists() {
        return xAssists;
    }

    public void setxAssists(double xAssists) {
        this.xAssists = xAssists;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(int positionOrder) {
        this.positionOrder = positionOrder;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSubstituteIn() {
        return substituteIn;
    }

    public void setSubstituteIn(int substituteIn) {
        this.substituteIn = substituteIn;
    }

    public int getSubstituteOut() {
        return substituteOut;
    }

    public void setSubstituteOut(int substituteOut) {
        this.substituteOut = substituteOut;
    }

    public int getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(int leagueID) {
        this.leagueID = leagueID;
    }
}

package com.mongodicegame.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "player")
public class Player {
    @Transient
    public static final String SEQUENCE_NAME = "player_sequence";
    @Id
    private long id;
    private String email;
    private String nickName;
    private LocalDate dateRegister;
    private List<Game> games;
    private long success;
    private long fail;
    private long totalGames;
    private double percentSuccess;
    private double percentFail;


    public Player() {
        this.dateRegister = LocalDate.now();
        this.games = new ArrayList<>();
    }

    public Player(String email, String nickName) {
        this.email = email.toLowerCase();
        this.nickName = nickName;
        this.dateRegister = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public long getSuccess() {
        return success;
    }

    public void setSuccess(long success) {
        this.success = success;
    }

    public long getFail() {
        return fail;
    }

    public void setFail(long fail) {
        this.fail = fail;
    }

    public long getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(long totalGames) {
        this.totalGames = totalGames;
    }

    public double getPercentSuccess() {
        return percentSuccess;
    }

    public void setPercentSuccess(double percentSuccess) {
        this.percentSuccess = percentSuccess;
    }

    public double getPercentFail() {
        return percentFail;
    }

    public void setPercentFail(double percentFail) {
        this.percentFail = percentFail;
    }

}

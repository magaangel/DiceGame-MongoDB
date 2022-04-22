package com.mongodicegame.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "game")
public class Game {
    @Transient
    public static final String SEQUENCE_NAME = "game_sequence";
    @Id
    private long id;
    private long idPlayer;
    private LocalDateTime dateTimeRegister;
    private int dice1;
    private int dice2;
    private int resultRollDice;

    public Game() {
        this.dateTimeRegister = LocalDateTime.now();
    }

    public Game(long idPlayer, LocalDateTime dateTimeRegister, int dice1, int dice2, int resultRollDice) {
        this.idPlayer = idPlayer;
        this.dateTimeRegister = dateTimeRegister;
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.resultRollDice = this.getResultRollDice();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public LocalDateTime getDateTimeRegister() {
        return dateTimeRegister;
    }

    public void setDateTimeRegister(LocalDateTime dateTimeRegister) {
        this.dateTimeRegister = dateTimeRegister;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public int getResultRollDice() {
        return resultRollDice;
    }

    public void setResultRollDice(int resultRollDice) {
        this.resultRollDice = resultRollDice;
    }

}

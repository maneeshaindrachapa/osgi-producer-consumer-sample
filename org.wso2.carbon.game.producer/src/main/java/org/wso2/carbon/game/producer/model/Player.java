package org.wso2.carbon.game.producer.model;

public class Player {

    private String playerName;
    private String championName;

    public Player(String playerName, String championName) {

        this.playerName = playerName;
        this.championName = championName;
    }

    public String getPlayerName() {

        return playerName;
    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;
    }

    public String getChampionName() {

        return championName;
    }

    public void setChampionName(String championName) {

        this.championName = championName;
    }
}

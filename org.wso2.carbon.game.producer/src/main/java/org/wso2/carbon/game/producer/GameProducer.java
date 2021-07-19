package org.wso2.carbon.game.producer;

import org.wso2.carbon.game.producer.model.Player;

import java.util.List;

public interface GameProducer {

    void createPlayer(String playerName, String championName);

    List<Player> listPlayers();
}

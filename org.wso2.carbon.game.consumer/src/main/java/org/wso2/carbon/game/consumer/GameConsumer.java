package org.wso2.carbon.game.consumer;

import org.wso2.carbon.game.consumer.internal.GameConsumerDataHolder;

public class GameConsumer {

    public void addPlayer(String playerName, String championName) {

        GameConsumerDataHolder.getInstance().getGameProducer().createPlayer(playerName, championName);
    }
}

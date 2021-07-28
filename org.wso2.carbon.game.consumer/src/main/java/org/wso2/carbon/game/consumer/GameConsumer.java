package org.wso2.carbon.game.consumer;

import org.wso2.carbon.game.consumer.internal.GameConsumerDataHolder;

public class GameConsumer {

    public void getChampionCreated(String championName) {

        GameConsumerDataHolder.getInstance().getGameProducer().createChampion(championName);
    }
}

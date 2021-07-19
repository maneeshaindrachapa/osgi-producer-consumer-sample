package org.wso2.carbon.game.consumer.internal;

import org.wso2.carbon.game.producer.GameProducer;

import java.util.logging.Logger;

public class GameConsumerDataHolder {
    private static final Logger LOGGER = Logger.getLogger(GameConsumerDataHolder.class.getName());
    private static GameConsumerDataHolder instance = new GameConsumerDataHolder();
    private GameProducer gameProducer;

    private GameConsumerDataHolder() {
    }

    public static GameConsumerDataHolder getInstance() {
        return instance;
    }

    public GameProducer getGameProducer() {
        return gameProducer;
    }

    public void setGameProducer(GameProducer gameProducer) {
        this.gameProducer = gameProducer;
    }
}

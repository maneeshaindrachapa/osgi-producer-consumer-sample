package org.wso2.carbon.game.producer;

import org.wso2.carbon.game.producer.model.Champion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GameProducerImpl implements GameProducer {

    private static final Logger LOGGER = Logger.getLogger(GameProducerImpl.class.getName());
    private static volatile GameProducerImpl gameProducer;
    private static List<Champion> champions = new ArrayList<Champion>();

    private GameProducerImpl() {

    }

    // Use singleton design pattern to create single instance.
    public static GameProducerImpl getInstance() {

        if (gameProducer == null) {
            synchronized (GameProducerImpl.class) {
                if (gameProducer == null) {
                    gameProducer = new GameProducerImpl();
                }
            }
        }
        return gameProducer;
    }

    public void createChampion(String championName) {

        Champion champion = new Champion(championName);
        LOGGER.info("Created a Champion:" + champion.getChampionName());
    }

    public List<Champion> listChampions() {

        return champions;
    }
}

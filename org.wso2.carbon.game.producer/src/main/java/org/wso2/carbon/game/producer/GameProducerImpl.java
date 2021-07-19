package org.wso2.carbon.game.producer;

import org.wso2.carbon.game.producer.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GameProducerImpl implements GameProducer {

    private static final Logger LOGGER = Logger.getLogger(GameProducerImpl.class.getName());
    private static volatile GameProducerImpl gameProducer;
    private static List<Player> players = new ArrayList<Player>();

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

    public void createPlayer(String playerName, String championName) {

        Player player = new Player(playerName, championName);
        LOGGER.info("Created a Player:" + player.getPlayerName() + " using Champion: " + player.getChampionName());
    }

    public List<Player> listPlayers() {

        return players;
    }
}

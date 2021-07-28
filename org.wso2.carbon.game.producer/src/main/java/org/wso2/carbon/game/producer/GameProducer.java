package org.wso2.carbon.game.producer;

import org.wso2.carbon.game.producer.model.Champion;

import java.util.List;

public interface GameProducer {

    void createChampion(String championName);

    List<Champion> listChampions();
}

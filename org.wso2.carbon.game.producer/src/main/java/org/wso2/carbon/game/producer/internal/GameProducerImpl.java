package org.wso2.carbon.game.producer.internal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.wso2.carbon.game.producer.GameProducer;
import org.wso2.carbon.game.producer.model.Champion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component(scope = ServiceScope.SINGLETON)
public class GameProducerImpl implements GameProducer {

    private static final Logger LOGGER = Logger.getLogger(GameProducerImpl.class.getName());
    private static List<Champion> champions = new ArrayList<Champion>();

    public void createChampion(String championName) {
        Champion champion = new Champion(championName);
        LOGGER.info("Created a Champion:" + champion.getChampionName());
    }

    public List<Champion> listChampions() {
        return champions;
    }
}

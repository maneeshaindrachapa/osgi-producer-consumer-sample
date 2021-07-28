package org.wso2.carbon.game.consumer.internal;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.game.consumer.GameConsumer;
import org.wso2.carbon.game.producer.GameProducer;

import java.util.logging.Logger;

@Component(
        name = "org.wso2.carbon.game.consumer",
        immediate = true
)
public class GameConsumerComponent {

    private static final Logger LOGGER = Logger.getLogger(GameConsumerComponent.class.getName());

    @Activate
    protected void activate(ComponentContext context) {

        LOGGER.info("Game consumer bundle is activated");
        GameConsumer gameConsumer = new GameConsumer();
        gameConsumer.getChampionCreated( "Zed");
    }

    @Reference(
            name = "org.wso2.carbon.game.producer",
            service = GameProducer.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetGameProducer"
    )
    protected void setGameProducer(GameProducer gameProducer) {

        LOGGER.info("Game producer is set to Game consumer bundle.");
        GameConsumerDataHolder.getInstance().setGameProducer(gameProducer);
    }

    protected void unsetGameProducer(GameProducer gameProducer) {

        LOGGER.info("Game producer is unset to Game consumer bundle.");
        GameConsumerDataHolder.getInstance().setGameProducer(null);
    }
}


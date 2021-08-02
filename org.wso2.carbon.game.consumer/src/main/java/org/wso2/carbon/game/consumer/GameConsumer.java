package org.wso2.carbon.game.consumer;

import java.util.logging.Logger;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.wso2.carbon.game.producer.GameProducer;

@Component(
		service = {}, // This is the default if no interface is implemented and therefore actually unnecessary. Thus this is no Service but a Simple component.
		immediate = true // This is the default for a Component (not a Service), therefore actually unnecessary and it will be activated as soon as all mandatory references are available
		)
public class GameConsumer {

	private static final Logger LOGGER = Logger.getLogger(GameConsumer.class.getName());

	@Reference // Will be mandatory by default, as this is a field
	GameProducer producer;
	
    @Activate
    protected void activate(ComponentContext context) {
        LOGGER.info("Game consumer Component is activated");
        producer.createChampion("Zed");
    }
}

package org.wso2.carbon.game.producer.internal;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.wso2.carbon.game.producer.GameProducer;
import org.wso2.carbon.game.producer.GameProducerImpl;

import java.util.logging.Logger;

@Component(
        name = "org.wso2.carbon.game.producer",
        immediate = true
)
public class GameProducerServiceComponent {

    private static final Logger LOGGER = Logger.getLogger(GameProducerServiceComponent.class.getName());

    @Activate
    protected void activate(ComponentContext context) {

        try {
            BundleContext bundleContext = context.getBundleContext();
            bundleContext.registerService(GameProducer.class,
                    GameProducerImpl.getInstance(), null);
            LOGGER.info("GameProducer bundle is activated");
        } catch (Throwable th) {
            LOGGER.info("Error:" + th);
        }
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {

        LOGGER.info("Game Producer bundle is deactivated");
    }

}
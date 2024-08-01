package paskhalko.test.testplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
        id = "testplugin",
        name = "TestPlugin"
)
public class TestPlugin {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public TestPlugin(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

        logger.info("Bruh, it works! Yet...");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        System.out.println("TestPlugin init... ABOBA PASKHALKO PASKHALKO 1488");
    }
}

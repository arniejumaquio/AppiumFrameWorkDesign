package rahulshettyacademy.base;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

public abstract class BaseTest {

    protected AppiumDriverLocalService appiumServer;

    protected AppiumDriverLocalService startAppiumServer(String ipAddress,int portNumber) {

        appiumServer = new AppiumServiceBuilder().withAppiumJS(new File("/Users/arniejumaquio/.nvm/versions/node/v24.11.1/lib/node_modules/appium/build/lib/main.js")).
                withIPAddress(ipAddress).usingPort(portNumber).build();
        appiumServer.start();

        return appiumServer;

    }

    protected void stopAppiumServer() {
        appiumServer.stop();
    }


}
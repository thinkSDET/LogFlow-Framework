package baseTest;

import utils.TestLogger;

public class ConfigManager {

    static {
        invokeConfigFile();
    }

    public static void invokeConfigFile(){
        TestLogger.info("config file has been loaded");
    }
}

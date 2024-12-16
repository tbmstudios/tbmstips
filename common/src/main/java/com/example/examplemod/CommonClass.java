package com.example.examplemod;

import com.example.examplemod.platform.Services;

public class CommonClass {

    public static void init() {
        logModInfo();
        thankPlayers();
    }

    private static void logModInfo() {
        Constants.LOG.info("Initializing mod: {} (ID: {}) on platform: {} in environment: {}",
                Constants.MOD_NAME,
                Constants.MOD_ID,
                Services.PLATFORM.getPlatformName(),
                Services.PLATFORM.getEnvironmentName());
    }

    private static void thankPlayers() {
        Constants.LOG.info("Thank you for playing! We hope you enjoy the experience. - TBM Studios");
    }
}
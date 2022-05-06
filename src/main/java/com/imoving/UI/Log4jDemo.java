package com.imoving.UI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        logger.info("info message!");
        logger.debug("Debug message!");
        logger.warn("Warn message");
        logger.trace("trace message");
        logger.error("Error message");
        logger.fatal("Fatal message");

    }
}

package test;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Main {
    private static Logger LOGGER = LogManager.getLogger(Main.class);

    private Main() {
        // no instantiation
    }

    public static void main(final String[] args) {
        LOGGER.info("Locale: {}, JVM: {}", Locale.getDefault(), System.getProperty("java.version"));
    }
}

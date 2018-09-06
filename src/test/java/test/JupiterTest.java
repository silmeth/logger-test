package test;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class JupiterTest {
    private static final Logger LOGGER = LogManager.getLogger(JupiterTest.class);

    @Test
    final void runJupiterLogging() {
        LOGGER.info("JupiterTest – Locale: {}, JVM: {}",
                    Locale.getDefault(), System.getProperty("java.version"));


        assertTrue(true);
    }
}

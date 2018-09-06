package test;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public final class VintageTest {
    private static final Logger LOGGER = LogManager.getLogger(VintageTest.class);

    @Test
    public final void runVintageLogging() {
        LOGGER.info("VintageTest – Locale: {}, JVM: {}",
                    Locale.getDefault(), System.getProperty("java.version"));

        assertTrue(true);
    }
}

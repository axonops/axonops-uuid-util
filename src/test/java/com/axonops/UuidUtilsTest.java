package com.axonops;

import com.datastax.driver.core.utils.UUIDs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UuidUtilsTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void fromNanos() {
        long testTime = System.nanoTime();
        UUID uuid = UuidUtils.fromNanos(testTime);
        assertEquals(testTime / 1000000, UUIDs.unixTimestamp(uuid));
    }
}

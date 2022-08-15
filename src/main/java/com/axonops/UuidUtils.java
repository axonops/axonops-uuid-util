package com.axonops;

import com.datastax.driver.core.utils.UUIDs;
import com.datastax.oss.driver.api.core.uuid.Uuids;

import java.util.UUID;

public class UuidUtils {
    private UuidUtils() {
    }

    public static UUID timeBased() {
        return UUIDs.timeBased();
    }

    public static UUID fromNanos(Long nanos) {
        return UUIDs.endOf(nanos / 1000000);
    }

    public static Long toNanos(UUID uuid) {
        return Uuids.unixTimestamp(uuid);
    }
}

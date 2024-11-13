package com.cercli.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimezoneUtility {
    private final ZoneId serverZone;
    private final ZoneId localZone;

    public TimezoneUtility(ZoneId serverZone, ZoneId localZone) {
        this.serverZone = serverZone;
        this.localZone = localZone;
    }

    public LocalDateTime toServerTimezone(LocalDateTime localDateTime) {
        ZonedDateTime localZoned = localDateTime.atZone(localZone);
        ZonedDateTime serverZoned = localZoned.withZoneSameInstant(serverZone);
        return serverZoned.toLocalDateTime();
    }

    public LocalDateTime toLocalTimezone(LocalDateTime serverDateTime) {
        ZonedDateTime serverZoned = serverDateTime.atZone(serverZone);
        ZonedDateTime localZoned = serverZoned.withZoneSameInstant(localZone);
        return localZoned.toLocalDateTime();
    }
}
package com.cercli.constants;

import java.time.ZoneId;

public class TimezoneConstants {
    public static final ZoneId SERVER_TIMEZONE = ZoneId.of("America/New_York"); // Example server timezone
    public static final ZoneId LOCAL_TIMEZONE = ZoneId.systemDefault(); // Local timezone
}
package com.rojojun.realworlddata.common.log;

public record TraceStatus(
        TraceId traceId,
        Long startTime,
        String message
) {
}

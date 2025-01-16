package com.rojojun.realworlddata.common.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogTracer {
    private static final String START_PREFIX = "-->";
    private static final String COMPLETE_PREFIX = "<--";
    private static final String EXCEPTION_PREFIX = "<X-";

    public TraceStatus begin(String message) {
        TraceId traceId = new TraceId();
        Long startTimeMillis = System.currentTimeMillis();
        log.info("[{}] {}{}", traceId.getId(), addSpace(START_PREFIX, traceId.getLevel()) ,message);
        return new TraceStatus(traceId, startTimeMillis, message);
    }

    public void end (TraceStatus traceStatus) {
        complete(traceStatus, null);
    }
    
    public void exception(TraceStatus traceStatus, Exception e) {
        complete(traceStatus, e);
    }

    private void complete(TraceStatus traceStatus, Exception e) {
        Long endTimeMillis = System.currentTimeMillis();
        long resultTimeMs = endTimeMillis - traceStatus.startTime();
    }

    private String addSpace(String prefix, int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append(i == level - 1 ? "|" + prefix : "| ");
        }
        return sb.toString();
    }
}

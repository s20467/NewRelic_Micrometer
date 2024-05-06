package org.example.newrelic_micrometer.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetricService {

    @Autowired
    MeterRegistry meterRegistry;

    public void recordCustom(int value) {
        Counter counter = meterRegistry.counter("Test_Counter1");
        counter.increment(value);
    }
}

package org.example.newrelic_micrometer.api;

import org.example.newrelic_micrometer.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metric")
public class MetricController {

    @Autowired
    MetricService metricService;

    @PostMapping("/record")
    public void recordCustom(@RequestParam("value") int value) {
        metricService.recordCustom(value);
    }

    @GetMapping()
    public String recordCustom() {
        return "works";
    }
}

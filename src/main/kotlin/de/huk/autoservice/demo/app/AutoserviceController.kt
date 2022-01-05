package de.huk.autoservice.demo.app

import io.micrometer.core.annotation.Counted
import io.micrometer.core.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AutoserviceController(val metricsRegistry: MetricsRegistry) {
    
    @GetMapping("/")
    @Timed("request_latency")
    @Counted("invocation_counter")
    fun index() : String{
        return "This is a test app."
    }
}
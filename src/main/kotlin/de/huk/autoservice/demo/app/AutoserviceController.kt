package de.huk.autoservice.demo.app

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AutoserviceController(val metricsRegistry: MetricsRegistry) {
    
    @GetMapping("/")
    fun index() : String {
        metricsRegistry.increaseInvocationCounter()
        return "This is a test app."
    }
}
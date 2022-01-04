package de.huk.autoservice.demo.app

import io.micrometer.core.instrument.Counter
import org.springframework.stereotype.Component
import io.micrometer.core.instrument.MeterRegistry;

@Component
class MetricsRegistry(meterRegistry: MeterRegistry) {

    var invocationCounter: Counter = meterRegistry.counter("invocation_counter")

    fun increaseInvocationCounter() {
        invocationCounter.increment()
    }
}
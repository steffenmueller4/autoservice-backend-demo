package de.huk.autoservice.demo.app

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.DistributionSummary
import org.springframework.stereotype.Component
import io.micrometer.core.instrument.MeterRegistry;
import java.util.*

@Component
class MetricsRegistry(meterRegistry: MeterRegistry) {

    var invocationCounter: Counter = meterRegistry.counter("invocation_counter")
    var requestLatency: DistributionSummary = meterRegistry.summary("request_latency")

    fun increaseInvocationCounter() {
        invocationCounter.increment()
    }

    fun recordLatency(random: Double) {
        requestLatency.record(random)
    }
}
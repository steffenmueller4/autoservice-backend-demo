package de.huk.autoservice.demo.app

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AutoserviceController {
    
    @GetMapping("/")
    fun index() : String {
        return "This is a test app."
    }
}
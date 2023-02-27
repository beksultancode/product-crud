package productcrud

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): Map<String, String> {
        return mutableMapOf(
            "status" to "UP",
            "health" to "OK"
        )
    }
}
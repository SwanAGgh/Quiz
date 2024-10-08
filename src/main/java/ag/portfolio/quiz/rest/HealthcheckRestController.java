package ag.portfolio.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthcheckRestController {

    /**
     * This is a simple healthcheck endpoint.
     * When accessed, it returns a string indicating that the application is up and running.
     */
    @GetMapping
    public String healthCheck() {
        return "Application is running";
    }
}
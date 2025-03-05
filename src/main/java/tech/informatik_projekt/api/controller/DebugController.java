package tech.informatik_projekt.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@RestController
public class DebugController {

    @Value("${MONGO_URI:NOT_SET}")
    private String mongoUri;

    @GetMapping("/v1/env")
    public String checkEnv() {
        System.out.println("MONGO_URI: " + mongoUri);
        return "MONGO_URI: " + mongoUri;
    }

}
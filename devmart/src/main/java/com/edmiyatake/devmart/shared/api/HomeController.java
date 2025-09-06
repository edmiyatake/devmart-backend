package com.edmiyatake.devmart.shared.api;

import com.edmiyatake.devmart.shared.dto.LandingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // GET /api/
    @GetMapping("/")
    public LandingResponse landing() {
        return new LandingResponse(
                "Welcome to DevMart!",
                "Your one-stop shop for resume skills.",
                "0.1.0"
        );
    }

    // GET /api/healthz (nice for uptime checks)
    @GetMapping("/healthz")
    public String health() {
        return "ok";
    }
}

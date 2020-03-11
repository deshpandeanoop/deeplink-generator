package com.github.deeplink.generator.controller;

import com.github.deeplink.generator.requests.DeepLinkGenerateRequest;
import com.github.deeplink.generator.response.DeepLinkGenerateResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.QueryParam;

@RestController
@RequestMapping("/shortLinks")
public class DeepLinkGenerateController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeepLinkGenerateController.class);
    private final RestTemplate restTemplate = new RestTemplate();
    private final String GOOGLE_FIRE_API_URL = "https://firebasedynamiclinks.googleapis.com/v1/shortLinks?key=";

    @PostMapping
    public DeepLinkGenerateResponse generate(@QueryParam("apiKey") final String apiKey,
                                             @RequestBody DeepLinkGenerateRequest request){
        LOGGER.info("Received request {}", request);
        LOGGER.info("API key {}", apiKey);
        return restTemplate.postForEntity(GOOGLE_FIRE_API_URL+apiKey, request, DeepLinkGenerateResponse.class).getBody();
    }
}

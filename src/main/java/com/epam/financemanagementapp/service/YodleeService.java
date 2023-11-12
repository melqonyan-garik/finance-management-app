package com.epam.financemanagementapp.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;

@Service
public class YodleeService {

    @Value("${yodlee.api-key}")
    private String apiKey;

    @Value("${yodlee.api-secret}")
    private String apiSecret;

    @Value("${yodlee.base-url}")
    private String baseUrl;

    public String getUserAccounts(String userSessionToken) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Api-Version", "1.1");
        headers.set("Cobrand-Name", apiKey);
        headers.set("Authorization", "Bearer " + userSessionToken);

        // Customize this URL according to Yodlee's API documentation
        String url = baseUrl + "/v1/accounts";

        RequestEntity<String> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(url));
        return restTemplate.exchange(requestEntity, String.class).getBody();
    }
}

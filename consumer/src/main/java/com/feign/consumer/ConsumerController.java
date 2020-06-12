package com.feign.consumer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/consumer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConsumerController {
    private ConsumerClient consumerClient;
    public ConsumerController(ConsumerClient consumerClient) {
        this.consumerClient = consumerClient;
    }

    @GetMapping("getMemberName")
    public String getMemberName(int id) {
        return consumerClient.member(id);
    }
}

package com.feign.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "member-client", url = "http://localhost:9090/api/v1/provider/")
public interface ConsumerClient {

    @GetMapping("member/{id}")
    String member(@PathVariable("id") int id);

}

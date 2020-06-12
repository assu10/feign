package com.feign.provider.provider;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/provider", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProviderController {

    @GetMapping("member/{id}")
    public String member(@PathVariable("id") int id) {

        // TODO: 회원 id 에 따른 이름 구하는 로직 구현

        String memberName = "LEE";

        return memberName;
    }

}

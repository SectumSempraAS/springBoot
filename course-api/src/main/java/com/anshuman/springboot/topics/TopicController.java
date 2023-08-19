package com.anshuman.springboot.topics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @RequestMapping("/topic")
    public List<Topic> giveTopic() {
        return Arrays.asList(
            new Topic("11", "Anil", "in delhi"),
            new Topic("12", "anshuman", "in bengaluru"),
            new Topic("13", "Anumit", "in New york")
            );
    }
}

package com.anshuman.springboot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topicLists = Arrays.asList(
            new Topic("11", "Anil1", "in delhi"),
            new Topic("12", "anshuman", "in bengaluru"),
            new Topic("13", "Anumit", "in New york")
            );

    public List<Topic> getAllTopics() {
        return topicLists;
    }

    public Topic getTopic(String id) {
        return topicLists.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}

// a business service (singleton) created which will help spring register a instance 
// of this class which can be used by controllers or other services.

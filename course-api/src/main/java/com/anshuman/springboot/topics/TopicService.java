package com.anshuman.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topicLists = new ArrayList<>(Arrays.asList(
            new Topic("11", "Anil1", "in delhi"),
            new Topic("12", "anshuman", "in bengaluru"),
            new Topic("13", "Anumit", "in New york")
            ));

    public List<Topic> getAllTopics() {
        return topicLists;
    }

    public Topic getTopic(String id) {
        return topicLists.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        int currentLength = topicLists.size();
        topicLists.add(currentLength, topic);
    }

    public void updateTopic(Topic newTopic, String id) {
        for (int i = 0 ; i < topicLists.size() ; i++) {
            Topic t = topicLists.get(i);
            if (t.getId().equals(id)) {
                topicLists.set(i, newTopic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topicLists.removeIf(t -> t.getId().equals(id));
    }
}

// a business service (singleton) created which will help spring register a instance 
// of this class which can be used by controllers or other services.

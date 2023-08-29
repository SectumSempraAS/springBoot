package com.anshuman.springboot.courseapidata.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topicLists.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic newTopic, String id) {
        topicRepository.save(newTopic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}

// a business service (singleton) created which will help spring register a instance 
// of this class which can be used by controllers or other services.

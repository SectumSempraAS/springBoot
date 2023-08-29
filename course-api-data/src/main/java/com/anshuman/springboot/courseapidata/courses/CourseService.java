package com.anshuman.springboot.courseapidata.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        //return topicLists.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }

    public void updateCourse(Course newCourse) {
        courseRepository.save(newCourse);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

// a business service (singleton) created which will help spring register a instance 
// of this class which can be used by controllers or other services.

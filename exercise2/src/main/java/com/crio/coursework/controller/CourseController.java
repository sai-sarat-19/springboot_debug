package com.crio.coursework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.crio.coursework.entities.Course;
import com.crio.coursework.services.CourseService;

@RestController
public class CourseController {
    
    private CourseService courseService;

    public CourseController(){
        this.courseService = new CourseService();
    }
    private final Logger logger = LoggerFactory.getLogger(CourseController.class);
    //POST
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        logger.info("Course object {}", course.toString());
        return courseService.saveCourse(course);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return courseService.saveCourses(courses);
    }

    //GET
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }
    @GetMapping("/courseById/{id}")
    public Course findCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
    @GetMapping("/courseByName/{name}")
    public Course findCourseByName(@PathVariable String name) {
        return courseService.getCourseByName(name);
    }
    @GetMapping("/listCourseByUsername/{username}")
    public List<Course> findCoursesByUsername(@PathVariable String username) {
        return courseService.getCoursesForUser(username);
    }

    //PUT
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course)
    {
        System.out.println("UPDATED");
        return courseService.updateCourse(course);
    }


    //DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }

}

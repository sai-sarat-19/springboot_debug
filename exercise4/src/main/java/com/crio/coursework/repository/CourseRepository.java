package com.crio.coursework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.crio.coursework.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findByName(String name);

    List<Course> findAllByUsername(String username);
}

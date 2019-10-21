package com.cms.coursemanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.coursemanagement.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}

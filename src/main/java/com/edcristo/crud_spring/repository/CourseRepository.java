package com.edcristo.crud_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edcristo.crud_spring.model.CourseModel;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {

}

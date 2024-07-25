package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tati.classes_platform.domain.entities.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

}

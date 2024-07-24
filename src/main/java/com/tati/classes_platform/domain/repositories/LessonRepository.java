package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LessonRepository extends JpaRepository<LessonRepository, Long> {

}

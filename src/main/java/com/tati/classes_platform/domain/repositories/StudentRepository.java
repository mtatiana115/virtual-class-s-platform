package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tati.classes_platform.domain.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

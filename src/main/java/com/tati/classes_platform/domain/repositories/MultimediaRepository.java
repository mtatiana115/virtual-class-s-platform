package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tati.classes_platform.domain.entities.Multimedia;

public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {

}

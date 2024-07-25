package com.tati.classes_platform.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tati.classes_platform.api.dto.request.StudentRequest;
import com.tati.classes_platform.api.dto.response.StudentResponseDetails;
import com.tati.classes_platform.api.dto.response.responseBasic.StudentResponse;
import com.tati.classes_platform.domain.repositories.StudentRepository;
import com.tati.classes_platform.infrastructure.abstract_services.IStudentService;
import com.tati.classes_platform.infrastructure.mappers.StudentMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

  @Autowired
  private final StudentRepository studentRepository;

  @Autowired
  private final StudentMapper studentMapper;

  @Override
  public Page<StudentResponseDetails> findAllByName(Pageable pageable, String name) {
    return studentRepository.findAllByIsActiveTrueAndNameContaining(pageable, name)
        .map(studentMapper::entityToResponseDetails);
  }

  @Override
  public StudentResponse create(StudentRequest rq) {
    return studentMapper.entityToResponse(studentRepository.save(studentMapper.requestToEntity(rq)));
  }

}

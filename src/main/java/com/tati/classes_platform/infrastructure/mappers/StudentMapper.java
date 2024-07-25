package com.tati.classes_platform.infrastructure.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.tati.classes_platform.api.dto.response.StudentResponseDetails;
import com.tati.classes_platform.domain.entities.Student;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {

  StudentResponseDetails entityToResponseDetails(Student student);

  List<StudentResponseDetails> entityToResponseDetailsList(List<Student> students);

}

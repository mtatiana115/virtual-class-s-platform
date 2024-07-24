package com.tati.classes_platform.api.dto.response;

import java.util.List;

import com.tati.classes_platform.api.dto.response.responseBasic.LessonResponse;
import com.tati.classes_platform.api.dto.response.responseBasic.StudentResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
// Entidad fuerte poner listas con response sencillo
public class ClassResponseDetails {

  private Long id;

  private String name;

  private String description;

  private String createdAt;

  private Boolean isActive;

  private List<StudentResponse> students;

  private List<LessonResponse> lessons;

}

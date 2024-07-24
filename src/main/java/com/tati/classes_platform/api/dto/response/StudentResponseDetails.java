package com.tati.classes_platform.api.dto.response;

import com.tati.classes_platform.api.dto.response.responseBasic.ClassResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDetails {

  private Long id;

  private String name;

  private String email;

  private Boolean isActive;

  private ClassResponse classEntity;
}

package com.tati.classes_platform.api.dto.response.responseBasic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse {
  private Long id;

  private String title;

  private String content;

  private String createdAt;

  private Boolean isActive;
}

package com.tati.classes_platform.api.dto.response;

import com.tati.classes_platform.api.dto.response.responseBasic.LessonResponse;
import com.tati.classes_platform.util.enums.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaResponseDetails {

  private Long id;

  private String url;

  private Type type;

  private Boolean isActive;

  private LessonResponse lesson;

}
